package SIE.employeeSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SIE.employeeSystem.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long>{}
