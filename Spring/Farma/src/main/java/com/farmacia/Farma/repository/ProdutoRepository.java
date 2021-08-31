package com.farmacia.Farma.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.Farma.modal.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{
public List<Produto> findAllByProdutoContainingIgnoreCase (long produto);
}


