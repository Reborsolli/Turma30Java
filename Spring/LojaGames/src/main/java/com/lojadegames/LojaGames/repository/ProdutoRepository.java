package com.lojadegames.LojaGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojadegames.LojaGames.model.Produto;



public interface ProdutoRepository  extends JpaRepository <Produto, Long>{
	public List<Produto> findAllByJogoContainingIgnoreCase(String jogo );
	
	

}
