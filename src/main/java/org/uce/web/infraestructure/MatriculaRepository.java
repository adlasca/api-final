package org.uce.web.infraestructure;

import org.uce.web.domain.Matricula;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MatriculaRepository implements PanacheRepository<Matricula> {

}
