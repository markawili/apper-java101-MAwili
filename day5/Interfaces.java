package day5;

public class Interfaces {
    public static void main(String[] args) {
        Blueberry blueberry = new Blueberry();

        if (blueberry instanceof Cake) {
            blueberry.slice();
        }
    }
}
