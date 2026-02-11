package org.uce.web.infraestructure;

import org.uce.web.domain.Estudiante;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstudianteRepository implements PanacheRepository<Estudiante> {

}
