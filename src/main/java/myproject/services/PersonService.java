package myproject.services;

import myproject.entities.Person;
import myproject.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService {

    private PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }


}
