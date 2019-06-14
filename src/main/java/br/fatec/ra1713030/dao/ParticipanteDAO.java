package br.fatec.ra1713030.dao;


import java.util.List;
import br.fatec.ra1713030.model.Participante;

public interface ParticipanteDAO {
	public void salvar(Participante participante);
	public void atualizar(Participante participante);	
	public void excluir(Participante participante);
	public Participante carregar(Integer codigo);
	public List<Participante> listar();
}
