package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Results;
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

    @PostMapping("/add")
    public Results add(@RequestBody JobAdvertisement jobAdvertisement){
        return this.jobAdvertisementService.add(jobAdvertisement);
    }

    @GetMapping("/get_active_adverts")
    public DataResult<List<JobAdvertisement>> getActiveAdverts(){
        return this.jobAdvertisementService.getActiveAdverts();
    }



}
