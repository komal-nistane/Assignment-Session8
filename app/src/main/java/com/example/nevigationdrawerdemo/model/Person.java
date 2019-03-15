package com.example.nevigationdrawerdemo.model;

import android.app.Application;

public class Person  {
    private String name;
    private String surName;
    private String city;
    private String education;

    public Person() {
      super();
    }

    public Person(String name, String surName, String city, String education) {
        this.name = name;
        this.surName = surName;
        this.city = city;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }


}
