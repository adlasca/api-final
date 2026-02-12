package org.uce.web.application.representation;

import java.time.LocalDate;

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
    private LocalDate fechaNacimiento;

    public EstudianteRepresentation(Long id, String nombre, String apellido, String cedula, String correo,
            String telefono,
            String genero, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }

    public EstudianteRepresentation() {
    }

}
