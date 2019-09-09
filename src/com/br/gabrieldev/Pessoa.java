package com.br.gabrieldev;

import java.util.UUID;

public class Pessoa {
	
	private UUID id;
	private String nome;
	private Integer idade;
	
	public Pessoa() {}
	
	public Pessoa(String nome, Integer idade) {
		this.id=UUID.randomUUID();
		this.nome=nome;
		this.idade=idade;
	}
	
	public UUID getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public Integer getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	
}
