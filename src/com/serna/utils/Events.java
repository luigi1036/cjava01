package com.serna.utils;

import com.serna.entidades.Assistant;
import com.serna.entidades.Event;
import com.serna.entidades.Exhibitor;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Events {

    private List<Event> events;

    Exhibitor exhibitor = new Exhibitor("Luis", "Serna", "lserna@correo.com", 1900.0 );
    Exhibitor exhibitor1 = new Exhibitor("Samuel", "Mejia", "smejia@correo.com", 1600.0 );
    Exhibitor exhibitor2 = new Exhibitor("melisa", "bernal", "mbernal@correo.com", 1900.0 );

    Assistant assistant = new Assistant("Pedro", "perez", "pperez@correo.com");
    Assistant assistant1 = new Assistant("Juan", "ocampo", "jocampo@correo.com");
    Assistant assistant2 = new Assistant("veronica", "quiroz", "vquiroz@correo.com");
    Assistant assistant3 = new Assistant("sandra", "villada", "svillada@correo.com");
    Assistant assistant4 = new Assistant("ines", "villa", "ivilla@correo.com");
    Assistant assistant5 = new Assistant("ana", "ruiz", "aruiz@correo.com");
    Assistant assistant6 = new Assistant("camilo", "mejia", "cmejia@correo.com");
    Assistant assistant7 = new Assistant("carlos", "gonzalez", "cgonzalez@correo.com");
    Assistant assistant8 = new Assistant("alberto", "bahia", "abahia@correo.com");
    Assistant assistant9 = new Assistant("raul", "ortega", "rortega@correo.com");



    Event event = new Event.EventBuilder().tittle("Java").duration(2.0)
            .entryTime(LocalTime.of(6, 00)).departureTime(LocalTime.of(8, 00))
            .season("Alta").exhibitor(exhibitor).build();

    Event event1 = new Event.EventBuilder().tittle("Docker").duration(3.0)
            .entryTime(LocalTime.of(5, 00)).departureTime(LocalTime.of(8, 00))
            .season("Baja").exhibitor(exhibitor1).build();
    Event event2 = new Event.EventBuilder().tittle("Aws").duration(4.0)
            .entryTime(LocalTime.of(5, 00)).departureTime(LocalTime.of(9, 00))
            .season("Alta").exhibitor(exhibitor2).build();




    public List<Event> getEvents(){
        events = new ArrayList<>();
        events.add(event);
        events.add(event1);
        events.add(event2);

        assistant.buyEvent(event, Locations.G);
        assistant1.buyEvent(event, Locations.P);
        assistant2.buyEvent(event, Locations.V);
        assistant3.buyEvent(event1, Locations.G);
        assistant4.buyEvent(event2, Locations.G);
        return events;
    }

}
