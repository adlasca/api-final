package org.uce.web.interfaces;

import java.util.List;

import org.uce.web.application.MateriaService;
import org.uce.web.application.representation.MateriaRepresentation;
import org.uce.web.domain.Materia;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/materias")
public class MateriaResource {
    @Inject
    MateriaService materiaService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MateriaRepresentation> findAll() {
        return materiaService.findAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void save(MateriaRepresentation materiaR) {
        materiaService.save(materiaR);
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public MateriaRepresentation findById(@PathParam("id") Long id) {
        return materiaService.findById(id);
    }

    @PATCH
    @Path("/modificar/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void updateParcial(@PathParam("id") Long id, MateriaRepresentation materiaR) {
        materiaService.updateParcial(id, materiaR);
        System.out.println("Materia actualizada parcialmente");
    }

}
