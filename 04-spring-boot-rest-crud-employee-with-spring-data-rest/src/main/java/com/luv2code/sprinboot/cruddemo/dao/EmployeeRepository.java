package com.luv2code.sprinboot.cruddemo.dao;

import com.luv2code.sprinboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//we can change the path by adding this annotation
//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //that's it ... no need to write any code LOLOLOLOLOLOL!!!




}
