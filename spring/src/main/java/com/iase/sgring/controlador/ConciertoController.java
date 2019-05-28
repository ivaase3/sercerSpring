package com.iase.sgring.controlador;


import com.iase.sgring.modelo.Concierto;
import com.iase.sgring.modelo.Festival;
import com.iase.sgring.repositorios.ConciertoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class ConciertoController {

    @Autowired
    private ConciertoRepository repository;






    @RequestMapping("/conciertos")
    public List<Concierto> getConciertos() {

        List<Concierto> listaConciertos = repository.findAll();
        return listaConciertos;
    }

    @RequestMapping("/conciertos_nombre")
    public List<Concierto> getConciertos(String nombre) {
        return repository.findByNombre(nombre);
    }

    @RequestMapping("/conciertos_fecha")
    public List<Concierto> getConciertosf(String fechac) {

        String[] array = new String[3];
        System.out.println(fechac);//2019-5-31
        array = fechac.split("-");

        Date fecha = new Date(Integer.parseInt(array[0])-1900,Integer.parseInt(array[1])-1,Integer.parseInt(array[2]));

        System.out.println(array[0] + " "+ array[1] + " " + array[2]);
        System.out.println(fecha);
        System.out.println(repository.findByFecha(fecha));
        return repository.findByFecha(fecha);
    }
    @RequestMapping("/conciertos_id")
    public List<Concierto> getConciertosId(int id) { return repository.findByIdConcierto(id); }

    //@RequestMapping("/conciertos_hora_inicio")
    //public List<Concierto> getConciertosHoraInicio(String hora_inicio) { return repository.findByHora_Inicio(hora_inicio); }
    @RequestMapping("/conciertos_personas")
    public List<Concierto> getConciertosPersonas(int nPersonas) {
        return repository.findBypersonas(nPersonas);
    }


    @RequestMapping("/add_concierto")
    public void addConcierto(
            @RequestParam(value = "nombre", defaultValue = "nada") String nombre,
            @RequestParam(value = "fecha", defaultValue = "00-00-00") Date fecha,
            @RequestParam(value = "hora_inicio", defaultValue = "nada") String horaInicio,
            @RequestParam(value = "npersonas", defaultValue = "0") int personas,
            @RequestParam(value = "precio", defaultValue = "0") float precio,
            @RequestParam(value = "nombre_sala", defaultValue = "nada") String nombreSala,
            @RequestParam(value = "lugar", defaultValue = "nada") String lugar,
            @RequestParam(value = "calle", defaultValue = "nada") String calle,
            @RequestParam(value = "ciudad", defaultValue = "nada") String ciudad) {

        Concierto concierto = new Concierto();
        concierto.setNombre(nombre);
        concierto.setFecha(fecha);
        concierto.setHora_inicio(horaInicio);
        concierto.setPersonas(personas);
        concierto.setPrecio(precio);
        concierto.setNombreSala(nombreSala);
        concierto.setLugar(lugar);
        concierto.setCalle(calle);
        concierto.setCiudad(ciudad);
        repository.save(concierto);
    }

}