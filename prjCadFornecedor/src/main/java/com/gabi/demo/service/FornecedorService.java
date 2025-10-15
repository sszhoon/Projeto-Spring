package com.gabi.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabi.demo.fornecedor.Fornecedor;
import com.gabi.demo.repository.FornecedorRepository;

@Service
public class FornecedorService {
	private final FornecedorRepository fornecedorRepository;
	
	@Autowired
	public FornecedorService(FornecedorRepository fornecedorRepository) {
		this.fornecedorRepository = fornecedorRepository;
	}
	public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}
	public Fornecedor getFornecedorById(Integer id) {
		return fornecedorRepository.findById(id).orElse(null);
	}
	public List<Fornecedor> getAllFornecer() {
		return fornecedorRepository.findAll();
	}
	public void deletarFornecer(Integer id) {
		fornecedorRepository.deleteById(id);
	}
}