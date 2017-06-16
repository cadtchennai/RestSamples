package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mkyong.Student;

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
	@Path("/send")
	@Consumes(MediaType.APPLICATION_XML)
	public Response consumeXML( Student student ) {
		
		String output = student.toString();

		return Response.status(200).entity(output).build();
	}

	@POST
	@Path("/sendxml")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Student consumeXML1( Student student ) {
		
		//String output = student.toString();

		return student;
	}


}
