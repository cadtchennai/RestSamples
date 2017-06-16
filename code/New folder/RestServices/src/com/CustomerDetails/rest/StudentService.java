package com.CustomerDetails.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.CustomerDetails.Student;

@Path("/xmlServices")
public class StudentService {

	@GET
	@Path("/print/{name}")

	@Produces(MediaType.APPLICATION_XML)
	public Student responseMsg( @PathParam("name") String name ) {
		
		Student st = new Student(name, "Diaz",22,1);

		return st;

	}
	
	@POST
	@Path("/xmltoplain")
	@Consumes(MediaType.APPLICATION_XML)

	public Response consumeXML( Student student ) {
		
		String output = student.toString();

		return Response.status(200).entity(output).build();
	}

	@POST
	@Path("/xmltojson")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public Student consumeXML1( Student student ) {
		
		//String output = student.toString();

		return student;
	}
	@POST
	@Path("/xmltoxml")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Student consumeXML2( Student student ) {
		
		//String output = student.toString();

		return student;
	}
	
	@GET
	@Path("/printjson/{name}")
	@Produces(MediaType.APPLICATION_JSON)

	
	public Student responseMsg1( @PathParam("name") String name ) {
		
		Student st = new Student(name, "Diaz",22,1);

		return st;

	}
	
	@POST
	@Path("/jsontoplain")
	@Consumes(MediaType.APPLICATION_JSON)
	
	
	public Response consumejson1( Student student ) {
		
		String output = student.toString();

		return Response.status(200).entity(output).build();
	}

	
	
	
	@POST
	@Path("/jsontojson")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Student consumejson( Student student ) {
		
		//String output = student.toString();

		return student;
	}
	@POST
	@Path("/jsontoxml")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_XML)
	public Student consumejson2( Student student ) {
		
		//String output = student.toString();

		return student;
	}


}
