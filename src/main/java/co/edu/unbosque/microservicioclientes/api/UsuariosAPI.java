package co.edu.unbosque.microservicioclientes.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.unbosque.microservicioclientes.model.Usuarios;
import co.edu.unbosque.microservicioclientes.dao.UsuarioDAO;

@RestController //esta es una clase REST
@RequestMapping("usuarios")
@CrossOrigin("*")
public class UsuariosAPI {
	@Autowired//inyecta la dependencia de todos los métodos del JPA para clienteDAO
	private UsuarioDAO usuarioDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Usuarios usuario) {//Request convierte en un objeto Java desde un JSon
		usuarioDAO.save(usuario);
	}
	
	@GetMapping("/listar")
	public List<Usuarios> listar(){
		return usuarioDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		usuarioDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Usuarios usuario) {
		usuarioDAO.save(usuario);
	}	
}
