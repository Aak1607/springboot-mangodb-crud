package net.akhil.springboot.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.akhil.springboot.crud.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long>{

}
