package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobTitles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDao extends JpaRepository<JobTitles,Integer> {

}
