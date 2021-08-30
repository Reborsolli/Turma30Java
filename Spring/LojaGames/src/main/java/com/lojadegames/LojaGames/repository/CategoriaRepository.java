package com.lojadegames.LojaGames.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojadegames.LojaGames.model.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository < Categoria, Long> {
	List<Categoria> findAllByDescricaoContainingIgnoreCase  ( String descricao);
	

}
