package myproject.controllers;

import myproject.entities.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import myproject.services.PersonService;

import java.util.List;

@RestController
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getCity(@RequestParam("city") String city){
        return personService.getPersonsByCity(city);
    }


}
