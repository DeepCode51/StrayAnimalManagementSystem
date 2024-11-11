package com.ypf.pojo;

public class TDog {
    private Integer id;

    private String dogKind;

    private String dogName;

    private Integer adoptState;

    private Integer vaccinationStatus;

    private String descrption;

    private String faceImage;

    private Integer dogAge;

    private String dogSex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDogKind() {
        return dogKind;
    }

    public void setDogKind(String dogKind) {
        this.dogKind = dogKind == null ? null : dogKind.trim();
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName == null ? null : dogName.trim();
    }

    public Integer getAdoptState() {
        return adoptState;
    }

    public void setAdoptState(Integer adoptState) {
        this.adoptState = adoptState;
    }

    public Integer getVaccinationStatus() {
        return vaccinationStatus;
    }

    public void setVaccinationStatus(Integer vaccinationStatus) {
        this.vaccinationStatus = vaccinationStatus;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption == null ? null : descrption.trim();
    }

    public String getFaceImage() {
        return faceImage;
    }

    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage == null ? null : faceImage.trim();
    }

    public Integer getDogAge() {
        return dogAge;
    }

    public void setDogAge(Integer dogAge) {
        this.dogAge = dogAge;
    }

    public String getDogSex() {
        return dogSex;
    }

    public void setDogSex(String dogSex) {
        this.dogSex = dogSex == null ? null : dogSex.trim();
    }
}