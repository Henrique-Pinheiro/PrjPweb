package br.fatec.ra1713030.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import br.fatec.ra1713030.model.Participante;

public class ParticipanteDAOHibernate implements ParticipanteDAO{
	
	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}
	
	public void salvar(Participante participante) {
		try {
			this.session.getSessionFactory().openSession();
			this.session.beginTransaction();
			this.session.save(participante);
			this.session.getTransaction().commit();
		} catch (HibernateException e) {
			System.out.println("Não foi possível inserir o contato. Erro: " + e.getMessage());
		}
	}

	public void atualizar(Participante participante) {
		try {
			this.session.getSessionFactory().openSession();
			session.beginTransaction();
			this.session.update(participante);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			System.out.println("Não foi possível alterar o contato. Erro: " + e.getMessage());
		}
	}

	public void excluir(Participante participante) {
		try {
			this.session.getSessionFactory().openSession();
			session.beginTransaction();
			this.session.delete(participante);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			System.out.println("Não foi possível excluir o contato. Erro: " + e.getMessage());
		}
	}

	// como se fosse o select, busca pela chave, se nao existir retorna null
	// se usar load ao inves de get será gerada uma excecao

	public Participante carregar(Integer codigo) {
		this.session.getSessionFactory().openSession();
		session.beginTransaction();
		return (Participante) this.session.get(Participante.class, codigo);
	}

	// select sem criterio

	@SuppressWarnings("unchecked")
	public List<Participante> listar() {
		this.session.getSessionFactory().openSession();
		session.beginTransaction();
		return this.session.createCriteria(Participante.class).list();
	}

}
