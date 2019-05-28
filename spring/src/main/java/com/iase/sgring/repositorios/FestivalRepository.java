package com.iase.sgring.repositorios;


import com.iase.sgring.modelo.Festival;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FestivalRepository extends CrudRepository<Festival, Integer> {

    List<Festival> findAll();
    List<Festival> findByNombre(String nombre);
}
