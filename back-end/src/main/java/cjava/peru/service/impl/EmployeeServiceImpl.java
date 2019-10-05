package cjava.peru.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cjava.peru.entity.Cargo;
import cjava.peru.entity.Employee;
import cjava.peru.exception.ResourceNotFoundException;
import cjava.peru.repository.EmployeeRepository;
import cjava.peru.request.EmployeeRequest;
import cjava.peru.response.EmployeeResponse;
import cjava.peru.service.CargoService;
import cjava.peru.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private CargoService cargoService;

	@Override
	public Employee create(EmployeeRequest request) {
		Employee object = new Employee(request.getFirstName(), request.getLastName(), request.getEmail(),
				request.getBirthdate(), request.getCargoId());
		return employeeRepository.save(object);
	}

	@Override
	public Employee find(Long id) {
		return employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
	}

	@Override
	public Employee update(EmployeeRequest request, Long employeeId) {
		Employee object = new Employee();
		Optional<Employee> optional = employeeRepository.findById(employeeId);
		if (optional.isPresent()) {
			object = optional.get();
			object.setFirstName(request.getFirstName());
			object.setLastName(request.getLastName());
			object.setEmail(request.getEmail());
			object.setBirthdate(request.getBirthdate());
			object.setCargoId(request.getCargoId());
			employeeRepository.save(object);
		}
		return object;
	}

	@Override
	public void delete(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public List<EmployeeResponse> findAll(Pageable pageable) {
		Page<Employee> pageResult = employeeRepository.findAll(pageable);
		if (pageResult.hasContent()) {
			return pageResult.getContent().stream().map(e -> {
				Cargo object = cargoService.findById(e.getCargoId());
				return new EmployeeResponse(e.getId(), e.getFirstName(), e.getLastName(), e.getEmail(),
						e.getBirthdate(), object.getArea().getId(), object.getArea().getName(), object.getId(),
						object.getName());
			}).collect(Collectors.toList());
		} else {
			return new ArrayList<EmployeeResponse>();
		}
	}

}
