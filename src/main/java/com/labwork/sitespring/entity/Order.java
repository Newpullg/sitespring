package com.labwork.sitespring.entity;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private Long id;
    private LocalDate orderDate;

    private User user;
    private List<Abonement> orderDetails;


    public Order(){

    }

    public Order(final Long id, LocalDate orderDate, User user, List<Abonement> orderDetails) {
        this.id = id;
        this.orderDate = orderDate;
        this.user = user;
        this.orderDetails = orderDetails;
    }
    //Getter & Setter


    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public List<Abonement> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<Abonement> orderDetails) {
        this.orderDetails = orderDetails;
    }


}
