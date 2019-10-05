package cjava.peru.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cjava.peru.entity.Cargo;
import cjava.peru.repository.CargoRepository;
import cjava.peru.service.CargoService;

@Service
public class CargoServiceImpl implements CargoService{

	@Autowired
	private CargoRepository cargoRepository;

	@Override
	public List<Cargo> findByArea(Long id) {
		return cargoRepository.findByAreaId(id);
	}

	@Override
	public Cargo findById(Long id) {
		return cargoRepository.findById(id).get();
	}

}
