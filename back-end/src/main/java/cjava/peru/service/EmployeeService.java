package cjava.peru.service;

import java.util.List;


import org.springframework.data.domain.Pageable;

import cjava.peru.entity.Employee;
import cjava.peru.request.EmployeeRequest;
import cjava.peru.response.EmployeeResponse;

public interface EmployeeService {
	
	public Employee create(EmployeeRequest employee);

	public Employee find(Long id);

	public List<EmployeeResponse> findAll(Pageable page);

	public Employee update(EmployeeRequest employee, Long employeeId);

	public void delete(Long id);;

}
