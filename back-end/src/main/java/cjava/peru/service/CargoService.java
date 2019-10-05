package cjava.peru.service;

import java.util.List;

import cjava.peru.entity.Cargo;

public interface CargoService {

	public List<Cargo> findByArea(Long id);
	
	public Cargo findById(Long id);
}
