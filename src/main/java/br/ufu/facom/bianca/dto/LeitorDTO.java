package br.ufu.facom.bianca.dto;

import java.io.Serializable;

import br.ufu.facom.bianca.domain.Leitor;

public class LeitorDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
	// Leitor para transferencia de dados 
	
	private Integer id;
	private String nome;
	private String email; 
	
	public LeitorDTO() {}

	public LeitorDTO(Leitor obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.email = obj.getEmail();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
