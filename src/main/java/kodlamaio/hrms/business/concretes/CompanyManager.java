package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CompanyService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.CompanyDao;
import kodlamaio.hrms.entities.concretes.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyManager implements CompanyService {

    @Autowired
    CompanyDao companyDao;
    public CompanyManager(CompanyDao companyDao){
        this.companyDao = companyDao;
    }

    @Override
    public Results add(Company company) {
        if(this.companyDao.findByEmail(company.getEmail()) != null){
            return new ErrorResult("Email already exist.");
        }else{
            this.companyDao.save(company);
            return new SuccessResult("Company added.");
        }
    }


    @Override
    public DataResult<List<Company>> getAll() {
        return new SuccessDataResults<List<Company>>(this.companyDao.findAll(), "Data listed");
    }
}
