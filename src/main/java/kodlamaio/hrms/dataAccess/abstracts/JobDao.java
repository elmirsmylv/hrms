package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDao extends JpaRepository<JobTitle,Integer> {
    JobTitle findByJobTitle(String jobTitle);
}
