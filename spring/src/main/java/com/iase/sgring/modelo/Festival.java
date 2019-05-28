package com.iase.sgring.modelo;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "festivales")
public class Festival {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_festival")
    private long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "ndias")
    private int ndias;

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

    @OneToMany(mappedBy="festival", cascade = CascadeType.ALL)
    private List<Concierto> conciertos;

    @ManyToMany(cascade = CascadeType.DETACH, mappedBy = "festivales")
    //@JoinTable(name="usuario_festival", joinColumns={@JoinColumn(name="id_festival")}, inverseJoinColumns={@JoinColumn(name="id_usuario")})
    private List<Usuario> usuarios;

    public Festival() {}

    public Festival(long id, String nombre, Date fecha, String hora_inicio, int personas, int precio, String lugar,
                    String nombreSala, String calle, String ciudad) {
        super();
        this.id = id;
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

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
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

    public List<Concierto> getConciertos() { return conciertos;}

    public void setConciertos(List<Concierto> conciertos) { this.conciertos = conciertos; }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}

