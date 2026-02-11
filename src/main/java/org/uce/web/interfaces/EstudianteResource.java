package org.uce.web.interfaces;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

import org.uce.web.application.EstudianteService;
import org.uce.web.application.representation.EstudianteRepresentation;

@Path("/estudiantes")
public class EstudianteResource {

    @Inject
    EstudianteService estudianteService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<EstudianteRepresentation> findAll() {
        return estudianteService.findAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void save(EstudianteRepresentation estudianteR) {
        estudianteService.save(estudianteR);
    }

    @PATCH
    @Path("/modificar/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void updateParcial(@PathParam("id") Long id, EstudianteRepresentation estudianteR) {
        estudianteService.updateParcial(id, estudianteR);
        System.out.println("Estudiante actualizado parcialmente");
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public EstudianteRepresentation findById(@PathParam("id") Long id) {
        return estudianteService.findById(id);
    }

}
