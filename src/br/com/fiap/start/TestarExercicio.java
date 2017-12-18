package br.com.fiap.start;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Agenda;
import br.com.fiap.entity.Matmed;
import br.com.fiap.entity.Paciente;
import br.com.fiap.entity.Procedimento;


public class TestarExercicio {

	public static void main(String[] args) {
		Paciente pac = new Paciente();
		Agenda agenda = new Agenda();
		Matmed matmed = new Matmed();
		Procedimento procedimento = new Procedimento();
		
		GenericDao<Paciente> pacienteHelper = new GenericDao<>(Paciente.class);
		GenericDao<Agenda> agendaHelper = new GenericDao<>(Agenda.class);
		GenericDao<Matmed> matmedHelper = new GenericDao<>(Matmed.class);
		GenericDao<Procedimento> procedimentoHelper = new GenericDao<>(Procedimento.class);
		
		pac.setNome("Paciente 1");
		pac.setCpf("12345678909");
		pac.setDataNasc(LocalDate.now());
		pac.setTelefone("44444444");
		
		agenda.setData(LocalDateTime.now());
		agenda.setHora(LocalDateTime.now());
		agenda.setDescricao("Descrição 1");
		
		matmed.setDescricao("descricao 1");
		matmed.setFabricante("fabricante");
		matmed.setPreco(22D);
		
		procedimento.setDescricao("Descricao 1");
		procedimento.setPreco(22D);
		
		procedimentoHelper.adicionar(procedimento);
		
		matmedHelper.adicionar(matmed);
		
		pac.setMatmeds(matmed);
		pac.setProcedimento(procedimento);
		
		pacienteHelper.adicionar(pac);
		agendaHelper.adicionar(agenda);
		
		List<Agenda> list = new ArrayList<>();
		
		list.add(agenda);
		pac.setAgendas(list);
		
		pacienteHelper.atualizar(pac);
		
					
		System.out.println("Terminou");

	}

}
