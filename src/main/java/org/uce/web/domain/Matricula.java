package org.uce.web.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate fechaMatricula;
    private String estado;
    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;
    @ManyToOne
    @JoinColumn(name = "materia_id")
    private Materia materia;

    public Matricula(Long id, LocalDate fechaMatricula, String estado, Estudiante estudiante, Materia materia) {
        this.id = id;
        this.fechaMatricula = fechaMatricula;
        this.estado = estado;
        this.estudiante = estudiante;
        this.materia = materia;
    }

    public Matricula(LocalDate fechaMatricula, String estado, Estudiante estudiante, Materia materia) {
        this.fechaMatricula = fechaMatricula;
        this.estado = estado;
        this.estudiante = estudiante;
        this.materia = materia;
    }

    public Matricula() {
    }
}
