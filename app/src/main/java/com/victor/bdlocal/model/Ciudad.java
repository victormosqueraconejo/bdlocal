package com.victor.bdlocal.model;

public class Ciudad {
   private int cod;
   private String nameCity;

    public Ciudad() {
    }

    public Ciudad(int cod, String nameCity) {
        this.cod = cod;
        this.nameCity = nameCity;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }
}



