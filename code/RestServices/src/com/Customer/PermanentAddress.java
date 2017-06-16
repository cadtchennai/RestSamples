package com.Customer;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlElement(ns="Permanent address")
public class PermanentAddress {
    private String city;
    private String state;
    public PermanentAddress () {

   	}

   	public PermanentAddress (String city, String state) {
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