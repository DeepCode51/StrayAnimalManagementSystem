package com.ypf.pojo;

import java.util.Date;

public class TDogVaccine {
    private Integer id;

    private Integer dogId;

    private Integer vaccineId;

    private Date vaccineTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDogId() {
        return dogId;
    }

    public void setDogId(Integer dogId) {
        this.dogId = dogId;
    }

    public Integer getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(Integer vaccineId) {
        this.vaccineId = vaccineId;
    }

    public Date getVaccineTime() {
        return vaccineTime;
    }

    public void setVaccineTime(Date vaccineTime) {
        this.vaccineTime = vaccineTime;
    }
}