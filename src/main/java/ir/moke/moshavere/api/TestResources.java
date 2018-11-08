package ir.moke.moshavere.api;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class TestResources {

    @Path("/hello")
    @GET
    @RolesAllowed("admin")
    public String sayHello() {
        return "Hello ....";
    }

    @Path("/bye")
    @GET
    public String sayBye() {
        return "Bye bye";
    }
}
