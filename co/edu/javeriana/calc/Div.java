package co.edu.javeriana.calc;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/div")
public interface Div {
  @PUT
  @Produces("application/json")
  PutDivResponse putDiv(@QueryParam("num1") int num1, @QueryParam("num2") int num2);

  class PutDivResponse extends ResponseDelegate {
    private PutDivResponse(Response response, Object entity) {
      super(response, entity);
    }

    private PutDivResponse(Response response) {
      super(response);
    }

    public static PutDivResponse respond200WithApplicationJson(Result entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PutDivResponse(responseBuilder.build(), entity);
    }
  }
}
