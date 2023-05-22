package com.salihpolat;

public class Duck {

    private String beackColor = "Yellow";

    public String getBeackColor() {
        return beackColor;
    }

    public void setBeackColor(String beackColor) {
        this.beackColor = beackColor;
    }

    public void swim() {
        System.out.println("swim Metodu");
    }

    public void quack() {
        System.out.println("quack Metodu");
    }
}