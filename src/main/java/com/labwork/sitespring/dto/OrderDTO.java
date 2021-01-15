package com.labwork.sitespring.dto;

import com.labwork.sitespring.entity.Abonement;
import com.labwork.sitespring.entity.User;

import java.time.LocalDate;
import java.util.List;

public class OrderDTO {
    private Long id;
    private Long userId;
    private LocalDate orderDate;
    private String userFirstname;
    private String userLastname;
    private List<Abonement> orderDetails;
    private double orderPrice;



    public OrderDTO() {

    }

    public OrderDTO(final Long id, LocalDate orderDate, String userFirstname, String userLastname, List<Abonement> orderDetails, double orderPrice, final Long userId) {
        this.id = id;
        this.orderDate = orderDate;
        this.userFirstname = userFirstname;
        this.userLastname = userLastname;
        this.orderDetails = orderDetails;
        this.orderPrice = orderPrice;
        this.userId = userId;

    }

    //Getter & Setter

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getUserFirstname() {
        return userFirstname;
    }

    public void setUserFirstname(String userFirstname) {
        this.userFirstname = userFirstname;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }

    public List<Abonement> getOrderDetails() {
        return orderDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    public void setOrderDetails(List<Abonement> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }
}
