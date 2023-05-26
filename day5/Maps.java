package day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> cars = new HashMap<>();
        cars.put("c1", "Innova");
        cars.put("c2", "Fj Cruise");
        cars.put("c3", "Expander");
        cars.put("c4", "Vios");
        cars.put("c5", "Honda");
        cars.put("c6", "Tesla");

        System.out.println(cars.get("c4"));
        System.out.println(cars.size());
        System.out.println(cars.keySet());
        System.out.println(cars.containsKey("c7"));
        System.out.println(cars.containsValue("Innova"));

        System.out.println("\n==================\n");

        Scanner scanner = new Scanner(System.in);
        String nextDouble = scanner.next();
        System.out.println(Double.valueOf(nextDouble));
        double newDouble = scanner.nextDouble();
        System.out.println(newDouble);
    }
}
