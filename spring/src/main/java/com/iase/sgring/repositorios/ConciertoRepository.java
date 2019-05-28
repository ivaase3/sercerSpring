package com.iase.sgring.repositorios;



import com.iase.sgring.modelo.Concierto;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ConciertoRepository extends CrudRepository<Concierto, Integer> {

    List<Concierto> findAll();
    List<Concierto> findByNombre(String nombre);
    List<Concierto> findByIdConcierto(int id);
    List<Concierto> findByFecha(Date fecha);
    //List<Concierto> findByHora_Inicio(String hora_inicio);
    List<Concierto> findBypersonas(int nPersonas);



}
