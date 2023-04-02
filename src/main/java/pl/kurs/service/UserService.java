package pl.kurs.service;

import pl.kurs.model.Person;

import java.util.Scanner;

public class UserService {
    public static Person[] createPerson(int n) {

        Person[] usersList = new Person[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Tworzenie osób: " + i + "/" + n + ", Podaj imię:");
            String firstName = scanner.nextLine();
            System.out.println("Tworzenie osób: " + i + "/" + n + ", Podaj nazwisko:");
            String secondName = scanner.nextLine();
            System.out.println("Tworzenie osób: " + i + "/" + n + ", Podaj pesel:");
            String pesel = scanner.nextLine();
            usersList[i] = (new Person(firstName, secondName, pesel));
        }
        scanner.close();
        return usersList;

    }

    public static Person[] filterByGender(Person[] user, String gender) {
        int count = 0;
        for (Person person : user) {
            String pesel = person.getPesel();
            boolean isWoman = Integer.parseInt(pesel.substring(9, 10)) % 2 == 0;
            if (gender.equals("FEMALE") && isWoman) {
                count++;
            } else if (gender.equals("MALE") && !isWoman) {
                count++;
            }
        }

        Person[] result = new Person[count];
        int index = 0;
        for (Person person : user) {
            boolean isWoman = (Integer.parseInt(person.getPesel().substring(9, 10)) % 2 == 0);
            if (gender.equals("FEMALE") && isWoman) {
                result[index++] = person;
            } else if (gender.equals("MALE") && !isWoman) {
                result[index++] = person;
            }
        }

        return result;
    }

}
