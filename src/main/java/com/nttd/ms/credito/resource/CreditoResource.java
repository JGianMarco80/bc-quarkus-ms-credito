package com.nttd.ms.credito.resource;

import com.nttd.ms.credito.entity.Credito;
import com.nttd.ms.credito.service.CreditoService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/credito")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CreditoResource {

    @Inject
    CreditoService creditoService;

    @GET
    public List<Credito> findAll() {
        return creditoService.findAll();
    }

    @GET
    @Path("/{id}")
    public Credito findAll(@PathParam("id") Long id) {
        return creditoService.findById(id);
    }

    @POST
    @Transactional
    public void save(Credito credito){
        creditoService.save(credito);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public void update(@PathParam("id") Long id, Credito credito){
        creditoService.update(id, credito);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Long id){
        creditoService.delete(id);
    }

}
