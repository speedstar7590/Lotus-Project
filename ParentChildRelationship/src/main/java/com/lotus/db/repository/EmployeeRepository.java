package com.lotus.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lotus.db.entity.Employee;

/**
 * This is used for DataBase Operations
 * 
 * @author Santosh
 *
 */

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}//interface
