package com.example.demo.repository;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Optional<Person> getPerson(Long personId) {
        return personRepository.findById(personId);
    }

    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    public void addPerson(Person person) {
        personRepository.save(person);
    }

    public void updatePerson(Person person, Long personId) {
        personRepository.save(person);
    }

    public Optional<Person> getPersonByName(String name) {
        return personRepository.findPersonByName(name);
    }

    public List<Person> getPersonByAge(Integer age) {
        return personRepository.findPersonByAge(age);
    }
}
