package com.labwork.sitespring.entity;

public class Abonement {
    private String title;
    private Long id;
    private double price;
    private String type;


    public Abonement() {

    }

    public Abonement(final Long id, String title, double price, String type) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.type = type;
    }


    //Getter & Setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }
}




