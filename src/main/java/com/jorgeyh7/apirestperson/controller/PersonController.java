package com.jorgeyh7.apirestperson.controller;

import com.jorgeyh7.apirestperson.model.Person;
import com.jorgeyh7.apirestperson.service.PersonDTO;
import com.jorgeyh7.apirestperson.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping("/person")
    @ResponseBody
    public Person createPerson(@RequestBody Person person){

      return  personService.createPerson(person);
    }
    @GetMapping("/person")
    @ResponseBody
    public List<Person> getAllPerson(){
        return personService.getAllPerson();
    }
    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
    }
    @GetMapping("person/{id}")
    @ResponseBody
    public Person getPersonById(@PathVariable Long id){
        return personService.getPersonById(id);
    }
    @PutMapping("/person")

    public void updatePerson(@RequestBody Person person){

        personService.updatePerson(person);

    }

    @PostMapping("/login")
    @ResponseBody
    public PersonDTO login(@RequestBody Person person){
        return personService.login(person.getUser(),person.getPassword());

    }





}
