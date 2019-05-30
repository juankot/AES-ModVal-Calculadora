package co.edu.javeriana.calc;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/sub")
public interface Sub {
  @DELETE
  @Produces("application/json")
  @Consumes("application/json")
  DeleteSubResponse deleteSub(Terms entity);

  class DeleteSubResponse extends ResponseDelegate {
    private DeleteSubResponse(Response response, Object entity) {
      super(response, entity);
    }

    private DeleteSubResponse(Response response) {
      super(response);
    }

    public static DeleteSubResponse respond200WithApplicationJson(Result entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new DeleteSubResponse(responseBuilder.build(), entity);
    }
  }
}
