package br.com.fiap.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AGENDA")
public class Agenda {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IDAGENDA")
	private int id;
	
	@Column(name = "DATA")
	private LocalDateTime data;
	
	@Column(name = "HORA")
	private LocalDateTime hora;
	
	@Column(name = "DESCRICAO")
	private String descricao;

	public LocalDateTime getHora() {
		return hora;
	}

	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
