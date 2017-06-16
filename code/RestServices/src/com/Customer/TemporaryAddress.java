package com.Customer;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlElement(ns="Temporary address")
public class TemporaryAddress {
    private String city;
    private String state;
    public TemporaryAddress () {

   	}

   	public TemporaryAddress (String city, String state) {
   		this.city = city;
   		this.state = state;
   		
   	}
       

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}