package com.servyces.churchportal.repository;
import com.servyces.churchportal.model.Post;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PostRepository extends CrudRepository<Post,Long> {

    public List<Post> findAllByType(String PostType);

    public List<Post> findAllByPersonPid(long Person_Id);

    public List<Post> findAllByTypeAndPersonPid(String Post_Type,long Person_Id);
}
