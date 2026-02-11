package org.uce.web.application.representation;

import java.util.List;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public List<EstudianteRepresentation> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(List<EstudianteRepresentation> estudiante) {
        this.estudiante = estudiante;
    }

}
