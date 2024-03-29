package cjava.peru.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cjava.peru.entity.Area;
import cjava.peru.repository.AreaRepository;
import cjava.peru.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService{

	@Autowired
	private AreaRepository areaRepository;
	
	@Override
	public List<Area> findAll() {
		return areaRepository.findAll();
	}

}
