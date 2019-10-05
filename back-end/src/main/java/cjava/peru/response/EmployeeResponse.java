package cjava.peru.response;

import java.time.LocalDate;


public class EmployeeResponse {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate birthdate;
	private Long areaId;
	private String areaName;
	private Long cargoId;
	private String cargoName;
	
	
	
	public EmployeeResponse() {
		super();
	}
	public EmployeeResponse(Long id, String firstName, String lastName, String email, LocalDate birthdate, Long areaId,
			String areaName, Long cargoId, String cargoName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthdate = birthdate;
		this.areaId = areaId;
		this.areaName = areaName;
		this.cargoId = cargoId;
		this.cargoName = cargoName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public Long getAreaId() {
		return areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public Long getCargoId() {
		return cargoId;
	}
	public void setCargoId(Long cargoId) {
		this.cargoId = cargoId;
	}
	public String getCargoName() {
		return cargoName;
	}
	public void setCargoName(String cargoName) {
		this.cargoName = cargoName;
	}
	
	
}
