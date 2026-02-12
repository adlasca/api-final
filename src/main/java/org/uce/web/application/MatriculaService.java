package org.uce.web.application;

import java.util.ArrayList;
import java.util.List;

import org.uce.web.application.representation.MatriculaRepresentation;
import org.uce.web.domain.Matricula;
import org.uce.web.infraestructure.MatriculaRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class MatriculaService {
    @Inject
    MatriculaRepository matriculaRepository;

    public List<MatriculaRepresentation> findAll() {
        List<MatriculaRepresentation> matriculas = new ArrayList<>();
        for (Matricula matricula : matriculaRepository.listAll()) {
            matriculas.add(mapperToMR(matricula));
        }
        return matriculas;
    }

    public MatriculaRepresentation findById(Long id) {
        return mapperToMR(matriculaRepository.findById(id));
    }

    @Transactional
    public MatriculaRepresentation save(MatriculaRepresentation matriculaR) {
        matriculaRepository.persist(mapperToM(matriculaR));
        return mapperToMR(matriculaRepository.findById(matriculaR.getId()));
    }

    @Transactional
    public void delete(Long id) {
        matriculaRepository.deleteById(id);
    }

    @Transactional
    public void update(Long id, MatriculaRepresentation matriculaR) {
        Matricula matricula = mapperToM(findById(id));
        matricula.setFechaMatricula(matriculaR.getFechaMatricula());
        matricula.setEstado(matriculaR.getEstado());
    }

    private Matricula mapperToM(MatriculaRepresentation matriculaR) {
        Matricula matricula = new Matricula();
        matricula.setId(matriculaR.getId());
        matricula.setFechaMatricula(matriculaR.getFechaMatricula());
        matricula.setEstado(matriculaR.getEstado());
        return matricula;
    }

    private MatriculaRepresentation mapperToMR(Matricula matricula) {
        MatriculaRepresentation matriculaR = new MatriculaRepresentation();
        matriculaR.setId(matricula.getId());
        matriculaR.setFechaMatricula(matricula.getFechaMatricula());
        matriculaR.setEstado(matricula.getEstado());
        return matriculaR;
    }
}
