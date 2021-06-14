package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Results;
import kodlamaio.hrms.entities.concretes.Company;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/job_advertisements")
@RestController
public class JobAdvertisementController {
    JobAdvertisementService jobAdvertisementService;

    public JobAdvertisementController(JobAdvertisementService jobAdvertisementService){
        this.jobAdvertisementService = jobAdvertisementService;
    }

    @GetMapping("/get_all")
    public DataResult<List<JobAdvertisement>> getAll(){
        return this.jobAdvertisementService.getAll();
    }

    @GetMapping("/get_active_adverts")
    public DataResult<List<JobAdvertisement>> getActiveAdverts(){
        return this.jobAdvertisementService.getActiveAdverts();
    }

    @GetMapping("get_all_sorted_desc")
    public DataResult<List<JobAdvertisement>> getAllSortedByDate(){
        return this.jobAdvertisementService.getAllSortedByDate();
    }

    @PostMapping("/add")
    public Results add(@RequestBody JobAdvertisement jobAdvertisement){
        return this.jobAdvertisementService.add(jobAdvertisement);
    }


    @GetMapping("/get_by_advert_id_and_company_id")
    public DataResult<List<JobAdvertisement>> getByJobAdvertIdAndCompanyId(@RequestParam int jobAdvertId,@RequestParam int companyId){
        return this.jobAdvertisementService.getByIdAndCompanyId(jobAdvertId,companyId);
    }

    @GetMapping("/get_by_company")
    public DataResult<List<JobAdvertisement>> getByCompanyId(@RequestParam int companyId){
        return this.jobAdvertisementService.getByCompanyIdAndActive(companyId,true);
    }



}
