package com.mkyong.client;

import com.mkyong.Student;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClient {

	public static void main(String[] args) {
		try {

			Student st = new Student("Adriana", "Barrer", 12, 9);

			Client client = Client.create();

			WebResource webResource = client
					.resource("http://localhost:8080/JerseyXMLExample/rest/xmlServices/send");

			ClientResponse response = webResource.accept("application/xml")
					.post(ClientResponse.class, st);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("Server response .... \n");
			System.out.println(output);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}