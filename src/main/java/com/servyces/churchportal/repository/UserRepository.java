package com.servyces.churchportal.repository;

import com.servyces.churchportal.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Person,Long> {
    public Person findByEmailAndPassword(String email, String password);
}