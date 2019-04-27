package br.edu.unicesumar.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/calculadora")
public class CalculadoraService {

	@GET
	@Path("/teste/{nome}/{sobrenome}")
	public Response olaMundo(@PathParam("nome") String nome, @PathParam("sobrenome") String sobrenome) {
		return Response.status(200).entity("Ola mundo: "+nome+" "+sobrenome).build();
	}
}
