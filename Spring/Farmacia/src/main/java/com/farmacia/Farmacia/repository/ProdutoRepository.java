package com.farmacia.Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.farmacia.Farmacia.modal.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {
public List<Produto> findAllByProdutoContainingIgnoreCase(String produto);
}
