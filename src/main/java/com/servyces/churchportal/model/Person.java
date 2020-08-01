package com.servyces.churchportal.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="table_person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long pid;

    @Column
    public String firstname;

    @Column
    public String lastname;

    @Column
    public String email;

    @Column
    public String password;

    @Column
    public String role;

    @Column
    public String profilepicture;

    @Column
    public String coverpicture;

    @Column
    public long contact;

    @Column
    public String country;

    @Column
    public String state;

    @Column
    public String city;

    @Column
    public String address;

    @Column
    public Date dob;

    @Column
    public int age;

    @Column
    public String gender;

    @OneToMany(cascade = CascadeType.ALL,mappedBy="person",fetch=FetchType.LAZY)
    private List<Post> postList;

    public Person() {
        postList = new ArrayList<>();
    }

    public Person(String firstname, String lastname, String email, String password, String role, String profilepicture, String coverpicture, long contact, String country, String state, String city, String address, Date dob, int age, String gender) {
        this.firstname      = firstname;
        this.lastname       = lastname;
        this.email          = email;
        this.password       = password;
        this.role           = role;
        this.profilepicture = profilepicture;
        this.coverpicture   = coverpicture;
        this.contact        = contact;
        this.country        = country;
        this.state          = state;
        this.city           = city;
        this.address        = address;
        this.dob            = dob;
        this.age            = age;
        this.gender         = gender;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getProfilepicture() {
        return profilepicture;
    }

    public void setProfilepicture(String profilepicture) {
        this.profilepicture = profilepicture;
    }

    public String getCoverpicture() {
        return coverpicture;
    }

    public void setCoverpicture(String coverpicture) {
        this.coverpicture = coverpicture;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonManagedReference
    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", profilepicture='" + profilepicture + '\'' +
                ", coverpicture='" + coverpicture + '\'' +
                ", contact=" + contact +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", postList=" + postList +
                '}';
    }
}
