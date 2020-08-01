package com.servyces.churchportal.services;

import com.servyces.churchportal.model.Person;
import com.servyces.churchportal.model.Post;
import com.servyces.churchportal.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public void addPost(Post post, long person_id)    {
        Person person = new Person();
        person.setPid(person_id);
        post.setPerson(person);
        postRepository.save(post);
    }

    public List<Post> getAllPosts()   {
        List<Post> postList = new ArrayList<>();
        postRepository.findAll().forEach(postList::add);
        return postList;
    }

    public List<Post> getUserPostsByTypeAndUser(String type, long person_id)    {
        return postRepository.findAllByTypeAndPersonPid(type,person_id);
    }

    public List<Post> getUserPostsByType(String type)    {
        return postRepository.findAllByType(type);
    }

    public List<Post> getUserPostsByUser(long person_id)    {
        return postRepository.findAllByPersonPid(person_id);
    }
}
