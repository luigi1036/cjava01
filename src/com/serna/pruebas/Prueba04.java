package com.serna.pruebas;

import com.serna.entidades.Assistant;
import com.serna.entidades.Event;
import com.serna.utils.Events;

import java.util.ArrayList;
import java.util.List;

public class Prueba04 {

    public static void main(String[] args) {

        Events events = new Events();

        List<Assistant> assistantPlatinum = new ArrayList<>();
        List<Assistant> assistantGodl = new ArrayList<>();
        List<Assistant> assistantVip = new ArrayList<>();

       for(Event e: events.getEvents()){
           for(Assistant a: e.getAssistantList()){
               if(a.getLocalityPurchased().equals("Platinum")){
                   assistantPlatinum.add(a);
               } else if (a.getLocalityPurchased().equals("Gold")) {
                   assistantGodl.add(a);
               }else {
                   assistantVip.add(a);
               }
           }
       }

        System.out.println("platinum:: " + assistantPlatinum);
        System.out.println("Gold:: " + assistantGodl);
        System.out.println("VIP:: " + assistantVip);
    }
}
