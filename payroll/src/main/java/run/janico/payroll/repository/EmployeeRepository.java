package run.janico.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import run.janico.payroll.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
