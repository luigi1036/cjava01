package com.serna.entidades;

import com.serna.interfaces.Builder;
import com.serna.utils.Locations;

import java.time.LocalTime;
import java.util.List;

public class EventBuilder implements Builder {

    private int code;
    private String tittle;
    private Exhibitor exhibitor;
    private List<Assistant> assistantList;
    private Double duration;
    private LocalTime entryTime;
    private LocalTime departureTime;
    private String season;
    private Float discount;

    private Float cost;
    private Locations location;

    private static int counter =1;

    public EventBuilder(String tittle) {
        this.code = counter++;
        this.tittle = tittle;
    }

    public EventBuilder setCode(int code){
        this.code = code;
        return this;
    }


    public EventBuilder setTittle(String tittle) {
        this.tittle = tittle;
        return this;

    }


    public EventBuilder setExhibitor(Exhibitor exhibitor) {
        this.exhibitor = exhibitor;
        return this;
    }



    public EventBuilder setDuration(Double duration) {
        this.duration= duration;
        return this;
    }


    public EventBuilder setEntryTime(LocalTime entryTime) {
        this.entryTime=entryTime;
        return this;
    }


    public EventBuilder setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
        return this;
    }


    public EventBuilder setSeason(String season) {
        this.season = season;
        return this;
    }


    public EventBuilder setDiscount(Float discount) {
        this.discount = discount;
        return this;
    }


    public EventBuilder setCost(Float cost) {
        this.cost = cost;
        return this;
    }


    public EventBuilder setLocation(Locations location) {

        switch (location){
            case P -> this.location = Locations.P.getd;
        }
        this.location = location;
        return this;
    }

    @Override
    public Event build() {
        Event event = new Event();
        event.setCode(this.code);
        event.setTittle(this.tittle);
        event.setExhibitor(this.exhibitor);
        event.setDuration(this.duration);
        event.setEntryTime(this.entryTime);
        event.setDepartureTime(this.departureTime);
        event.setSeason(this.season);
        event.setDiscount(this.discount);
        event.setLocation(this.location);
        event.setCost(this.cost);
        return event;
    }
}
