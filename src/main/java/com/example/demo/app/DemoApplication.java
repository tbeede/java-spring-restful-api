package com.example.demo.app;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@SpringBootApplication
@ComponentScan("com.example.demo")
@EntityScan("com.example.demo.model")
@EnableJpaRepositories("com.example.demo.repository")
public class DemoApplication {

    private Date date = new GregorianCalendar(1910, Calendar.FEBRUARY, 11).getTime();

    public static void main(String[] args) { SpringApplication.run(DemoApplication.class, args); }

	@Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository) {
	    return args -> {
            personRepository.save(new Person("Deepak", date,"NonLocality Street",5, 200, 45));
        };
    }
}
