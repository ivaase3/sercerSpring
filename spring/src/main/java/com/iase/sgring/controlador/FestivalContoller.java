package com.iase.sgring.controlador;


import com.iase.sgring.modelo.Festival;

import com.iase.sgring.repositorios.FestivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class FestivalContoller {

    @Autowired
    private FestivalRepository repository;

    @RequestMapping("/festivales")
    public List<Festival> getFestivales() {
        return repository.findAll();
    }

    @RequestMapping("/festivales_nombre")
    public List<Festival> getFestivales(String nombre) {
        return repository.findByNombre(nombre);
    }


    @RequestMapping("/add_festival")
    public void addFestival(
            @RequestParam(value = "nombre", defaultValue = "nada") String nombre,
            @RequestParam(value = "fecha", defaultValue = "00-00-00") Date fecha,
            @RequestParam(value = "hora_inicio", defaultValue = "nada") String horaInicio,
            @RequestParam(value = "npersonas", defaultValue = "0") int personas,
            @RequestParam(value = "precio", defaultValue = "0") float precio,
            @RequestParam(value = "nombre_sala", defaultValue = "nada") String nombreSala,
            @RequestParam(value = "lugar", defaultValue = "nada") String lugar,
            @RequestParam(value = "calle", defaultValue = "nada") String calle,
            @RequestParam(value = "ciudad", defaultValue = "nada") String ciudad){

        Festival festival = new Festival();
        festival.setNombre(nombre);
        festival.setFecha(fecha);
        festival.setHora_inicio(horaInicio);
        festival.setPersonas(personas);
        festival.setPrecio(precio);
        festival.setNombreSala(nombreSala);
        festival.setLugar(lugar);
        festival.setCalle(calle);
        festival.setCiudad(ciudad);
        repository.save(festival);
    }

}
