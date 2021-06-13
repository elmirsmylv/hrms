package kodlamaio.hrms.core.adapters.concretes;

import kodlamaio.hrms.core.adapters.abstracts.VerificationService;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import org.springframework.stereotype.Service;


@Service
public class VerificationManager implements VerificationService {


    @Override
    public boolean checkIfRealPerson(JobSeeker jobSeeker) {
        return true;
    }

    @Override
    public boolean domainControl(String email, String website) {
        String newEmail = email.split("@")[1]; // info@facebook.com ["info", "facebook.com"]
        if(!newEmail.equals(website)){
            return false;
        }else{
            return true;
        }

    }
}
