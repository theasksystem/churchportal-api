package com.servyces.churchportal.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="table_comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int commentid;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "postid")
    public Post post;

    @Column
    public String text;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pid")
    public Person person;

    @Column
    public Date commentdatetime;

    public Comment() {
    }

    public Comment(Post post, String text, Person person) {
        this.post   = post;
        this.text   = text;
        this.person = person;
    }

    public int getCommentid() {
        return commentid;
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getCommentdatetime() {
        return commentdatetime;
    }

    public void setCommentdatetime(Date commentdatetime) {
        this.commentdatetime = commentdatetime;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "commentid=" + commentid +
                ", post=" + post +
                ", text='" + text + '\'' +
                ", person=" + person +
                ", commentdatetime=" + commentdatetime +
                '}';
    }
}
