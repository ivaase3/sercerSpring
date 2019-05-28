package com.iase.sgring.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private long id;

    @Column(name = "nombre", unique = true)
    private String nombre;

    @Column(name = "contrasena")
    private String contrasena;

    @Column(name = "pais")
    private String pais;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "correo")
    private String correo;

    @Column(name = "telefono")
    private int telefono;

 //   @Column(name= "favoritos")
   // private List<Concierto> conciertosFav;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="usuario_concierto",
            joinColumns={@JoinColumn(name="id_usuario")}, inverseJoinColumns={@JoinColumn(name="id_concierto")})
    private List<Concierto> conciertos;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="usuario_festival",
            joinColumns={@JoinColumn(name="id_usuario")}, inverseJoinColumns={@JoinColumn(name="id_festival")})
    private List<Festival> festivales;


    public Usuario() {

    }

    public Usuario(long id, String nombre,
                   String contrasena, String pais, String ciudad, String correo, int telefono){
        super();
        this.id = id;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.pais = pais;
        this.ciudad = ciudad;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Usuario( String nombre,
                   String contrasena){
        super();
        this.nombre = nombre;
        this.contrasena = contrasena;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Concierto> getConciertos() {
        return conciertos;
    }

    public void setConciertos(List<Concierto> conciertos) {
        this.conciertos = conciertos;
    }

    public List<Festival> getFestivales() {
        return festivales;
    }

    public void setFestivales(List<Festival> festivales) {
        this.festivales = festivales;
    }
}
