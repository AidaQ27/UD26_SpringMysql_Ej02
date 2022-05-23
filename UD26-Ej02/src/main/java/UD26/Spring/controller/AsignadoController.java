package UD26.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import UD26.Spring.dto.Asignado;
import UD26.Spring.service.AsignadoServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoController {
	
	@Autowired
	AsignadoServiceImpl asignadoServiceImpl;
	
	@GetMapping("/asignados")
	public List<Asignado> listarAsignado(){
		return asignadoServiceImpl.listarAsignado();
	}
	
	
	@PostMapping("/asignados")
	public Asignado salvarAsignado(@RequestBody Asignado asignado) {
		
		return asignadoServiceImpl.guardarAsignado(asignado);
	}
	
	
	@GetMapping("/asignados/{id}")
	public Asignado AsignadoXID(@PathVariable(name="id") int id) {
		
		Asignado Asignado_xid= new Asignado();
		
		Asignado_xid=asignadoServiceImpl.asignadoXID(id);
		
		//System.out.println("Asignado XID: "+Asignado_xid);
		
		return Asignado_xid;
	}
	
	@PutMapping("/asignados/{id}")
	public Asignado actualizarAsignado(@PathVariable(name="id")int id,@RequestBody Asignado Asignado) {
		
		Asignado Asignado_seleccionado= new Asignado();
		Asignado Asignado_actualizado= new Asignado();
		
		Asignado_seleccionado= asignadoServiceImpl.asignadoXID(id);
		
		
		Asignado_seleccionado.setCientifico(Asignado.getCientifico());
		Asignado_seleccionado.setProyecto(Asignado.getProyecto());
		
		
		Asignado_actualizado = asignadoServiceImpl.actualizarAsignado(Asignado_seleccionado);
		
		//System.out.println("El Asignado actualizado es: "+ Asignado_actualizado);
		
		return Asignado_actualizado;
	}
	
	@DeleteMapping("/asignados/{id}")
	public void eleiminarAsignado(@PathVariable(name="id")int id) {
		asignadoServiceImpl.eliminarAsignado(id);
	}

}
