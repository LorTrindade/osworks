package com.trindade.osworks.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trindade.osworks.domain.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	List<Cliente> findByNome(String nome);
	List<Cliente> findByNomeContaining(String nome);
	Cliente findByEmail(String email);

}
