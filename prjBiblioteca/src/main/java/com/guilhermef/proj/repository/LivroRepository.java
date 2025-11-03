package com.guilhermef.proj.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilhermef.proj.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
	
	//criação de Querys
	

}
