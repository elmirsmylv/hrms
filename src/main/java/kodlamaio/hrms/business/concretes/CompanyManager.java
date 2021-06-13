package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CompanyService;
import kodlamaio.hrms.core.adapters.abstracts.VerificationService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.CompanyDao;
import kodlamaio.hrms.entities.concretes.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyManager implements CompanyService {

    @Autowired
    CompanyDao companyDao;
    PasswordEncoder passwordEncoder;
    private VerificationService verificationService;

    public CompanyManager(CompanyDao companyDao,VerificationService verificationService){
        this.passwordEncoder = new BCryptPasswordEncoder();
        this.companyDao = companyDao;
        this.verificationService = verificationService;
    }

    @Override
    public Results add(Company company) {

        if(this.companyDao.findByEmail(company.getEmail()) != null){
            return new ErrorResult("Email already exist.");
        }else if(!verificationService.domainControl(company.getEmail(), company.getWebsite())){
            return new ErrorResult("Email and Website not matches!");
        }else{
            company.setPassword(this.passwordEncoder.encode(company.getPassword()));
            this.companyDao.save(company);
            return new SuccessResult("Company added.");
        }

    }

    @Override
    public DataResult<List<Company>> getAll() {
        return new SuccessDataResults<List<Company>>(this.companyDao.findAll(), "Data listed");
    }
}
