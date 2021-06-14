package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

    JobAdvertisementDao jobAdvertisementDao;

    @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao){
        this.jobAdvertisementDao = jobAdvertisementDao;
    }


    @Override
    public Results add(JobAdvertisement jobAdvertisement) {
        this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("Job advertisement added!");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResults<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"Data listed");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllSortedByDate() {
        Sort sort = Sort.by(Sort.Direction.DESC,"createdAt");
        return new SuccessDataResults<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(sort), "Sorted by date ASC");
    }

    public DataResult<List<JobAdvertisement>> getActiveAdverts(){
        return new SuccessDataResults<List<JobAdvertisement>>(this.jobAdvertisementDao.getByActive(true),"Active adverts listed");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByIdAndCompanyId(int jobAdvertId, int companyId) {
        return new SuccessDataResults<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIdAndCompany_Id(jobAdvertId,companyId),"Data listed");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByCompanyIdAndActive(int companyId,boolean active) {
        return new SuccessDataResults<List<JobAdvertisement>>(this.jobAdvertisementDao.getByCompany_IdAndActive(companyId,active),"Listed by company");
    }

}
