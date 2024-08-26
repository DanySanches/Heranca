package com.Dani.ExcercicioHeranca1;

public class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;

	// Construtor padrão
	public Pessoa() {
	}
	
	// Construtor com todos atibutos
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome ;
		this.setEndereco(endereco);
		this.telefone = telefone;
	}
	
	// Construtor com nome e telefone
		public Pessoa(String nome,  String telefone) {
			this.nome = nome;
			this.telefone = telefone;
		}
	
	
		
		//Gettes e Setters
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getTelefone() {
			return telefone;
		}
		
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		
		
}
