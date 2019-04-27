package br.edu.unicesumar.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.edu.unicesumar.dao.ProdutoDAO;
import br.edu.unicesumar.model.Produto;

@Path("/json/produto")
public class ProdutoService {
	private ProdutoDAO dao = new ProdutoDAO();
	
	@GET
	@Path("/get")
	@Produces("application/json/{id}")
	public Produto getProdutoJSON(@PathParam("id")Long id) {
		Produto produto = new Produto();
		produto.setNome("Moto X - Android");
		produto.setQuantidade(10);

		return produto;
	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response criarProdutoJSON(Produto produto) {
		dao.save(produto);
		
		String result = "Product created : " + produto.toString();
		return Response.status(201).entity(result).build();
	}
}

