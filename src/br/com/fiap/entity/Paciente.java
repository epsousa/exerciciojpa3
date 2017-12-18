package br.com.fiap.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PACIENTE")
public class Paciente {

	@Id
	private String cpf;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "DATA")
	private LocalDate dataNasc;
	
	@Column(name = "TELEFONE")
	private String telefone;
	
	@ManyToMany
	private List<Agenda> agendas;
	
	@ManyToOne
	private Procedimento procedimento;	
	
	@ManyToOne
	private Matmed matmeds;

	public List<Agenda> getAgendas() {
		return agendas;
	}

	public void setAgendas(List<Agenda> agendas) {
		this.agendas = agendas;
	}
	
	
	
	public Procedimento getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(Procedimento procedimento) {
		this.procedimento = procedimento;
	}

	public Matmed getMatmeds() {
		return matmeds;
	}

	public void setMatmeds(Matmed matmeds) {
		this.matmeds = matmeds;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
