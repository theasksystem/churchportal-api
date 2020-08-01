package com.servyces.churchportal.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="table_church")
public class Church {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long churchid;

    @Column
    public String name;

    @Column
    public String country;

    @Column
    public String state;

    @Column
    public String city;

    @Column
    public String address;

    @Column
    public Date timings;

    @Column
    public String picture;

    @Column
    public String cover;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="pid")
    public Person person;

    public Church() {
    }

    public Church(String name, String country, String state, String city, String address, Date timings, String picture, String cover, Person person) {
        this.name    = name;
        this.country = country;
        this.state   = state;
        this.city    = city;
        this.address = address;
        this.timings = timings;
        this.picture = picture;
        this.cover   = cover;
        this.person  = person;
    }

    public long getChurchid() {
        return churchid;
    }

    public void setChurchid(long churchid) {
        this.churchid = churchid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getTimings() {
        return timings;
    }

    public void setTimings(Date timings) {
        this.timings = timings;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Church{" +
                "churchid=" + churchid +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", timings=" + timings +
                ", picture='" + picture + '\'' +
                ", cover='" + cover + '\'' +
                ", person=" + person +
                '}';
    }
}
