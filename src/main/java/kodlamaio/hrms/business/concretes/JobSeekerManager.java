package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.adapters.abstracts.VerificationService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekersDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekersDao jobSeekersDao;
    private VerificationService verificationService;

    @Autowired
    public JobSeekerManager(JobSeekersDao jobSeekersDao, VerificationService verificationService) {
        super();
        this.jobSeekersDao = jobSeekersDao;
        this.verificationService = verificationService;
    }


    @Override
    public Results add(JobSeeker jobSeeker) {

        if(this.jobSeekersDao.findByNationalityId(jobSeeker.getNationalityId()) != null || this.jobSeekersDao.findByEmail(jobSeeker.getEmail()) != null){
            return new ErrorResult("Email or nationality id already exist");
        }
        else if(jobSeeker.getFirstName().isEmpty() || jobSeeker.getLastName().isEmpty() || jobSeeker.getBirthDate() == null || jobSeeker.getEmail().isEmpty() || jobSeeker.getPassword().isEmpty()){
            return new ErrorResult("Please fill all fields");
        }
        else if(verificationService.checkIfRealPerson(jobSeeker) != true){
            return new ErrorResult("Invalid person");
        }else{
            this.jobSeekersDao.save(jobSeeker);
            return new SuccessResult("User added!");
        }



    }

    @Override
    public DataResult<List<JobSeeker>> getAll(){

        return new SuccessDataResults<List<JobSeeker>>(this.jobSeekersDao.findAll(), "Data listed");

    }
}
