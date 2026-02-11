package org.uce.web.application.representation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstudianteRepresentation {
    private Long id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private String telefono;
    private String genero;
    private String fechaNacimiento;
    private String estado;
    private String password;

    public EstudianteRepresentation(Long id, String nombre, String apellido, String cedula, String correo,
            String telefono,
            String genero, String fechaNacimiento, String estado, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.password = password;
    }

    public EstudianteRepresentation() {
    }
}
