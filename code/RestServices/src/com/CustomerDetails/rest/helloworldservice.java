package com.CustomerDetails.rest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
public class helloworldservice {

	@GET
	@Path("/plain")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello Customer!";
	}

	@GET
	@Path("/xml")
	@Produces(MediaType.APPLICATION_XML)
    public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello Customer"
				+ "</hello>";
	}

	@GET
	@Path("/html")
	@Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
		return "<html> " + "<title>" + "Hello Customer"
				+ "</title>" + "<body><h1>" + "Hello Customer"
				+ "</body></h1>" + "</html> ";
	

}
}