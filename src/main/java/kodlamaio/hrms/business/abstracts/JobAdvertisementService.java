package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Results;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

import java.util.List;

public interface JobAdvertisementService {
    Results add(JobAdvertisement jobAdvertisement);
    DataResult<List<JobAdvertisement>> getAll();
    DataResult<List<JobAdvertisement>> getAllSortedByDate();
    DataResult<List<JobAdvertisement>> getActiveAdverts();
    DataResult<List<JobAdvertisement>> getByIdAndCompanyId(int jobAdvertId, int companyId);
    DataResult<List<JobAdvertisement>> getByCompanyIdAndActive(int companyId,boolean active);


}
