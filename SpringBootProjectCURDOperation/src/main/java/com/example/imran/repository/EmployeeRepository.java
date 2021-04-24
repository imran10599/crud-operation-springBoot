package com.example.imran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.imran.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
