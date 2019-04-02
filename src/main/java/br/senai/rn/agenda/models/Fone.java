package br.senai.rn.agenda.models;

import br.senai.rn.agenda.models.enums.TipoFone;
import br.senai.rn.agenda.repositories.PersistDB;

public class Fone implements PersistDB {

	private Long id;
	private String fone;
	private TipoFone tipoFone;
	
	public Fone() {}
	
	public Fone(Long id, String fone, TipoFone tipoFone) {
		this.id = id;
		this.fone = fone;
		this.tipoFone = tipoFone;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public TipoFone getTipoFone() {
		return tipoFone;
	}

	public void setTipoFone(TipoFone tipoFone) {
		this.tipoFone = tipoFone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Fone other = (Fone) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fone [id=" + id + ", fone=" + fone + ", tipoFone=" + tipoFone + "]";
	}
	
}
