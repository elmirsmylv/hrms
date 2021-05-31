package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.core.utilities.results.Results;
import kodlamaio.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

    JobService jobService;

    @Autowired
    public JobsController(JobService jobService) {
        this.jobService = jobService;
    }



    @GetMapping("/get_all")
    public List<JobTitle> getAll(){
        return this.jobService.getAll();
    }

    @PostMapping("/add")
    public Results add(@RequestBody JobTitle jobTitle){
        return this.jobService.add(jobTitle);
    }
}
