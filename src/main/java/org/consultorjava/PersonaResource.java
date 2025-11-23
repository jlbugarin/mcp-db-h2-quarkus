package org.consultorjava;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

import io.quarkiverse.mcp.server.Tool;

@Path("/personas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonaResource {

    @GET
    public List<Persona> getAll() {
        return Persona.listAll();
    }

    @POST
    @Transactional
    public Persona create(Persona persona) {
        persona.persist();
        return persona;
    }

    @GET
    @Path("/{id}")
    public Persona findById(@PathParam("id") Long id) {
        return Persona.findById(id);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Persona update(@PathParam("id") Long id, Persona datos) {
        Persona p = Persona.findById(id);
        if (p == null) {
            throw new NotFoundException();
        }

        p.primerNombre = datos.primerNombre;
        p.segundoNombre = datos.segundoNombre;
        p.apellidoPaterno = datos.apellidoPaterno;
        p.apellidoMaterno = datos.apellidoMaterno;
        p.correoElectronico = datos.correoElectronico;
        p.numeroCelular = datos.numeroCelular;
        p.departamentoNumero = datos.departamentoNumero;
        p.estacionamientoNumero = datos.estacionamientoNumero;

        return p;
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Long id) {
        Persona.deleteById(id);
    }
}
