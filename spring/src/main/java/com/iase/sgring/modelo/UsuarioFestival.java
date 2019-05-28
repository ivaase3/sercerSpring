package com.iase.sgring.modelo;

import javax.persistence.*;

@Entity
@Table(name = "usuario_festival")
public class UsuarioFestival {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "id_usuario")
    private long id_usuario;

    @Column(name = "id_festival")
    private long id_festival;


}
