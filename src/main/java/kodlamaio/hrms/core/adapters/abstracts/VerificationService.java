package kodlamaio.hrms.core.adapters.abstracts;

import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface VerificationService {
    boolean checkIfRealPerson(JobSeeker jobSeeker);
    boolean domainControl(String email, String website);
}
