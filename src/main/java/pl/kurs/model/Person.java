package pl.kurs.model;

public class Person {
    String firstName;
    String secondName;
    String pesel;

    public Person(String firstName, String secondName, String pesel) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.pesel = pesel;
    }

    public String getPesel() {
        return pesel;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", pesel=" + pesel +
                '}';
    }
}
