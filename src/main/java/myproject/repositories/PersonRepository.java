package myproject.repositories;

import myproject.entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {

    @PersistenceContext
    private EntityManager manager;

    public List<Person> getPersonsByCity(String city) {
        String jpqlQuery = "SELECT p FROM Person p WHERE p.city = :city";

        TypedQuery<Person> query = manager.createQuery(jpqlQuery, Person.class);
        query.setParameter("city",city);

        return query.getResultList();
    }
}
