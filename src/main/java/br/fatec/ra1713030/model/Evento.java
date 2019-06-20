package br.fatec.ra1713030.model;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evento")
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEvento;
	
	public Integer getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public Date getDtHrEvento() {
		return dtHrEvento;
	}

	public void setDtHrEvento(Date dtHrEvento) {
		this.dtHrEvento = dtHrEvento;
	}

	public String getLocalEvento() {
		return localEvento;
	}

	public void setLocalEvento(String localEvento) {
		this.localEvento = localEvento;
	}
	
	private String nomeEvento;
	private Date dtHrEvento;
	private String localEvento;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEvento == null) ? 0 : idEvento.hashCode());
		result = prime * result + ((nomeEvento == null) ? 0 : nomeEvento.hashCode());
		result = prime * result + ((localEvento == null) ? 0 : localEvento.hashCode());
		result = prime * result + ((dtHrEvento == null) ? 0 : dtHrEvento.hashCode());
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
		Evento other = (Evento) obj;
		if (nomeEvento == null) {
			if (other.nomeEvento != null)
				return false;
		} else if (!nomeEvento.equals(other.nomeEvento))
			return false;
		if (idEvento == null) {
			if (other.idEvento != null)
				return false;
		} else if (!idEvento.equals(other.idEvento))
			return false;
		if (localEvento == null) {
			if (other.localEvento != null)
				return false;
		} else if (!localEvento.equals(other.localEvento))
			return false;
		if (dtHrEvento == null) {
			if (other.dtHrEvento != null)
				return false;
		} else if (!dtHrEvento.equals(other.dtHrEvento))
			return false;
		return true;
	}
}
