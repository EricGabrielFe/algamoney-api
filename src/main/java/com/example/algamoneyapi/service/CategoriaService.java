package com.example.algamoneyapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.algamoneyapi.model.Categoria;
import com.example.algamoneyapi.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	 
	public Optional<Categoria> buscaCategoriaPorId(Long id) {
		
		return categoriaRepository.findById(id);
		
	}
}
