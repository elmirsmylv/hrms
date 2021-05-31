package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.CompanyService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Results;
import kodlamaio.hrms.entities.concretes.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies/")
public class CompanyController {
    CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService){
        this.companyService = companyService;
    }

    @GetMapping("/get_all")
    public DataResult<List<Company>> getAll(){
        return this.companyService.getAll();
    }

    @PostMapping("/add")
    public Results add(@RequestBody Company company){
        return this.companyService.add(company);
    }

}
