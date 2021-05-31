package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Results;
import kodlamaio.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
     Results add(JobSeeker jobSeeker);
     DataResult<List<JobSeeker>> getAll();
}
