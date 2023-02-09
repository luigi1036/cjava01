package com.serna.entidades;

import com.serna.interfaces.Builder;

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
    private String location;
    @Override
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public void setExhibitor(Exhibitor exhibitor) {
        this.exhibitor = exhibitor;
    }

    @Override
    public void setDuration(Double duration) {
        this.duration= duration;
    }

    @Override
    public void setEntryTime(LocalTime entryTime) {
        this.entryTime=entryTime;
    }

    @Override
    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    @Override
    public void setCost(Float cost) {
        this.cost = cost;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    public Event getEvent(){
        return new Event(tittle, exhibitor, duration, entryTime, departureTime, cost);
    }
}
