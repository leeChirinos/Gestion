package com.example.demo.Entity;

import jakarta.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(name="nombre_usuario")
    private String nombreUsuario;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}