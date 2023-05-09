package day4.zoo;

public class Managers {
    public String name;
    public int age;
    public String title;
    // add Employee, since inheritance wasn't discussed at this moment
    private Employees employee;

    Managers(String name, int age, String title) {
        this.name = name;
        this.age = age;
        this.title = title;
    }

    public void viewEmployeeSalary(Employees employee) {
        System.out.println(employee.name + "'s salary is PHP" + employee.getSalary());
    }
}
