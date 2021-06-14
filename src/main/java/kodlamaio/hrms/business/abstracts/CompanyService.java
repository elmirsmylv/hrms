package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Results;
import kodlamaio.hrms.entities.concretes.Company;

import java.util.List;

public interface CompanyService {
    Results add(Company company);
    DataResult<List<Company>> getAll();
    DataResult<Company> getById(int companyId);
    DataResult<Company> getByIdAndJobAdvertisements_Id(int companyId, int jobAdvertId);
}
