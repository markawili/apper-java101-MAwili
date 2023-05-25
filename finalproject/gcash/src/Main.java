import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, User> accounts = new HashMap<String, User>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeAccounts();

        boolean repeat = true;

        while (repeat) {
            System.out.println("============ Welcome to JeeCash-Mini! ============");
            System.out.println("\nSelect from the options what you want to do:");
            System.out.println("[1] Register a new account");
            System.out.println("[2] Send load");
            System.out.println("[3] Display balances");
            System.out.print("\nWhat do you want to do?: ");

            int transactionChoice = scanner.nextInt();
            String repeatChoice = "";

            switch(transactionChoice) {
                case 1:
                    System.out.println("============ Register Account ============");
                    try {
                        User newUser = User.createUser(accounts);
                        accounts.put(newUser.getNumber(), newUser);
                    } catch (Exception e) {
                        System.out.println("Cannot create user!");;
                    }

                    System.out.print("Do you like to do another transaction? [Y/N]: ");
                    repeatChoice = scanner.next();
                    if(repeatChoice.equalsIgnoreCase("N")) {
                        System.out.println("Thank you for using JeeCash-Mini!");
                        repeat = false;
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("============ Send Load ============");
                    User.sendLoad(accounts);
                    try {

                    } catch (Exception e) {
                        System.out.println("Cannot create user!");;
                    }

                    System.out.print("Do you like to do another transaction? [Y/N]: ");
                    repeatChoice = scanner.next();
                    if(repeatChoice.equalsIgnoreCase("N")) {
                        System.out.println("Thank you for using JeeCash-Mini!");
                        repeat = false;
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("============ Display Balances ============");
                    accounts.forEach((key, value) -> {
                        System.out.println("Number: " + key + " Name: " + value.getName() + " Balance: " + value.getBalance());
                    });

                    System.out.print("Do you like to do another transaction? [Y/N]: ");
                    repeatChoice = scanner.next();
                    if(repeatChoice.equalsIgnoreCase("N")) {
                        System.out.println("Thank you for using JeeCash-Mini!");
                        repeat = false;
                    }
                    System.out.println("");
                    break;
                default:
                    System.out.print("Invalid choice. Do you like to try again? [Y/N]: ");
                    repeatChoice = scanner.next();
                    if(repeatChoice.equalsIgnoreCase("N")) {
                        System.out.println("Thank you for using JeeCash-Mini!");
                        repeat = false;
                    }
                    System.out.println("");
            }
        }
    }

    private static void initializeAccounts() {
        User user1 = new User("09175861661", "Bob");
        User user2 = new User("09175861662", "Marley");
        User user3 = new User("09175861663", "Seth");
        User user4 = new User("09175861664", "Ryan");
        User user5 = new User("09175861665", "Fritz");

        accounts.put(user1.getNumber(), user1);
        accounts.put(user2.getNumber(), user2);
        accounts.put(user3.getNumber(), user3);
        accounts.put(user4.getNumber(), user4);
        accounts.put(user5.getNumber(), user5);
    }
}
