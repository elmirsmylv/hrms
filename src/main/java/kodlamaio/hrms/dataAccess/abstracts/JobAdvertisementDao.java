package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
    List<JobAdvertisement> getByActive(boolean status);
    List<JobAdvertisement> getByIdAndCompany_Id(int jobAdvertId, int companyId);
    List<JobAdvertisement> getByCompany_IdAndActive(int companyId,boolean active);
}
