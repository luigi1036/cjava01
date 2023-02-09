package com.serna.utils;

public enum Locations {

    P( "Platinum"), G("Gold"), V("VIP");

    private final String description;

    private Locations(String description){
        this.description= description;
    }
}
