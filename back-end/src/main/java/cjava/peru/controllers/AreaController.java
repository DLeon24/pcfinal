package cjava.peru.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cjava.peru.entity.Area;
import cjava.peru.service.AreaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AreaController {

	@Autowired
	private AreaService areaService;
	
	@GetMapping("/areas")
	public List<Area> findAll(){
		return areaService.findAll();
	}
}
