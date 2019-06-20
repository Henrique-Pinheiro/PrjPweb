package br.fatec.ra1713030.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import br.fatec.ra1713030.util.HibernateUtil;
import br.fatec.ra1713030.model.Evento;

public class EventoDAOHibernate implements EventoDAO{
	
	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}
	
	public void salvar(Evento evento) {
		try {
			this.session.getSessionFactory().openSession();
			this.session.beginTransaction();
			this.session.save(evento);
			this.session.getTransaction().commit();
		} catch (HibernateException e) {
			System.out.println("Não foi possível inserir o contato. Erro: " + e.getMessage());
		}
	}

	public void atualizar(Evento evento) {
		try {
			this.session.getSessionFactory().openSession();
			session.beginTransaction();
			this.session.update(evento);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			System.out.println("Não foi possível alterar o contato. Erro: " + e.getMessage());
		}
	}

	public void excluir(Evento evento) {
		try {
			this.session.getSessionFactory().openSession();
			session.beginTransaction();
			this.session.delete(evento);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			System.out.println("Não foi possível excluir o contato. Erro: " + e.getMessage());
		}
	}

	// como se fosse o select, busca pela chave, se nao existir retorna null
	// se usar load ao inves de get será gerada uma excecao

	public Evento carregar(Integer codigo) {
		this.session.getSessionFactory().openSession();
		session.beginTransaction();
		return (Evento) this.session.get(Evento.class, codigo);
	}

	// select sem criterio

	public List<Evento> listar() {
		// this.session.getSessionFactory().openSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String hql = "from Evento";
		@SuppressWarnings("unchecked")
		List<Evento> lista = session.createQuery(hql).list();
		if (lista != null) {
			return lista;
		} else {
			System.out.println("nao passou nada");
			return null;
		}
	}

}
