package org.uce.web.application;

import java.util.List;

import org.uce.web.domain.Estudiante;
import org.uce.web.infraestructure.EstudianteRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class EstudianteService {
    @Inject
    EstudianteRepository estudianteRepository;

    public List<Estudiante> findAll() {
        return estudianteRepository.listAll();
    }

    public Estudiante findById(Long id) {
        return estudianteRepository.findById(id);
    }

    public Estudiante save(Estudiante estudiante) {
        estudianteRepository.persist(estudiante);
        return estudiante;
    }

    public void delete(Long id) {
        estudianteRepository.deleteById(id);
    }
}
