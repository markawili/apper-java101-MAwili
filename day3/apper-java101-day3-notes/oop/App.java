package day3.oop;

import day3.oop.blueprint.Person;

public class App {
    public static void main(String[] args) {
        Person mark = new Person();
        mark.name = "Mark";
        System.out.println(mark.getName());
    }
}
