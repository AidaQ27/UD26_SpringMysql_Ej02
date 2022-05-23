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

import UD26.Spring.dto.Cientificos;
import UD26.Spring.service.CientificoServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificosController {
	

		
		@Autowired
		CientificoServiceImpl cientificoServiceImpl;
		
		@GetMapping("/cientificos")
		public List<Cientificos> listarCcursos(){
			return cientificoServiceImpl.listarCientificos();
		}
		
		
		@PostMapping("/cientificos")
		public Cientificos salvarCientificos(@RequestBody Cientificos curso) {
			
			return cientificoServiceImpl.guardarCientificos(curso);
		}
		
		
		@GetMapping("/cientificos/{id}")
		public Cientificos CientificosXID(@PathVariable(name="id") int id) {
			
			Cientificos Cientificos_xid= new Cientificos();
			
			Cientificos_xid=cientificoServiceImpl.cientificosXID(id);
			
			//System.out.println("Cientificos XID: "+ Cientificos_xid);
			
			return Cientificos_xid;
		}
		
		@PutMapping("/cientificos/{id}")
		public Cientificos actualizarCientificos(@PathVariable(name="id")int id,@RequestBody Cientificos Cientificos) {
			
			Cientificos Cientificos_seleccionado= new Cientificos();
			Cientificos Cientificos_actualizado= new Cientificos();
			
			Cientificos_seleccionado= cientificoServiceImpl.cientificosXID(id);
			
			Cientificos_seleccionado.setNombre(Cientificos.getNombre());
			
			
			Cientificos_actualizado = cientificoServiceImpl.actualizarCientificos(Cientificos_seleccionado);
			
			//System.out.println("El Cientificos actualizado es: "+ Cientificos_actualizado);
			
			return Cientificos_actualizado;
		}
		
		@DeleteMapping("/cientificos/{id}")
		public void eleiminarCientificos(@PathVariable(name="id")int id) {
			cientificoServiceImpl.eliminarCientificos(id);
		}
		

}
