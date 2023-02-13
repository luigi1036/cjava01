package com.serna.entidades;

import com.serna.utils.Locations;

public class Assistant extends Person{

    private String telephone;
    private String address;
    private String localityPurchased;
    private  Double totalCost;

    public Assistant(String name, String lastName, String email) {
        super(name, lastName, email);
    }

    public String getLocalityPurchased() {
        return localityPurchased;
    }

    public void setLocalityPurchased(String localityPurchased) {
        this.localityPurchased = localityPurchased;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public void buyEvent(Event event, Locations location){
        this.setLocalityPurchased(location.getDescripcion());
       event.setLocation(location);
       event.addAssistantList(this);
       this.setTotalCost(event.costEvent());
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", localityPurchased='" + localityPurchased + '\'' +
                '}';
    }
}
