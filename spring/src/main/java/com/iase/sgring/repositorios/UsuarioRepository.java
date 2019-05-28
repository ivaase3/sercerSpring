package com.iase.sgring.repositorios;

import com.iase.sgring.modelo.Festival;
import com.iase.sgring.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    List<Usuario> findAll();
    Usuario findByNombre(String nombre);
}
