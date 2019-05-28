package com.iase.sgring.modelo;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "conciertos")
public class Concierto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_concierto")
    private int idConcierto;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "hora_inicio")
    private String hora_inicio;

    @Column(name = "npersonas")
    private int personas;

    @Column(name = "precio")
    private float precio;

    @Column(name = "nombre_sala")
    private String nombreSala;

    @Column(name = "lugar")
    private String lugar;

    @Column(name = "calle")
    private String calle;

    @Column(name = "ciudad")
    private String ciudad;

    @ManyToOne
    @JoinColumn(name="id_festival")
    private Festival festival;


    @ManyToMany(cascade = CascadeType.DETACH, mappedBy = "conciertos")
     //@JoinTable(name="usuario_concierto", joinColumns={@JoinColumn(name="id_concierto")}, inverseJoinColumns={@JoinColumn(name="Id_usuario")})
     private List<Usuario> usuarios;

    public Concierto() {

    }

    public Concierto(int id, String nombre, Date fecha, String hora_inicio, int personas, float precio, String lugar,
                     String nombreSala, String calle, String ciudad) {
        super();
        this.idConcierto = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.personas = personas;
        this.precio = precio;
        this.nombreSala = nombreSala;
        this.lugar = lugar;
        this.calle = calle;
        this.ciudad = ciudad;

    }

    public int getId() {
        return idConcierto;
    }

    public void setId(int id) {
        this.idConcierto = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Festival getFestival() {return festival;}

    public void setFestival(Festival festival) {this.festival = festival;}

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}

