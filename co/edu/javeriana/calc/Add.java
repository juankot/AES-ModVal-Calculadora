package co.edu.javeriana.calc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/add")
public interface Add {
  @GET
  @Produces("application/json")
  GetAddResponse getAdd(@QueryParam("num1") int num1, @QueryParam("num2") int num2);

  class GetAddResponse extends ResponseDelegate {
    private GetAddResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetAddResponse(Response response) {
      super(response);
    }

    public static GetAddResponse respond200WithApplicationJson(Result entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetAddResponse(responseBuilder.build(), entity);
    }
  }
}
