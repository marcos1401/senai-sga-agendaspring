package br.senai.rn.agenda.services;




import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import br.senai.rn.agenda.models.Email;
import br.senai.rn.agenda.repositories.EmailDAO;


public class EmailService {

	private EmailDAO dao = new EmailDAO();

	public void salvar(Email email) {
		if(ObjectUtils.isEmpty(email) || StringUtils.isEmpty(email.getEmail())) {
			dao.salvar(email);
			
		}
	}

	public boolean excluir(Email email) {
		if (ObjectUtils.isEmpty(email)) {
			dao.excluir(email);
			return true;
		}
		return false;
	
	
	}
}
