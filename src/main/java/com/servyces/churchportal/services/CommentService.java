package com.servyces.churchportal.services;

import com.servyces.churchportal.model.Comment;
import com.servyces.churchportal.model.Person;
import com.servyces.churchportal.model.Post;
import com.servyces.churchportal.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {
    public CommentRepository commentRepository;

    public void addComment(Comment comment, long post_id, long person_id)  {
        Post post = new Post();
        post.setPostid(post_id);
        Person person = new Person();
        person.setPid(person_id);
        comment.setPerson(person);
        comment.setPost(post);
        commentRepository.save(comment);
    }

    public void deleteComment(int comment_id)  {
        commentRepository.deleteById(comment_id);
    }

    public List<Comment> getAllComments(long post_id)   {
        List<Comment> comments = new ArrayList<>();
        commentRepository.findAllByPostPostid(post_id);
        return comments;
    }

    public void editComment(Comment comment, int post_id, long person_id)   {

    }
}
