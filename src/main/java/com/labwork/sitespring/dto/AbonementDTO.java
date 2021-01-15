package com.labwork.sitespring.dto;

public class AbonementDTO {
    private Long id;
    private String title;
    private double price;
    private String type;


    public AbonementDTO() {

    }

    public AbonementDTO(final Long id, String title, double price, String type) {
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

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
