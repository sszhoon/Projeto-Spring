package com.gabi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gabi.demo.fornecedor.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {
}