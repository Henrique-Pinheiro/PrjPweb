package br.fatec.ra1713030.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participante")
public class Participante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idParticipante;
	
	public Integer getIdParticipante() {
		return idParticipante;
	}
	public void setIdParticipante(Integer idParticipante) {
		this.idParticipante = idParticipante;
	}
	public String getnomeParticipanteParticipante() {
		return nomeParticipante;
	}
	public void setnomeParticipanteParticipante(String nomeParticipanteParticipante) {
		this.nomeParticipante= nomeParticipanteParticipante;
	}
	public Date getDtNascParticipante() {
		return dtNascParticipante;
	}
	public void setDtNascParticipante(Date dtNascParticipante) {
		this.dtNascParticipante = dtNascParticipante;
	}
	public String getEmpresaParticipante() {
		return empresaParticipante;
	}
	public void setEmpresaParticipante(String empresaParticipante) {
		this.empresaParticipante = empresaParticipante;
	}
	public String getemailParticipanteParticipante() {
		return emailParticipante;
	}
	public void setemailParticipanteParticipante(String emailParticipanteParticipante) {
		this.emailParticipante= emailParticipanteParticipante;
	}
	public String getCpfParticipante() {
		return cpfParticipante;
	}
	public void setCpfParticipante(String cpfParticipante) {
		this.cpfParticipante = cpfParticipante;
	}
	public Integer getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(Evento evento) {
		idEvento = evento.getIdEvento();
	}
	
	private String nomeParticipante;
	private Date dtNascParticipante;
	private String empresaParticipante;
	private String emailParticipante;
	private String cpfParticipante;
	private Integer idEvento;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empresaParticipante == null) ? 0 : empresaParticipante.hashCode());
		result = prime * result + ((idParticipante == null) ? 0 : idParticipante.hashCode());
		result = prime * result + ((emailParticipante == null) ? 0 : emailParticipante.hashCode());
		result = prime * result + ((cpfParticipante == null) ? 0 : cpfParticipante.hashCode());
		result = prime * result + ((dtNascParticipante == null) ? 0 : dtNascParticipante.hashCode());
		result = prime * result + ((nomeParticipante == null) ? 0 : nomeParticipante.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participante other = (Participante) obj;
		if (empresaParticipante == null) {
			if (other.empresaParticipante != null)
				return false;
		} else if (!empresaParticipante.equals(other.empresaParticipante))
			return false;
		if (idParticipante == null) {
			if (other.idParticipante != null)
				return false;
		} else if (!idParticipante.equals(other.idParticipante))
			return false;
		if (emailParticipante == null) {
			if (other.emailParticipante != null)
				return false;
		} else if (!emailParticipante.equals(other.emailParticipante))
			return false;
		if (cpfParticipante == null) {
			if (other.cpfParticipante != null)
				return false;
		} else if (!cpfParticipante.equals(other.cpfParticipante))
			return false;
		if (dtNascParticipante == null) {
			if (other.dtNascParticipante != null)
				return false;
		} else if (!dtNascParticipante.equals(other.dtNascParticipante))
			return false;
		if (nomeParticipante == null) {
			if (other.nomeParticipante != null)
				return false;
		} else if (!nomeParticipante.equals(other.nomeParticipante))
			return false;
		return true;
	}
	
	
}
