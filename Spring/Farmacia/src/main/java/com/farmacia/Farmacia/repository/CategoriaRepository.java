package com.farmacia.Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.Farmacia.modal.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{
	List<Categoria> findAllByDepartamentoContainingIgnoreCase (String departamento);

}
