package org.uce.web.application;

import java.util.ArrayList;
import java.util.List;

import org.uce.web.application.representation.MateriaRepresentation;
import org.uce.web.domain.Materia;
import org.uce.web.infraestructure.MateriaRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class MateriaService {
    @Inject
    MateriaRepository materiaRepository;

    public List<MateriaRepresentation> findAll() {
        List<MateriaRepresentation> materias = new ArrayList<>();
        for (Materia materia : materiaRepository.listAll()) {
            materias.add(mapperToMR(materia));
        }
        return materias;
    }

    public MateriaRepresentation findById(Long id) {
        return mapperToMR(materiaRepository.findById(id));
    }

    @Transactional
    public MateriaRepresentation save(MateriaRepresentation materiaR) {
        materiaRepository.persist(mapperToM(materiaR));
        return mapperToMR(materiaRepository.findById(materiaR.getId()));
    }

    @Transactional
    public void delete(Long id) {
        materiaRepository.deleteById(id);
    }

    @Transactional
    public void updateParcial(Long id, MateriaRepresentation materiaR) {
        Materia materia = mapperToM(findById(id));
        if (materiaR.getNombre() != null) {
            materia.setNombre(materiaR.getNombre());
        }
        if (materiaR.getCreditos() != 0) {
            materia.setCreditos(materiaR.getCreditos());
        }
    }

    private Materia mapperToM(MateriaRepresentation materiaR) {
        Materia materia = new Materia();
        materia.setId(materiaR.getId());
        materia.setNombre(materiaR.getNombre());
        materia.setCreditos(materiaR.getCreditos());
        return materia;
    }

    private MateriaRepresentation mapperToMR(Materia materia) {
        MateriaRepresentation materiaR = new MateriaRepresentation();
        materiaR.setId(materia.getId());
        materiaR.setNombre(materia.getNombre());
        materiaR.setCreditos(materia.getCreditos());
        return materiaR;
    }
}
