package com.CustomerDetails.rest;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

@Path("/banks")
public class BanksResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	BankService bankService;

	public BanksResource() {
	bankService = new BankService();
	}

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Bank> getBanks() {
		return bankService.getBankAsList();
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public List<Bank> getBankAsHtml() {
		return bankService.getBankAsList();
	}

	
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void createBank(@FormParam("accno") String accNo,
			@FormParam("customername") String name,
			@FormParam("acctype") String accType,
			@Context HttpServletResponse servletResponse) throws IOException {
		Bank bank = new Bank(accNo, name, accType);
	bankService.createBank(bank);
		servletResponse.sendRedirect("./banks/");
	}

	@Path("{bank}")
	public BankResource getBank(@PathParam("bank") String accNo) {
	
		return new BankResource(uriInfo, request, accNo);
	}

}