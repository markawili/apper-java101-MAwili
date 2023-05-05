package day3;

public class SwitchStatements {

    public static void main(String[] args) {
        // feed the animals
        // Dog arf arf
        // Cat meow meow
        // Goat meeh meeh
        // Cow moooo

        String animal = String.valueOf(Animal.DOG);

        if (animal.equals("dog")) {
            System.out.println("arf arf");
        } else if (animal.equals("cat")) {
            System.out.println("meow meow");
        } else if (animal.equals("goat")) {
            System.out.println("meeh meeh");
        } else if (animal.equals("cow")) {
            System.out.println("mooooo");
        } else {
            System.out.println("Yehey!");
        }

        switch (animal) {
            case "dog": System.out.println("arf arf"); break;
            case "cat": System.out.println("meow meow"); break;
            case "goat": System.out.println("meeh meeh"); break;
            case "moo": System.out.println("mooooo"); break;
            default: System.out.println("Yehey!");
        }
    }

    public enum Animal {
        DOG, CAT, GOAT, COW
    }
}
