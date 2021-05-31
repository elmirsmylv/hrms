package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekersDao extends JpaRepository<JobSeeker,Integer> {
    JobSeeker findByEmail(String email);
    JobSeeker findByNationalityId (long nationalityId);
}