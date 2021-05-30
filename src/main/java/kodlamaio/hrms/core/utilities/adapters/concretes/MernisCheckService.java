package kodlamaio.hrms.core.utilities.adapters.concretes;

import kodlamaio.hrms.core.utilities.adapters.abstracts.VerificationService;
import kodlamaio.hrms.entities.concretes.JobSeekers;

public class MernisCheckService implements VerificationService {


    @Override
    public boolean checkIfRealPerson(JobSeekers jobSeeker) {
        return true;
    }
}
