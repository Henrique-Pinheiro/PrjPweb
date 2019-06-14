package br.fatec.ra1713030.dao;

import br.fatec.ra1713030.util.HibernateUtil;

public class DAOFactory {
	
	public static EventoDAO criaEventoDAO() {
	EventoDAOHibernate eventoDAO = new EventoDAOHibernate();
		      eventoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return eventoDAO;
	}
	
	public static ParticipanteDAO criaParticipanteDAO() {
	ParticipanteDAOHibernate participanteDAO = new ParticipanteDAOHibernate();
		      participanteDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return participanteDAO;
	}
	
}
