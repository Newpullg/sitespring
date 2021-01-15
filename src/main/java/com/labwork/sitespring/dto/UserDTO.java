package com.labwork.sitespring.dto;

import com.labwork.sitespring.entity.User;

public class UserDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private int number;

    public UserDTO() {

    }

    public UserDTO(final Long id, String firstname, String lastname, String email, int number) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.number = number;
    }

    //Getter & Setter

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }
}
