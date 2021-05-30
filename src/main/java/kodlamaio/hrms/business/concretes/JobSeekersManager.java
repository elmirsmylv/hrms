package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.core.utilities.adapters.abstracts.VerificationService;
import kodlamaio.hrms.business.abstracts.JobSeekersService;
import kodlamaio.hrms.core.utilities.adapters.concretes.MernisCheckService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekersDao;
import kodlamaio.hrms.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekersManager implements JobSeekersService {

    @Autowired
    private JobSeekersDao jobSeekersDao;

    public JobSeekersManager(JobSeekersDao jobSeekersDao) {
        this.jobSeekersDao = jobSeekersDao;
    }

//    public JobSeekersManager(JobSeekerCheckService jobSeekerCheckService){
//        this.jobSeekerCheckService = jobSeekerCheckService;
//    }


    @Override
    public Results add(JobSeekers jobSeekers) {

        if(this.jobSeekersDao.findByNationalityId(jobSeekers.getNationalityId()) != null || this.jobSeekersDao.findByEmail(jobSeekers.getEmail()) != null){
            return new ErrorResult("Email or nationality id already exist");
        }else{
            this.jobSeekersDao.save(jobSeekers);
            return new SuccessResult("Kullanici Eklendi!");
        }

//        this.jobSeekersDao.save(jobSeekers);
//        return new SuccessResult("Kullanici Eklendi!");
    }

    @Override
    public DataResult<List<JobSeekers>> getAll(){

        return new SuccessDataResults<List<JobSeekers>>(this.jobSeekersDao.findAll(), "Data listelendi");

    }
}
