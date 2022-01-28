package com.nagendra.springdatajpaencryption.entity;

import com.nagendra.encryptiondecryption.service.AttributeConverterImpl;

import javax.persistence.*;


@Entity
public class User {

    @Id
    @Column(name="Id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;

    @Convert(converter = AttributeConverterImpl.class)
    private String mobile;

    public User(int id, String firstName, String emailId, String mobileNumber) {
        this.id = id;
        this.name = firstName;
        this.email = emailId;
        this.mobile = mobileNumber;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + name + '\'' +
                ", emailId='" + email + '\'' +
                ", mobileNumber='" + mobile + '\'' +
                '}';
    }
}