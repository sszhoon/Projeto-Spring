package com.gabi.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gabi.demo.fornecedor.Fornecedor;
import com.gabi.demo.service.FornecedorService;

@RestController
@RequestMapping ("/fornecedor")
public class FornecedorController {
	private final FornecedorService fornecedorService;
	
	@Autowired
	public FornecedorController(FornecedorService fornecedorService) {
		this.fornecedorService = fornecedorService;

	}
	@PostMapping
	public Fornecedor criarFornecedor(@RequestBody Fornecedor fornecedor) {
		return fornecedorService.salvarFornecedor(fornecedor);
	}
	@GetMapping("/{id}")
	public Fornecedor buscaFornecedorPorId(@PathVariable Integer id) {
		return fornecedorService.getFornecedorById(id);
	}

	@GetMapping
	public List<Fornecedor> listarTodosFornecedores() {
		return fornecedorService.getAllFornecer();
	}
	@DeleteMapping("/{id}")
	public void deleFornecedor(@PathVariable Integer id) {
		fornecedorService.deletarFornecer(id);
	}
}