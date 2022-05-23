package UD26.Spring.service;

import java.util.List;

import UD26.Spring.dto.Cientificos;

public interface ICientificosService {
	
	public List<Cientificos> listarCientificos(); //Listar All 
	
	public Cientificos guardarCientificos(Cientificos cientificos);	//Guarda un Cientificos CREATE
	
	public Cientificos cientificosXID(int id); //Leer datos de un Cientificos READ
	
	public Cientificos actualizarCientificos(Cientificos cientificos); //Actualiza datos del cientificos UPDATE
	
	public void eliminarCientificos(int id);// Elimina el cientificos DELETE


}


