package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.JobSeekersService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Results;
import kodlamaio.hrms.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job_seekers")
public class JobSeekersController {

    private JobSeekersService jobSeekersService;

    @Autowired
    public JobSeekersController(JobSeekersService jobSeekersService){
        this.jobSeekersService = jobSeekersService;
    }

    @GetMapping("/get_all")
    public DataResult<List<JobSeekers>> getAll(){
        return this.jobSeekersService.getAll();
    }

    @PostMapping("/add")
    public Results add(@RequestBody JobSeekers jobSeekers){
        return this.jobSeekersService.add(jobSeekers);
    }



}
