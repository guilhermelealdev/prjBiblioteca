package com.guilhermef.proj.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="db_livro")
public class Livro {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idLivro;
	private String titulo;
	private String autor;
	private String editora;
	private String isbn;
	
	//construtor vazio
	public Livro() {
		
	}
	
	//construtor padrão
	public Livro(long idLivro, String titulo, String autor, String editora, String isbn) {
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.isbn = isbn;
	}
	
	//métodos getters e setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public long getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(long idLivro) {
		this.idLivro = idLivro;
	}
	
}
