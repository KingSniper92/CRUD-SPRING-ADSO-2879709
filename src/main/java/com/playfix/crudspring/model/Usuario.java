package com.playfix.crudspring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tabla_usuarios")

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "nombre_usuario")
    private String nombre;

    @Column(name = "correo_usuario")
    private String correo;


    public Usuario() {
    }


    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }


    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
