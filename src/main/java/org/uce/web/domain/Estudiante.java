package org.uce.web.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
@Getter
@Setter
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private String telefono;
    private String genero;
    private String fechaNacimiento;
    private String password;
    @ManyToMany
    @JoinTable(name = "estudiante_materia", joinColumns = @JoinColumn(name = "estudiante_id"), inverseJoinColumns = @JoinColumn(name = "materia_id"))
    private List<Materia> materia;

    public Estudiante() {
    }

    public Estudiante(Long id, String nombre, String apellido, String cedula, String correo, String telefono,
            String genero, String fechaNacimiento, String password, List<Materia> materia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.password = password;
        this.materia = materia;
    }

}
