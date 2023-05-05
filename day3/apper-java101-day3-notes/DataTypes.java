package day3;

public class DataTypes {
//    Zero Value
    static double age;
    static float salary;
    static boolean isHappy;
    static char favoriteLetter;
    static double weight;
    static long distance;

    static Integer wrapperAge;
    static Boolean wrapperIsHappy;

    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(salary);
        System.out.println(isHappy);
        System.out.println(favoriteLetter);
        System.out.println(weight);
        System.out.println(distance);

        //wrapper
        //System.out.println(age + " " + wrapperAge);
        //not possible because wrapperIsHappy is null
        //System.out.println(isHappy + " " + wrapperIsHappy);

        // pass by reference
        Integer[] ages = new Integer[]{100};
        System.out.println(ages[0]);
        displayAgesInAFancyWay(ages);

        System.out.println("value of theAge after calling fancy method: " + ages[0]);

        System.out.println("+++++");

        //primitive to wrapper
        int numUsers = 100;
        Integer numberOfUsers = numUsers;
        System.out.println(numberOfUsers.intValue());

        System.out.println("+++++");
        int a = 9;
        int b = 10;
        int c = 78;
        System.out.println((a+b) * c);
    }

    static void displayAgeInAFancyWay(Integer age) {
        System.out.println("Fancy! " + age);
        age = age + 100;
    }
    static void displayAgesInAFancyWay(Integer[] age) {
        System.out.println("Fancy! " + age[0]);
        age[0] = age[0] + 100;
    }
}
