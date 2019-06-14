package br.fatec.ra1713030.controller;

import java.util.List;

import br.fatec.ra1713030.dao.DAOFactory;
import br.fatec.ra1713030.dao.DAOFactoryParticipante;
import br.fatec.ra1713030.dao.ParticipanteDAO;
import br.fatec.ra1713030.model.Participante;

public class ParticipanteRN {
	private ParticipanteDAO participanteDAO;

	public ParticipanteRN() {
		this.participanteDAO = DAOFactoryParticipante.criaParticipanteDAO();
	}

	// carrega uma instancia
	public Participante carregar(Integer codigo) {
		return this.participanteDAO.carregar(codigo);
	}

	// se nao existe salva, caso contrario atualiza
	public void salvar(Participante participante) {
		Integer idParticipante = participante.getIdParticipante();
		if (idParticipante == null || idParticipante == 0) {
			this.participanteDAO.salvar(participante);
		} else {
			this.participanteDAO.atualizar(participante);
		}
	}

	public void excluir(Participante participante) {
		this.participanteDAO.excluir(participante);
	}

	public List<Participante> listar() {
		return this.participanteDAO.listar();
	}
}
