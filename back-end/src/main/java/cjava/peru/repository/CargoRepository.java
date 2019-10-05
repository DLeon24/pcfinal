package cjava.peru.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cjava.peru.entity.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long>{

	public List<Cargo> findByAreaId(Long id);
}
