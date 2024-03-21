package com.jorgeyh7.apirestperson.repository;

import com.jorgeyh7.apirestperson.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

    public Person findByUserAndPassword(String user, String password);
}
