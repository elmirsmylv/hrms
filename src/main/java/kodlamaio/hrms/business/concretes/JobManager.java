package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.dataAccess.abstracts.JobDao;
import kodlamaio.hrms.entities.concretes.JobTitles;
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

    public List<JobTitles> getAll(){
        return this.jobDao.findAll() ;
    }
}
