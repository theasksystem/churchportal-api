package com.servyces.churchportal.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name="table_post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long postid;

    @Column
    public String caption;

    @Column
    public String url;

    @Column(insertable=false)
    public LocalDateTime datetime;

    @Column
    public boolean liked;

    @Column
    public int comment;

    @Column
    public String type;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pid")
    public Person person;

    public Post() {
    }

    public Post(String caption, String url,String type, Person person) {
        this.caption = caption;
        this.url     = url;
        this.type    = type;
        this.person  = person;
    }

    public long getPostid() {
        return postid;
    }

    public void setPostid(long postid) {
        this.postid = postid;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonBackReference
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postid=" + postid +
                ", caption='" + caption + '\'' +
                ", url='" + url + '\'' +
                ", datetime=" + datetime +
                ", liked=" + liked +
                ", comment=" + comment +
                ", type='" + type + '\'' +
                ", person=" + person +
                '}';
    }
}
