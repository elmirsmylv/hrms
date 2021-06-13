package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Results;
import kodlamaio.hrms.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Results add(Employee employee);
}
