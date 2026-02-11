package org.uce.web.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
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
public class Materia {
    private String nombre;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String codigo;
    private int creditos;
    @ManyToMany
    @JoinTable(name = "estudiante_materia", joinColumns = @JoinColumn(name = "materia_id"), inverseJoinColumns = @JoinColumn(name = "estudiante_id"))
    private List<Estudiante> estudiante;

    public Materia(Long id, String nombre, String codigo, int creditos, List<Estudiante> estudiante) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.estudiante = estudiante;
    }

    public Materia(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public Materia() {
    }
}
