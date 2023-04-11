package com.hitachi.jpaCrud.repository;

import com.hitachi.jpaCrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByFirstName(String firstName);

    List<Employee> findByLastNameIgnoreCase(String name);

    List<Employee> findByFirstNameOrLastName(String firstName, String lastName);

    List<Employee> findByFirstNameAndLastName(String firstName, String lastName);
}
