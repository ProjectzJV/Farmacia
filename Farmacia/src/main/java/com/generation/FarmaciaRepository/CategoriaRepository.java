package com.generation.FarmaciaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.FarmaciaModel.Categoria;

	public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
		public List<Categoria> findAllByCategoriaContainingIgnoreCase(String categoria);

	}
