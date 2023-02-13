package com.serna.entidades;


import com.serna.utils.Locations;
import com.serna.utils.MisConstantes;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Event implements Comparable<Event> {

    private final int code;
    private final String tittle;
    private final Exhibitor exhibitor;
    private List<Assistant> assistantList;
    private final Double duration;
    private final LocalTime entryTime;
    private final LocalTime departureTime;
    private final String season;
    private Double discount;
    private Double cost;
    private Double totalCost;
    private Locations location;

    public Locations getLocation() {
        return location;
    }

    public void setLocation(Locations location) {
        this.location = location;
    }

    public String getTittle() {
        return tittle;
    }

    private static int counter =1;


    private Event(EventBuilder builder){
        this.assistantList = new ArrayList<>();
        this.code = counter++;
        this.tittle = builder.tittle;
        this.exhibitor = builder.exhibitor;
        this.duration = builder.duration;
        this.entryTime = builder.entryTime;
        this.departureTime = builder.departureTime;
        this.season = builder.season;
        this.totalCost = builder.totalCost;

    }

    @Override
    public int compareTo(Event o) {
        return this.tittle.compareTo(o.tittle);
    }

    public List<Assistant> getAssistantList() {
        return assistantList;
    }

    public static class EventBuilder {
        private String tittle;
        private Exhibitor exhibitor;
        private Double duration;
        private LocalTime entryTime;
        private LocalTime departureTime;
        private String season;
        private Double totalCost;
        public EventBuilder(){

        }

        public EventBuilder tittle(String tittle) {
            this.tittle = tittle;
            return this;

        }


        public EventBuilder exhibitor(Exhibitor exhibitor) {
            this.exhibitor = exhibitor;
            return this;
        }



        public EventBuilder duration(Double duration) {
            this.duration= duration;
            return this;
        }


        public EventBuilder entryTime(LocalTime entryTime) {
            this.entryTime=entryTime;
            return this;
        }


        public EventBuilder departureTime(LocalTime departureTime) {
            this.departureTime = departureTime;
            return this;
        }


        public EventBuilder season(String season) {
            this.season = season;
            return this;
        }

        public Event build(){
            return new Event(this);
        }

    }

    public Double costEvent(){
        double tax;
        double discount;
        switch (this.location.getDescripcion()){

            case "Platinum":
                tax = MisConstantes.PLATINUM * MisConstantes.IGV;
                discount= this.discountEvent(MisConstantes.PLATINUM);
                this.cost = MisConstantes.PLATINUM + tax - discount ;
                break;
            case "Gold":
                tax = MisConstantes.GOLD * MisConstantes.IGV;
                discount = this.discountEvent(MisConstantes.GOLD);
                this.cost = MisConstantes.GOLD + tax - discount ;
                break;
            case "VIP":
                tax = MisConstantes.VIP * MisConstantes.IGV;
                discount = this.discountEvent(MisConstantes.VIP);
                this.cost = MisConstantes.VIP + tax - discount ;
                break;
        }
        return this.cost;
    }

    public Double discountEvent(Double cost){
        if(this.season.equals("Alta")){
            this.discount = cost * MisConstantes.ALTA;
        }else if(this.season.equals("Baja")){
            this.discount = cost * MisConstantes.BAJA;
        }else {
            this.discount = 0.0;
        }
        return this.discount;
    }

    public List<Assistant> addAssistantList(Assistant assistant){
        this.assistantList.add(assistant);
        return this.assistantList;
    }
    public String showInformation() {
        return "Event{" +
                "code=" + code +
                ", tittle='" + tittle + '\'' +
                ", exhibitor=" + exhibitor +
                ", assistantList=" + assistantList+
                '}';
    }

    public String showInformationTwo() {
        return "Event{" +
                "code=" + code +
                ", tittle='" + tittle + '\'' +
                ", cost=" + cost +
                ", location=" + location.getDescripcion() +
                '}';
    }

    @Override
    public String toString() {
        return "Event{" +
                "code=" + code +
                ", tittle='" + tittle + '\'' +
                ", exhibitor=" + exhibitor +
                ", assistantList=" + assistantList +
                ", duration=" + duration +
                ", entryTime=" + entryTime +
                ", departureTime=" + departureTime +
                ", season='" + season + '\'' +
                ", discount=" + discount +
                ", cost=" + cost +
                ", totalCost=" + totalCost +
                ", location=" + location.getDescripcion() +
                '}';
    }
}
