package com.serna.pruebas;

import com.serna.entidades.Event;
import com.serna.entidades.EventBuilder;
import com.serna.utils.Locations;


public class Prueba02 {

    public static void main(String[] args) {

        EventBuilder builder = new EventBuilder("Java");
        EventBuilder builder2 = new EventBuilder("Java");

        Event event = builder.setLocation(Locations.P).setDuration(1.5).build();
        Event evento = builder.setLocation(Locations.G).setCost(455F).build();

        System.out.println(event);
        System.out.println(evento);


    }
}
