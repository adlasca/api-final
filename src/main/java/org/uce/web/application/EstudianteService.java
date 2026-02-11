package org.uce.web.application;

import java.util.ArrayList;
import java.util.List;

import org.uce.web.application.representation.EstudianteRepresentation;
import org.uce.web.domain.Estudiante;
import org.uce.web.infraestructure.EstudianteRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class EstudianteService {
    @Inject
    EstudianteRepository estudianteRepository;

    public List<EstudianteRepresentation> findAll() {
        List<EstudianteRepresentation> estudiantes = new ArrayList<>();
        for (Estudiante estudiante : estudianteRepository.listAll()) {
            estudiantes.add(mapperToER(estudiante));
        }
        return estudiantes;
    }

    public EstudianteRepresentation findById(Long id) {
        return mapperToER(estudianteRepository.findById(id));
    }

    @Transactional
    public void save(EstudianteRepresentation estudianteR) {
        estudianteRepository.persist(mapperToE(estudianteR));
    }

    @Transactional
    public void delete(Long id) {
        estudianteRepository.deleteById(id);
    }

    @Transactional
    public void update(Long id, EstudianteRepresentation estudianteR) {
        Estudiante estudiante = mapperToE(findById(id));
        estudiante.setNombre(estudianteR.getNombre());
        estudiante.setApellido(estudianteR.getApellido());
        estudiante.setFechaNacimiento(estudianteR.getFechaNacimiento());
        estudiante.setGenero(estudianteR.getGenero());
        estudiante.setCedula(estudianteR.getCedula());
        estudiante.setCorreo(estudianteR.getCorreo());
        estudiante.setTelefono(estudianteR.getTelefono());
    }

    @Transactional
    public void updateParcial(Long id, EstudianteRepresentation estudianteR) {
        Estudiante estudiante = mapperToE(findById(id));
        if (estudianteR.getNombre() != null) {
            estudiante.setNombre(estudianteR.getNombre());
        }
        if (estudianteR.getApellido() != null) {
            estudiante.setApellido(estudianteR.getApellido());
        }
        if (estudianteR.getFechaNacimiento() != null) {
            estudiante.setFechaNacimiento(estudianteR.getFechaNacimiento());
        }
        if (estudianteR.getGenero() != null) {
            estudiante.setGenero(estudianteR.getGenero());
        }
        if (estudianteR.getCedula() != null) {
            estudiante.setCedula(estudianteR.getCedula());
        }
        if (estudianteR.getCorreo() != null) {
            estudiante.setCorreo(estudianteR.getCorreo());
        }
        if (estudianteR.getTelefono() != null) {
            estudiante.setTelefono(estudianteR.getTelefono());
        }
    }

    private EstudianteRepresentation mapperToER(Estudiante est) {
        EstudianteRepresentation estuR = new EstudianteRepresentation();
        estuR.setId(est.getId());
        estuR.setNombre(est.getNombre());
        estuR.setApellido(est.getApellido());
        estuR.setFechaNacimiento(est.getFechaNacimiento());
        estuR.setGenero(est.getGenero());
        estuR.setCedula(est.getCedula());
        estuR.setCorreo(est.getCorreo());
        estuR.setTelefono(est.getTelefono());
        return estuR;
    }

    private Estudiante mapperToE(EstudianteRepresentation estR) {
        Estudiante estu = new Estudiante();
        estu.setId(estR.getId());
        estu.setNombre(estR.getNombre());
        estu.setApellido(estR.getApellido());
        estu.setFechaNacimiento(estR.getFechaNacimiento());
        estu.setGenero(estR.getGenero());
        estu.setCedula(estR.getCedula());
        estu.setCorreo(estR.getCorreo());
        estu.setTelefono(estR.getTelefono());
        return estu;
    }
}
