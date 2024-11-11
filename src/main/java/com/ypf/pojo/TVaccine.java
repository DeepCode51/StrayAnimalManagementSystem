package com.ypf.pojo;

public class TVaccine {
    private Integer id;

    private String vaccineName;

    private Integer vaccineCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName == null ? null : vaccineName.trim();
    }

    public Integer getVaccineCount() {
        return vaccineCount;
    }

    public void setVaccineCount(Integer vaccineCount) {
        this.vaccineCount = vaccineCount;
    }
}