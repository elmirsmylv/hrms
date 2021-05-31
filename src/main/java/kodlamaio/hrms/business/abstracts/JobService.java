package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Results;
import kodlamaio.hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobService {
    List<JobTitle> getAll();
    Results add(JobTitle jobTitle);
}
