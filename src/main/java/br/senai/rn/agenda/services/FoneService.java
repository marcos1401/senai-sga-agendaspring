package br.senai.rn.agenda.services;


import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import br.senai.rn.agenda.models.Fone;
import br.senai.rn.agenda.repositories.FoneDAO;

public class FoneService {
	
	private FoneDAO dao = new FoneDAO();

	public boolean salvar(Fone fone) {
		if (!ObjectUtils.isEmpty(fone) || !StringUtils.isEmpty(fone.getFone())) {
			dao.salvar(fone);
			return true;
		}
		return false;
	}

	public boolean excluir(Fone fone) {
		if (ObjectUtils.isEmpty(fone)) {
			dao.excluir(fone);
			return true;
		}
		return false;
	}

	public Fone buscarPorFone(String fone) {
		return dao.buscarPorFone(fone);
	
	
	}

	public Fone buscarPorId(Long id) {
		return dao.buscarPorId(id);
	}

	
	
	
	
	
	
	
	
}

