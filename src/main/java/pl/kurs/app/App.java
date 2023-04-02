package pl.kurs.app;

import pl.kurs.model.Person;
import pl.kurs.service.UserService;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {

        int n = 5;
        Person[] usersList = UserService.createPerson(5);
        for (int i = 0; i < n; i++) {
            System.out.println("Osoba: " + (i + 1) + ": " + usersList[i].toString());
        }

        Person[] women = UserService.filterByGender(usersList, "FEMALE");
        System.out.println("Kobiety:");
        for (Person woman : women) {
            System.out.println(woman.toString());
        }

    }
}