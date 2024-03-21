package com.jorgeyh7.apirestperson.service;

import com.jorgeyh7.apirestperson.model.Person;
import com.jorgeyh7.apirestperson.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public Person createPerson(Person person){
       return personRepository.save(person);

    }
    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }
    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }

    public Person getPersonById(Long id){
        return personRepository.findById(id).orElse(null);
    }

    public void updatePerson(Person person){
        personRepository.save(person);

    }


}
