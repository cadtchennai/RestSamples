package com.CustomerDetails.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public class Addition {

    @GET
    @Path("/get/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String addPlainTextget(@PathParam("a") double a, @PathParam("b") double b) {
         String x = (a + b) + "";
		return x;
	
    }

    @GET
    @Path("/result")
    @Produces(MediaType.TEXT_PLAIN)
    public String addPlainTextget1( String x) {
       
		return x;
    }
   
    
    
    
    
    @POST
    @Path("/post/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String addPlainTextPost(@PathParam("a") double a, @PathParam("b") double b) {
        return addPlainText(a,b);
    }

    public String addPlainText(double a, double b) {
        return (a + b) + "";
    }
 }