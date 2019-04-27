package br.edu.unicesumar.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.edu.unicesumar.model.Produto;

@Path("/json/produto")
public class ProdutoService {

	@GET
	@Path("/get")
	@Produces("application/json")
	public Produto getProdutoJSON() {
		Produto produto = new Produto();
		produto.setNome("Moto X - Android");
		produto.setQuantidade(10);

		return produto;
	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response criarProdutoJSON(Produto produto) {
		String result = "Product created : " + produto.toString();
		return Response.status(201).entity(result).build();
	}

}

