package com.serna.pruebas;

import com.serna.entidades.Assistant;
import com.serna.entidades.Event;
import com.serna.entidades.Exhibitor;
import com.serna.utils.MisConstantes;

import java.time.LocalTime;
import java.util.List;

public class Prueba01 {
    public static void main(String[] args) {

        LocalTime timeEntry = LocalTime.of(6, 30, 00);
        LocalTime departureTime = LocalTime.of(8, 00, 00);

        Exhibitor exhibitor01 = new Exhibitor("Joseu", "Miller", "JMiller@correo.com", 1500F);
        Event event01 = new Event("Intoduccion a la programacion", exhibitor01,
                            1.5, timeEntry, departureTime, 4F );
        Event event02 = new Event("Docker", exhibitor01,
                1.5, timeEntry, departureTime, 4F );
        Assistant assistant01 = new Assistant("Martin", "castro", "ccastro@correo.com");
        //assistant01.buyEvent(event01, MisConstantes.PLATINUM);
        //event01.addAssistant(assistant01);
        List<Event> events = List.of(event01, event02);
        for (Event event: events  ) {
            System.out.println(event);
        }
    }


}
