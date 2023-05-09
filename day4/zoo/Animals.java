package day4.zoo;

public class Animals {
    public String name;
    public String type;
    public String food;

    Animals(String name, String type, String food) {
        this.name = name;
        this.type = type;
        this.food = food;
    }

    public static void produceSound() {
        System.out.println("producing sound...");
    }

    public static void eat() {
        System.out.println("eating food...");
    }

}
