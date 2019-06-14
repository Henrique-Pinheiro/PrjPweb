package br.fatec.ra1713030.controller;

import java.util.List;

import br.fatec.ra1713030.dao.DAOFactory;
import br.fatec.ra1713030.dao.EventoDAO;
import br.fatec.ra1713030.model.Evento;

public class EventoRN {
	private EventoDAO eventoDAO;

	public EventoRN() {
		this.eventoDAO = DAOFactory.criaEventoDAO();
	}

	// carrega uma instancia
	public Evento carregar(Integer codigo) {
		return this.eventoDAO.carregar(codigo);
	}

	// se nao existe salva, caso contrario atualiza
	public void salvar(Evento evento) {
		Integer idEvento = evento.getIdEvento();
		if (idEvento == null || idEvento == 0) {
			this.eventoDAO.salvar(evento);
		} else {
			this.eventoDAO.atualizar(evento);
		}
	}

	public void excluir(Evento evento) {
		this.eventoDAO.excluir(evento);
	}

	public List<Evento> listar() {
		return this.eventoDAO.listar();
	}
}