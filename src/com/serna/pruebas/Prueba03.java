package com.serna.pruebas;

import com.serna.entidades.Assistant;
import com.serna.entidades.Event;
import com.serna.utils.Events;

public class Prueba03 {

    public static void main(String[] args) {

        Events events = new Events();

        Double totalCollected = 0.0;

        for (Event e : events.getEvents() ){
            System.out.println(e.showInformation());
            for(Assistant a : e.getAssistantList()){
                totalCollected = totalCollected + a.getTotalCost();
            }
            System.out.println("Total recaudado en el curso de : " + e.getTittle() + " es: "+ totalCollected);
            totalCollected = 0.0;
        }


    }
}
