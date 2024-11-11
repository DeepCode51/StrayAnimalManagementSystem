package com.ypf.pojo;

public class TService {
    private String servicename;

    private String servicepassword;

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename == null ? null : servicename.trim();
    }

    public String getServicepassword() {
        return servicepassword;
    }

    public void setServicepassword(String servicepassword) {
        this.servicepassword = servicepassword == null ? null : servicepassword.trim();
    }
}