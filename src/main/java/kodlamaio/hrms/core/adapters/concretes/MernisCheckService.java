package kodlamaio.hrms.core.adapters.concretes;

import kodlamaio.hrms.core.adapters.abstracts.VerificationService;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import org.springframework.stereotype.Service;

@Service
public class MernisCheckService implements VerificationService {


    @Override
    public boolean checkIfRealPerson(JobSeeker jobSeeker) {
        return true;
    }
}
