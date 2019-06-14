package br.fatec.ra1713030.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import br.fatec.ra1713030.model.Evento;

@ManagedBean(name = "eventoBean")
@RequestScoped

public class EventoBean {
	
	private Evento evento = new Evento();
	
	public Evento getEvento() {
		return evento;
	}
	
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
}
