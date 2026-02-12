package org.uce.web.application.representation;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MateriaRepresentation {
    private Long id;
    private String nombre;
    private String codigo;
    private int creditos;
    private List<EstudianteRepresentation> estudiante;

    public MateriaRepresentation(Long id, String nombre, String codigo, int creditos,
            List<EstudianteRepresentation> estudiante) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.estudiante = estudiante;
    }

    public MateriaRepresentation() {
    }

}
