package co.edu.javeriana.calc;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/mul")
public interface Mul {
  @POST
  @Produces("application/json")
  @Consumes("application/json")
  PostMulResponse postMul(Terms entity);

  class PostMulResponse extends ResponseDelegate {
    private PostMulResponse(Response response, Object entity) {
      super(response, entity);
    }

    private PostMulResponse(Response response) {
      super(response);
    }

    public static PostMulResponse respond200WithApplicationJson(Result entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostMulResponse(responseBuilder.build(), entity);
    }
  }
}
