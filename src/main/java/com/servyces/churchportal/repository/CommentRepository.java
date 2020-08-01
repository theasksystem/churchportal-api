package com.servyces.churchportal.repository;
import com.servyces.churchportal.model.Comment;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CommentRepository extends CrudRepository<Comment,Integer> {
    public List<Comment> findAllByPostPostid(long post_id);
}
