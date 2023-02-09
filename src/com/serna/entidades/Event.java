package com.serna.entidades;

import com.serna.utils.MisConstantes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Event {

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


    private static int counter =1;


    public Event(String tittle, Exhibitor exhibitor, Double duration, LocalTime entryTime, LocalTime departureTime, Float cost) {
        this.assistantList = new ArrayList<>();
        this.code = counter++;
        this.tittle = tittle;
        this.exhibitor = exhibitor;
        this.duration = duration;
        this.entryTime = entryTime;
        this.departureTime = departureTime;
        this.cost = 3000F;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Exhibitor getExhibitor() {
        return exhibitor;
    }

    public void setExhibitor(Exhibitor exhibitor) {
        this.exhibitor = exhibitor;
    }

    public List<Assistant> getAssistantList() {
        return assistantList;
    }

    public void setAssistantList(List<Assistant> assistantList) {
        this.assistantList = assistantList;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public LocalTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


   /* public static class eventbuilder{

    }

    public void addAssistant(Assistant assistant){
        this.assistantList.add(assistant);
    }

    public Float costEvent(){
        if (duration <= 5.0) {
           this.cost = this.cost +  costLocation(location);
        } else {
            this.cost = this.cost + costLocation(location);
        }
        return cost;
    }

    public Float calculateAmount(){

        return null;
    }


    public Float discountEvent(String season){
        if(season == MisConstantes.ALTA) {
            this.discount = 0.10F;
        }else if(season == MisConstantes.BAJA){
            this.discount = 0.05F;
        }else {
            this.discount = 0F;
        }
        return this.discount;
    }

    private Float costLocation(String location){
//        if(location.equalsIgnoreCase(MisConstantes.PLATINUM)){
//            cost = 8000F;
//        }else if(location.equalsIgnoreCase(MisConstantes.GOLD)){
//            cost = 6000F;
//        } else if (location.equalsIgnoreCase(MisConstantes.VIP)) {
//            cost = 4000F;
//        }
        return cost;
    }*/

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
                '}';
    }
}
