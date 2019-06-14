package br.fatec.ra1713030.dao;


import java.util.List;
import br.fatec.ra1713030.model.Evento;

public interface EventoDAO {
	public void salvar(Evento evento);
	public void atualizar(Evento evento);	
	public void excluir(Evento evento);
	public Evento carregar(Integer codigo);
	public List<Evento> listar();
}
