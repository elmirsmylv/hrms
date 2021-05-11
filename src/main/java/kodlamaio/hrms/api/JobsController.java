package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

    JobService jobService;

    @Autowired
    public JobsController(JobService jobService) {
        this.jobService = jobService;
    }



    @GetMapping("/getall")
    public List<Job> getAll(){
        return this.jobService.getAll();
    }
}
