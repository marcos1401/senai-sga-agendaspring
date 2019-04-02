package br.senai.rn.agenda.repositories;

import java.util.List;

import br.senai.rn.agenda.models.Fone;

public class FoneDAO extends GenericDAO<Fone> {
	
	public Fone buscarPorFone(String fone) {
		List<Fone> fones = super.buscarTodos();
		for (Fone f : fones) {
			if (f.getFone().equals(fone)) {
				return f;
			}
		}
		return null;
	}
	
}
