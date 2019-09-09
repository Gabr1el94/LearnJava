package com.br.gabrieldev;

import java.util.ArrayList;
import java.util.List;

public class Teste{
	
	 @SuppressWarnings("unused")
	public static void main(String[] args) {
		 
		 List<Pessoa> listPessoas = new ArrayList<Pessoa>();
		 listPessoas = adicionarPessoas();
		 Pessoa pessoaSelecionado = buscarPessoa(listPessoas,"Arthur");
	     pessoaSelecionado.setNome("Gabriel");
	     pessoaSelecionado.setIdade(40);
	     //Atualizar usuário
	     updatePessoa(listPessoas,pessoaSelecionado);
	     
	     //Remover usuário
	     removePessoa(listPessoas,pessoaSelecionado);
	 }

	private static void removePessoa(List<Pessoa> listPessoas, Pessoa pessoaSelecionado) {
		// TODO Auto-generated method stub
		for (Pessoa pessoa : listPessoas) {
			if (pessoa.getId().equals(pessoaSelecionado.getId())) {
				listPessoas.remove(pessoa);
				break;
			}
		}
	}

	private static void updatePessoa(List<Pessoa> listPessoas, Pessoa pessoaSelecionado) {
		// TODO Auto-generated method study
		int i = 0;
		for (Pessoa pessoa : listPessoas) {
			 if (pessoaSelecionado.getId().equals(pessoa.getId())) {
				  listPessoas.set(i, pessoaSelecionado);
				  break;
			  }
			 i++;
		}
	}

	private static Pessoa buscarPessoa(List<Pessoa> listPessoas,String nomePessoa) {
		// TODO Auto-generated method stub
		for (Pessoa pessoa : listPessoas) {
			if (pessoa.getNome().equals(nomePessoa)) {
				return pessoa;
			}
		}
		return null;
	}

	private static List<Pessoa> adicionarPessoas() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		 Pessoa pessoa = new Pessoa("Lucas", 11);
		 pessoas.add(pessoa);
		 pessoa = new Pessoa("Kátia", 50);
		 pessoas.add(pessoa);
		 pessoa = new Pessoa("Arthur", 15);
		 pessoas.add(pessoa);
		 pessoa = new Pessoa("Otávio", 18);
		 pessoas.add(pessoa);
		 return pessoas;
	}
	
}
