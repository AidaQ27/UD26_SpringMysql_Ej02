package UD26.Spring.service;

import java.util.List;

import UD26.Spring.dto.Proyecto;

public interface IProyectoService {
	
public List<Proyecto> listarProyecto(); //Listar All 
	
	public Proyecto guardarProyecto(Proyecto proyecto);	//Guarda un Proyecto CREATE
	
	public Proyecto proyectoXID(int id); //Leer datos de un Proyecto READ
	
	public Proyecto actualizarProyecto(Proyecto proyecto); //Actualiza datos del proyecto UPDATE
	
	public void eliminarProyecto(int id);// Elimina el proyecto DELETE
}
