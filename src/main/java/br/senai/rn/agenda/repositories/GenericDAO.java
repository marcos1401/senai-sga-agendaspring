package br.senai.rn.agenda.repositories;

import java.util.ArrayList;
import java.util.List;

public abstract class GenericDAO<T extends PersistDB> {

	private List<T> ts = new ArrayList<T>();
	
	public void salvar(T t) {
		ts.add(t);
	}
	
	public void excluir(T t) {
		ts.remove(t);
	}
	
	public T buscarPorId(Long id) {
		for (T t : ts) {
			if (t.getId().equals(id)) {
				return t;
			}
		}
		return null;
	}
	
	public List<T> buscarTodos() {
		return ts;
	}
	
}
