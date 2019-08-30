package com.example.algamoneyapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.algamoneyapi.model.Pessoa;
import com.example.algamoneyapi.repository.PessoaRepository;

@Service
public class PessoaService {
	@Autowired
	PessoaRepository pessoaRepository;
	
	public Optional<Pessoa> buscaCategoriaPorId(Long id) {
		
		return pessoaRepository.findById(id);
		
	}

}
