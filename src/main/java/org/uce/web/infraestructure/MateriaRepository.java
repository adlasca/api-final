package org.uce.web.infraestructure;

import org.uce.web.domain.Materia;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MateriaRepository implements PanacheRepository<Materia> {

}
