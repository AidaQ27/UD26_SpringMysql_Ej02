package UD26.Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UD26.Spring.dao.ICientificosDAO;
import UD26.Spring.dto.Cientificos;

@Service
public class CientificoServiceImpl implements ICientificosService{
	
	@Autowired
	ICientificosDAO iCientificosDAO;

	@Override
	public List<Cientificos> listarCientificos() {
		return iCientificosDAO.findAll();
	}

	@Override
	public Cientificos guardarCientificos(Cientificos cientificos) {
		return iCientificosDAO.save(cientificos);
	}

	@Override
	public Cientificos cientificosXID(int id) {
		return iCientificosDAO.findById(id).get();
	}

	@Override
	public Cientificos actualizarCientificos(Cientificos cientificos) {
		return iCientificosDAO.save(cientificos);
	}

	@Override
	public void eliminarCientificos(int id) {
		iCientificosDAO.deleteById(id);
	}

}
