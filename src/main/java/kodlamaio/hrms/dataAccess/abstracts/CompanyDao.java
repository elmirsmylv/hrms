package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyDao extends JpaRepository<Company, Integer> {
    Company findByEmail(String email);
    Company getByIdAndJobAdvertisements_Id(int companyId, int jobAdvertId);
    Company getById(int companyId);
}
