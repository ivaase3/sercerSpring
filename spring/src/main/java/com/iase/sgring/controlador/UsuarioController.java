package com.iase.sgring.controlador;

import com.iase.sgring.modelo.Festival;
import com.iase.sgring.modelo.Usuario;
import com.iase.sgring.repositorios.FestivalRepository;
import com.iase.sgring.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @RequestMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return repository.findAll();
    }

    @RequestMapping("/usuario_nombre")
    public Usuario getUsuario(String nombre) {


        return repository.findByNombre(nombre);
    }


    @RequestMapping("/addusuario")
    public void addUsuario(
            @RequestParam(value = "nombre", defaultValue = "nada") String nombre,
            @RequestParam(value = "contrasena", defaultValue = "00-00-00") String contrasena)
            {

        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setContrasena(contrasena);
        repository.save(usuario);
    }

    @RequestMapping("/addusuarioo")
    public void editUsuario(
            @RequestParam(value = "nombre", defaultValue = "nada") String nombre,
            @RequestParam(value = "contrasena", defaultValue = "0") String contrasena,
            @RequestParam(value = "pais", defaultValue = "nada") String pais,
            @RequestParam(value = "ciudad", defaultValue = "nada") String ciudad,
            @RequestParam(value = "correo", defaultValue = "nada") String correo,
            @RequestParam(value = "telefono", defaultValue = "00") String telefono)
    {

        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setContrasena(contrasena);
        usuario.setContrasena(pais);
        usuario.setContrasena(ciudad);
        usuario.setContrasena(correo);
        usuario.setContrasena(telefono);
        repository.save(usuario);
    }

}
