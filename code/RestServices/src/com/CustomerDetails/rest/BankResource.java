package com.CustomerDetails.rest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;



public class BankResource {
	
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	String accNo;

	

	BankService bankService;
	
	public BankResource(UriInfo uriInfo, Request request, String accNo) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.accNo = accNo;
		bankService = new BankService();
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Bank getBank() {
		Bank bank = bankService.getBank(accNo);
		return bank;
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public Bank getBankAsHtml() {
		Bank bank = bankService.getBank(accNo);
		return bank;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Response putBank(JAXBElement<Bank> bankElement) {
		Bank bank = bankElement.getValue();
		Response response;
		if (bankService.getBanks().containsKey(bank.getAccNo())) {
			response = Response.noContent().build();
		} else {
			response = Response.created(uriInfo.getAbsolutePath()).build();
		}
		bankService.createBank(bank);
		return response;
	}

	
}

