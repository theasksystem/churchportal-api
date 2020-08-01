package com.servyces.churchportal.controller;

import com.servyces.churchportal.model.Comment;
import com.servyces.churchportal.model.Post;
import com.servyces.churchportal.services.CommentService;
import com.servyces.churchportal.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    @PostMapping("/add/{user}")
    public @ResponseBody String addPost(@NonNull  @RequestBody Post post,@PathVariable("user") long person_id) {
        postService.addPost(post,person_id);
        return "Post Added Successfully";
    }

    @GetMapping
    public @ResponseBody List<Post> getAllPost()    {
       return postService.getAllPosts();
    }

    @GetMapping("/{type}/{user}")
    public @ResponseBody List<Post> getUserImagePosts(@PathVariable("user") long person_id,@PathVariable("type") String type) {
        return postService.getUserPostsByTypeAndUser(type, person_id);
    }

    @GetMapping("/{type}")
    public @ResponseBody List<Post> getUserPostsByType(@PathVariable("type") String type) {
        return postService.getUserPostsByType(type);
    }

    @GetMapping("/user/{id}")
    public @ResponseBody List<Post> getUserPostsByUser(@PathVariable("id") long person_id) {
        return postService.getUserPostsByUser(person_id);
    }

    @PostMapping("/comment/{post}/{user}")
    public @ResponseBody String addComment(@NonNull  @RequestBody Comment comment,@PathVariable("post") long post_id,@PathVariable("user") long person_id) {
        commentService.addComment(comment,post_id,person_id);
        return "Comment Added Successfully";
    }

    @DeleteMapping("/comment/{commentid}")
    public String deleteComment(@PathVariable("post") int comment_id)  {
        commentService.deleteComment(comment_id);
        return "Comment Deleted Successfully";
    }

    @GetMapping("/comment/{post}")
    public List<Comment> getAllComments(@PathVariable("post") long post_id)   {
        return commentService.getAllComments(post_id);
    }

    public void editComment(Comment comment, int post_id, long person_id)   {

    }
}