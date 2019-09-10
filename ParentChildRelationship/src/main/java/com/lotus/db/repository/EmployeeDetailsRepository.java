package com.lotus.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lotus.db.entity.EmployeeDetails;

/**
 * This is used for DataBase Operations
 * 
 * @author Santosh
 *
 */
@Repository
public interface EmployeeDetailsRepository extends CrudRepository<EmployeeDetails, Long> {

}//interface
