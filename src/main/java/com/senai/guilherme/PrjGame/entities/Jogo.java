package com.senai.guilherme.PrjGame.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Jogo")
public class Jogo {
	// Id , name ,plataforma

	// atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;

	private String plataform;

	// construtor vazio
	public Jogo() {

	}

	// construtor com parametros
	public Jogo(Long id, String name, String plataform) {
		super();
		this.id = id;
		this.name = name;
		this.plataform = plataform;
	}

	// método de acesso
	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	// método de acesso
	public String getname() {
		return name;
	}

	public void setncliente(String name) {
		this.name = name;
	}

	// método de acesso
	public String getplataform() {
		return plataform;
	}

	public void setfone(String plataform) {
		this.plataform = plataform;
	}

}
