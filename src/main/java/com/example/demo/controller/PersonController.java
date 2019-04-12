package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("/person/id/{personId}")
    public Optional<Person> getPerson(@PathVariable Long personId, Model model) {
        Optional<Person> personById = personService.getPerson(personId);
        model.addAttribute("personById", personById);
        return personById;
    }

    @RequestMapping("/person/name/{personName}")
    public Optional<Person> getPersonByName(@PathVariable String personName, Model model) {
        Optional<Person> personByName = personService.getPersonByName(personName);
        model.addAttribute("personByName", personByName);
        return personByName;
    }

    @RequestMapping("/person/age/{personAge}")
    public List<Person> getPersonByDob(@PathVariable Integer personAge, Model model) {
        List<Person> personByAge = personService.getPersonByAge(personAge);
        model.addAttribute("personByAge", personByAge);
        return personByAge;
    }

    @RequestMapping("/persons")
    public List<Person> getPersons() {
        return personService.getPersons();
    }

    @PostMapping(value = "/add")
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @PutMapping(value = "/update/{personId}")
    public void updatePerson(@RequestBody Person person, @PathVariable long personId) {
        personService.updatePerson(person, personId);
    }
}