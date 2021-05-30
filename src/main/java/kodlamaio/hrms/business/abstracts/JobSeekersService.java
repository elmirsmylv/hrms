package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Results;
import kodlamaio.hrms.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

public interface JobSeekersService {
     Results add(JobSeekers jobSeeker);
     DataResult<List<JobSeekers>> getAll();
}
