/**
 * 
 */
package UD26.Spring.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Aida Queralt
 *
 */

@Entity
@Table(name = "cientificos")
public class Cientificos {
	
	//Atributos de la clase Cientificos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column (name = "nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Asignado> asignado;

	
	public Cientificos() {
		super();
	}


	public Cientificos(int id, String nombre, List<Asignado> asignado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.asignado = asignado;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "asignado")
	public List<Asignado> getAsignado() {
		return asignado;
	}


	public void setAsignado(List<Asignado> asignado) {
		this.asignado = asignado;
	}


	@Override
	public String toString() {
		return "Cientificos [id=" + id + ", nombre=" + nombre + ", asignado=" + asignado + "]";
	}
	


	

}
