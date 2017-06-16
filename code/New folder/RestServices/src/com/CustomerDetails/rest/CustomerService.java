package com.CustomerDetails.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.Customer.Customer;
import com.Customer.PermanentAddress;
import com.Customer.TemporaryAddress;




@Path("/customer")
public class CustomerService {
	@GET
	    @Path("id/{id}")
	    @Produces({ MediaType.APPLICATION_XML })
	    public Customer getCustomer(@PathParam("id") String id) {
	        Customer customer = new Customer();
	        TemporaryAddress a=new TemporaryAddress();
	        a.setCity("Erode");
	        a.setState("TN");
	        PermanentAddress b=new  PermanentAddress();
	        b.setCity("Chennai");
	        b.setState("TN");
	        
	        
	        customer.setTemporaryAddress(a);
	        customer.setPermanentAddress(b);
	        
	       return customer;
	 }

    @POST
	@Path("/xmltoxml")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Customer consumeXML1( Customer customer ) {
			return customer;
	}
    
    @POST
   	@Path("/xmltojson")
   	@Consumes(MediaType.APPLICATION_XML)
   	@Produces(MediaType.APPLICATION_JSON)
   	public Customer consumeXML2( Customer customer ) {
   			return customer;
   	}
    @POST
   	@Path("/jsontojson")
   	@Consumes(MediaType.APPLICATION_JSON)
   	@Produces(MediaType.APPLICATION_JSON)
   	public Customer consumejson( Customer customer ) {
   			return customer;
   	}
    @POST
   	@Path("/jsontoxml")
   	@Consumes(MediaType.APPLICATION_JSON)
   	@Produces(MediaType.APPLICATION_JSON)
   	public Customer consumejson2( Customer customer ) {
   			return customer;
   	}
}
	
