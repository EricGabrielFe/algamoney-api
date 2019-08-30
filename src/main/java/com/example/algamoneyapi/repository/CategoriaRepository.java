package com.example.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.algamoneyapi.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria , Long>{

	//public Categoria findById(int codigo);

}
