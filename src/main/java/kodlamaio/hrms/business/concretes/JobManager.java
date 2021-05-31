package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Results;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobDao;
import kodlamaio.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {

    JobDao jobDao;

    @Autowired
    public JobManager(JobDao jobDao){
        this.jobDao = jobDao;
    }

    public List<JobTitle> getAll(){
        return this.jobDao.findAll() ;
    }

    public Results add(JobTitle jobTitle){
        if(this.jobDao.findByJobTitle(jobTitle.getJobTitle()) != null){
            return new ErrorResult("Job already exist");
        }else{
        this.jobDao.save(jobTitle);
        return new SuccessResult("Job successfully added");
        }
    }
}
