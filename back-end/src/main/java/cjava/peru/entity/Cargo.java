package cjava.peru.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "cargo")
public class Cargo {
	@Id
	private Long id;
	@Column(name = "name")
	private String name;
	@OneToOne
	@JoinColumn(name = "areaid")
	private Area area;
	
	public Cargo() {
		super();
	}
	
	
	public Cargo(Long id) {
		super();
		this.id = id;
	}


	public Cargo(Long id, String name, Area area) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}


	@Override
	public String toString() {
		return "Cargo [id=" + id + ", name=" + name + ", area=" + area + "]";
	}
	
	
	
}
