package com.serna.interfaces;

import com.serna.entidades.Exhibitor;

import java.time.LocalTime;

public interface Builder {

    void setTittle(String tittle);
    void setExhibitor(Exhibitor exhibitor);
    void setDuration(Double duration);
    void setEntryTime(LocalTime entryTime);
    void setDepartureTime(LocalTime departureTime);
    void setSeason(String season);
    void setDiscount(Float discount);
    void setCost(Float cost);
    void setLocation(String location);
}
