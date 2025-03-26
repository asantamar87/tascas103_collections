package santamaria.aldo.level3_ex1;

import java.util.Objects;

public class Person implements Comparable<Person>  {

    private String name;
    private String lastName;
    private String dni;

    public Person(String name, String lastName, String dni) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    @Override
    public int compareTo(Person person) {
        return this.dni.compareTo(person.dni);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName) && Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, dni);
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastName=" + lastName + ", dni=" + dni + '}';
    }
}
