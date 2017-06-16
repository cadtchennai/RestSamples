package com.Customer;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement()
public class Customer {
   
        private PermanentAddress permanentAddress;
        private TemporaryAddress temporaryAddress;

    
    public Customer() {

	}

	public Customer(PermanentAddress permanentAddress,TemporaryAddress temporaryAddress) {
		
		this.permanentAddress = permanentAddress;
		this.temporaryAddress = temporaryAddress;
		
	}
    

   
    public PermanentAddress getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(PermanentAddress permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	  
	public TemporaryAddress getTemporaryAddress() {
	        return temporaryAddress;
	    }

	   
	public void setTemporaryAddress(TemporaryAddress temporaryAddress) {
	        this.temporaryAddress = temporaryAddress;
	    }
}