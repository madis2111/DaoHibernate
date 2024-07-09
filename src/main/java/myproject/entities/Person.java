package myproject.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@IdClass(CompositeKey.class)
@Table(name="people")
public class Person {


    @Id
    @Column(name = "name")
    private String name;
    @Id
    @Column(name = "surename")
    private String surname;
    @Id
    @Column(name = "age")
    private int age;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "city_of_living")
    private String city;

    public Person() {}


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, phoneNumber, city);
    }
}
