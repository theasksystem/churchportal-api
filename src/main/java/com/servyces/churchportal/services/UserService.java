package com.servyces.churchportal.services;

import com.servyces.churchportal.model.Person;
import com.servyces.churchportal.model.User;
import com.servyces.churchportal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    public Person signIn(User user) {
        return userRepository.findByEmailAndPassword(user.getEmail(),user.getPassword());
    }

    public Optional<Person> getPersonById(long person_id)   {
        return userRepository.findById(person_id);
    }

    public void signUp(Person person)   {
        userRepository.save(person);
    }

    public void updateProfile(Person person)    {
        userRepository.save(person);
    }
}
