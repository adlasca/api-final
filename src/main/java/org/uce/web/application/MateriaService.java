package org.uce.web.application;

import java.util.List;

import org.uce.web.domain.Materia;
import org.uce.web.infraestructure.MateriaRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MateriaService {
    @Inject
    MateriaRepository materiaRepository;

    public List<Materia> findAll() {
        return materiaRepository.listAll();
    }

    public Materia findById(Long id) {
        return materiaRepository.findById(id);
    }

    public Materia save(Materia materia) {
        materiaRepository.persist(materia);
        return materia;
    }

    public void delete(Long id) {
        materiaRepository.deleteById(id);
    }
}
