package day4.zoo;

public class Employees {
    public String name;
    private double salary;
    private Animals assignedAnimal;

    Employees(String name, double salary, Animals assignedAnimal) {
        this.name = name;
        this.salary = salary;
        this.assignedAnimal = assignedAnimal;
    }

    public void feedAnimal(Animals assignedAnimal) {
        assignedAnimal.eat();
    }

    protected double getSalary() {
        return this.salary;
    }

}
