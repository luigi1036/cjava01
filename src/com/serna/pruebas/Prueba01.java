package com.serna.pruebas;


import com.serna.entidades.Assistant;
import com.serna.entidades.Event;
import com.serna.entidades.Exhibitor;
import com.serna.utils.Events;
import com.serna.utils.Locations;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Prueba01 {
    public static void main(String[] args) {

        Events events = new Events();
        Stream<Event> eventosOrganizados = events.getEvents().stream().sorted();

        System.out.println("mi primer mensaje para el primer commit");
        System.out.println("mi segundo mensaje para el segundo commit");
        System.out.println("mi tercer mensaje para el tercer commit");

        eventosOrganizados
                .forEach(e -> {
                    System.out.println(e.showInformation());
                });

        System.out.println("segunda prueba de commit");
        System.out.println("tercera prueba de commit");
    }


}
