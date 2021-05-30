package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobSeekers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobSeekersDao extends JpaRepository<JobSeekers,Integer> {
    JobSeekers findByEmail(String email);
    JobSeekers findByNationalityId (long nationalityId);
}