package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Results;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job_seekers")
public class JobSeekerController {

    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekerController(JobSeekerService jobSeekerService){
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping("/get_all")
    public DataResult<List<JobSeeker>> getAll(){
        return this.jobSeekerService.getAll();
    }

    @PostMapping("/add")
    public Results add(@RequestBody JobSeeker jobSeeker){
        return this.jobSeekerService.add(jobSeeker);
    }



}
