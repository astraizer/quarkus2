package com.nostratech.store.resource;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.nostratech.store.dto.BookCreateRequestDTO;
import com.nostratech.store.service.BookService;

@Path("v1")
@Produces("application/json")
@Consumes("application/json")
@ApplicationScoped
public class BookResource {
	
	private BookService bookService;

	public BookResource(BookService bookService) {
		super();
		this.bookService = bookService;
	}

	@POST
	@Path("book")
	public Response save(BookCreateRequestDTO dto) {

		bookService.createBook(dto);
		return Response.ok().status(201).build();
	}
}
