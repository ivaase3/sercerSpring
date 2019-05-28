package com.iase.sgring.modelo;


import javax.persistence.*;

@Entity
@Table(name = "usuario_concierto")
public class UsuarioConcierto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "id_usuario")
    private long id_usuario;

    @Column(name = "id_concierto")
    private long id_concierto;

   @Column(name = "favorito")
    private boolean favorito;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public long getId_concierto() {
        return id_concierto;
    }

    public void setId_concierto(long id_concierto) {
        this.id_concierto = id_concierto;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
}
