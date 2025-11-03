package com.guilhermef.proj.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.guilhermef.proj.entities.Livro;
import com.guilhermef.proj.repository.LivroRepository;

@Service
public class LivroService {
	
	private final LivroRepository livroRepository;

	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}
	
	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}
	
	public Livro getLivroById(Long idLivro) {
		return livroRepository.findById(idLivro).orElse(null);
	}
	
	public void deletarLivro(Long id) {
		livroRepository.deleteById(id);
	}
	
	public List<Livro> listarLivros(){
		return livroRepository.findAll();
	}
	
	
}
