package com.serna.pruebas;


import com.serna.entidades.Event;
import com.serna.utils.Events;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Prueba02 {

    public static void main(String[] args) {

        Events events = new Events();
        Stream<Event> eventsPlatinum;
        Stream<Event> eventsGodl;
        Stream<Event> eventsVip;

        eventsPlatinum =  events.getEvents().stream().filter(e -> e.getLocation().getDescripcion().equals("Platinum"));

        eventsGodl =  events.getEvents().stream().filter(e -> e.getLocation().getDescripcion().equals("Gold"));


        eventsVip =  events.getEvents().stream().filter(e -> e.getLocation().getDescripcion().equals("VIP"));

        System.out.println("Eventos Platinum");
        eventsPlatinum.forEach(e -> {
            System.out.println(e.showInformationTwo());
        });

        System.out.println("Eventos Gold");
        eventsGodl.forEach(e -> {
            System.out.println(e.showInformationTwo());
        });

        System.out.println("Eventos VIP");
        eventsVip.forEach(e -> {
            System.out.println(e.showInformationTwo());
        });


    }
}
