package com.farmacia.Farma.repository;

	import java.util.List;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.farmacia.Farma.modal.Categoria;

	@Repository
	public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{
		List<Categoria> findAllByDepartamentoContainingIgnoreCase (String departamento);
}
