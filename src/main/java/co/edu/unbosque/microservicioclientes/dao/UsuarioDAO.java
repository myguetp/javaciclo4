package co.edu.unbosque.microservicioclientes.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microservicioclientes.model.Usuarios;

// Parámetros de MongoRepository --> <DTO, tipo de dato de la PK>
public interface UsuarioDAO extends MongoRepository<Usuarios, Integer>{
	
}
