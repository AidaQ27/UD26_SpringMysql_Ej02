package UD26.Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UD26.Spring.dao.IAsignadoDAO;
import UD26.Spring.dto.Asignado;

@Service
public class AsignadoServiceImpl  implements IAsignadoService {
	
	@Autowired
	IAsignadoDAO iAsignadoDAO;

	@Override
	public List<Asignado> listarAsignado() {
		return iAsignadoDAO.findAll();
	}

	@Override
	public Asignado guardarAsignado(Asignado curso) {
		return iAsignadoDAO.save(curso);
	}

	@Override
	public Asignado asignadoXID(int id) {
		return iAsignadoDAO.findById(id).get();
	}

	@Override
	public Asignado actualizarAsignado(Asignado curso) {
		return iAsignadoDAO.save(curso);
	}

	@Override
	public void eliminarAsignado(int id) {
		iAsignadoDAO.deleteById(id);
	}
	
	

}
