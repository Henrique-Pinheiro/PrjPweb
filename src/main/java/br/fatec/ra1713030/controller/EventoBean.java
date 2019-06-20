package br.fatec.ra1713030.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import br.fatec.ra1713030.dao.EventoDAO;
import br.fatec.ra1713030.dao.EventoDAOHibernate;
import br.fatec.ra1713030.model.Evento;
import br.fatec.ra1713030.util.HibernateUtil;


@ManagedBean(name = "eventoBean")
@RequestScoped

public class EventoBean {
	
	private Evento evento = new Evento(); // propriedade do tipo Evento

	private DataModel<Evento> listaEventos;

	@SuppressWarnings("unchecked")
	public DataModel<Evento> getListaEventos() {
		if (listaEventos == null) {
			EventoDAO dao = new EventoDAOHibernate();
			listaEventos = new ListDataModel<Evento>(dao.listar());
		}
		return listaEventos;
	}

	public void setListaEventos(DataModel<Evento> listaEventos) {
		this.listaEventos = listaEventos;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

		// porta de entrada do formulário
	// preparar cadastro novo evento
	public String novo() {
	this.evento = new Evento();
	/**	this.evento.setInserir(true);
		this.evento.setAlterar(true);
		this.evento.setExcluir(true);
		this.evento.setVisualizar(true);**/
		return "publico/evento"; // tenta exibir evento.xhtml
	}

	public String listagem() {
		this.evento = new Evento();
		return "publico/listagemEvento.xhtml";
	}

	public String salvar() {
		// se deu certo
		EventoRN eventoRN = new EventoRN();
		eventoRN.salvar(this.evento);
		return "eventoSucesso"; // tenta abrir pagina /public/eventosucesso
									// nao colocou o publico mas
		// o contexto de salvar está em /publico
	}
}
