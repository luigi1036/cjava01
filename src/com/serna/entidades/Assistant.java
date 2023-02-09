package com.serna.entidades;

import com.serna.utils.Locations;

public class Assistant extends Person{

    private String telephone;
    private String address;


    public Assistant(String name, String lastName, String email) {
        super(name, lastName, email);
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void buyEvent(Event event, Locations location){
        event.setLocation(location);
        event.addAssistant(this);
        //this.setEvent(event);
    }

    public String toString() {
        return "Assistant{" +
                super.toString() +
                "telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
