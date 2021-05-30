package kodlamaio.hrms.core.utilities.adapters.abstracts;

import kodlamaio.hrms.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public interface VerificationService {
    boolean checkIfRealPerson(JobSeekers jobSeeker);
}
