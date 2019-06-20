package br.fatec.ra1713030.dao;

import br.fatec.ra1713030.util.HibernateUtil;

public class DAOFactory {
	
	public static EventoDAO criaEventoDAO() {
	EventoDAOHibernate eventoDAO = new EventoDAOHibernate();
		      eventoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return eventoDAO;
	}
}
