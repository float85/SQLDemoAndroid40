package com.tethys.sqldemoandroid40;

public class Foods {
   private String name;
   private float price;
   private int number;
   private String des;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Foods(String name, float price, int number, String des) {
        this.name = name;
        this.price = price;
        this.number = number;
        this.des = des;
    }
}
