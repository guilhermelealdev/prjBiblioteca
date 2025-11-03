package com.guilhermef.proj.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilhermef.proj.entities.Livro;
import com.guilhermef.proj.services.LivroService;

@RestController
@RequestMapping("/livro")
public class LivroController {
	
	private final LivroService livroService;

	public LivroController(LivroService livroService) {
		this.livroService = livroService;
	}
	
	@PostMapping
	public Livro criarLivro(@RequestBody Livro livro) {
		return livroService.saveLivro(livro);
	}
	
	@GetMapping("/{idLivro}")
	public Livro getLivroById(@PathVariable Long idLivro) {
		return livroService.getLivroById(idLivro);
	}
	
	@DeleteMapping("/{idLivro}")
	public void deleteLivroById(@PathVariable Long idLivro) {
		livroService.deletarLivro(idLivro);
	}
	
	public List<Livro> listarLivros(){
		return livroService.listarLivros();
	}
	
	
	

}
