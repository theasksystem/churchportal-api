package com.servyces.churchportal.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

public class PostResponse { 
    public String Post_Caption;

    public String Post_Url;

    public Date Post_DateTime;

    public int Post_Likes;

    public String Post_Type;

    public String Person_Name;

    public BigInteger Person_Id;

    public String Person_ProfileImage;

    public PostResponse(String post_Caption, String post_Url, Date post_DateTime, int post_Likes, String post_Type, String person_Name, BigInteger person_Id, String person_ProfileImage) {
        Post_Caption = post_Caption;
        Post_Url = post_Url;
        Post_DateTime = post_DateTime;
        Post_Likes = post_Likes;
        Post_Type = post_Type;
        Person_Name = person_Name;
        Person_Id = person_Id;
        Person_ProfileImage = person_ProfileImage;
    }

    public PostResponse() {
    }

    public String getPost_Caption() {
        return Post_Caption;
    }

    public void setPost_Caption(String post_Caption) {
        Post_Caption = post_Caption;
    }

    public String getPost_Url() {
        return Post_Url;
    }

    public void setPost_Url(String post_Url) {
        Post_Url = post_Url;
    }

    public Date getPost_DateTime() {
        return Post_DateTime;
    }

    public void setPost_DateTime(Date post_DateTime) {
        Post_DateTime = post_DateTime;
    }

    public int getPost_Likes() {
        return Post_Likes;
    }

    public void setPost_Likes(int post_Likes) {
        Post_Likes = post_Likes;
    }

    public String getPost_Type() {
        return Post_Type;
    }

    public void setPost_Type(String post_Type) {
        Post_Type = post_Type;
    }

    public String getPerson_Name() {
        return Person_Name;
    }

    public void setPerson_Name(String person_Name) {
        Person_Name = person_Name;
    }

    public BigInteger getPerson_Id() {
        return Person_Id;
    }

    public void setPerson_Id(BigInteger person_Id) {
        Person_Id = person_Id;
    }

    public String getPerson_ProfileImage() {
        return Person_ProfileImage;
    }

    public void setPerson_ProfileImage(String person_ProfileImage) {
        Person_ProfileImage = person_ProfileImage;
    }

    @Override
    public String toString() {
        return "PostResponse{" +
                "Post_Caption='" + Post_Caption + '\'' +
                ", Post_Url='" + Post_Url + '\'' +
                ", Post_DateTime=" + Post_DateTime +
                ", Post_Likes=" + Post_Likes +
                ", Post_Type='" + Post_Type + '\'' +
                ", Person_Name='" + Person_Name + '\'' +
                ", Person_Id=" + Person_Id +
                ", Person_ProfileImage='" + Person_ProfileImage + '\'' +
                '}';
    }
}
