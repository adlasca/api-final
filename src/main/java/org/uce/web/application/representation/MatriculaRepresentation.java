package org.uce.web.application.representation;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MatriculaRepresentation {
    private Long id;
    private LocalDate fechaMatricula;
    private String estado;
    private EstudianteRepresentation estudiante;
    private MateriaRepresentation materia;

    public MatriculaRepresentation(Long id, LocalDate fechaMatricula, String estado,
            EstudianteRepresentation estudiante,
            MateriaRepresentation materia) {
        this.id = id;
        this.fechaMatricula = fechaMatricula;
        this.estado = estado;
        this.estudiante = estudiante;
        this.materia = materia;
    }

    public MatriculaRepresentation() {
    }

}
