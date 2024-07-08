package myproject.services;

import myproject.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import myproject.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService {
    @Autowired
    PersonRepository repository;

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }


}
