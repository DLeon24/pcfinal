package cjava.peru.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cjava.peru.entity.Cargo;
import cjava.peru.service.CargoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CargoController {

	@Autowired
	private CargoService cargoService;

	@GetMapping("/position/{areaId}")
	public List<Cargo> findAll(@PathVariable(name = "areaId") Long id) {
		return cargoService.findByArea(id);
	}

}
