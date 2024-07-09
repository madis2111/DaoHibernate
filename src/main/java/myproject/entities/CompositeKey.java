package myproject.entities;

import java.io.Serializable;
import java.util.Objects;

public class CompositeKey implements Serializable {
    private String name;
    private String surname;
    private int age;

    public CompositeKey() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompositeKey that = (CompositeKey) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
