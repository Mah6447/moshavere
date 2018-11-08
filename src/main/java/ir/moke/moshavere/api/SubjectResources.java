package ir.moke.moshavere.api;

import ir.moke.moshavere.model.entity.Subject;
import ir.moke.moshavere.model.service.SubjectService;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/subject")
public class SubjectResources {

    @EJB
    private SubjectService service;

    @Path("/save")
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response save(Subject  subject){
        service.save(subject);
        return Response.ok("ok").build();
    }

    @Path("/{id}")
    @GET
    @Produces("application/json")
    public Response find(@PathParam("id") long id){
        Subject subject = service.find(id);
        return Response.ok(subject).build();
    }

    @Path("/all")
    @GET
    @Produces("application/json")
    public Response findAll() {
        List<Subject> list = service.findAll();
        return Response.ok(list).build();
    }
}
