import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface Account {
    public User registerAccount(Map<String, User> account);
}
interface Shareable {
    public static void sendLoad(Map<String, User> accounts) {};
}
interface Loadable {
    public static void receiveLoad(User account, double amountToReceive) {};
}
public class User implements Account, Shareable, Loadable{
    private String number;
    private String name;
    private double balance;

    User(String number, String name) {
        this.number = number;
        this.name = name;
        this.balance = 100;
    }

    public static void sendLoad(Map<String, User> accounts) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Share-a-Load");

        System.out.print("Enter Sender's Number: ");
        String senderNumber = scanner.nextLine();
        System.out.print("Enter Recipient's Number: ");
        String recipientNumber = scanner.nextLine();

        if (senderNumber.equals(recipientNumber)) {
            System.out.println("Sender's Number must not be the same as the Recipient's");
            return;
        } else if (!accounts.containsKey(senderNumber)) {
            System.out.println("Sender's Number is not registered");
            return;
        } else if (!accounts.containsKey(recipientNumber)) {
            System.out.println("Recipient's Number is not registered");
            return;
        }

        User sender = accounts.get(senderNumber);
        User recipient = accounts.get(recipientNumber);

        System.out.print("Enter amount you want to send: ");
        double amountToSend = scanner.nextDouble();
        if (amountToSend > sender.getBalance()) {
            System.out.println("Insufficient balance.");
            return;
        } else {
            sender.setBalance((sender.getBalance() - amountToSend));
            receiveLoad(recipient, amountToSend);
        }
        System.out.println("Transaction complete!");
    }

    public static void receiveLoad(User recipient, double amountToReceive) {
        recipient.setBalance((recipient.getBalance() + amountToReceive));
    }

    public User registerAccount(Map<String, User> accounts) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Register account");

        System.out.print("Enter number: ");
        String number = scanner.nextLine();
        if (number.length() != 11) {
            System.out.println("Invalid number");
            return null;
        } else if (number.isEmpty()) {
            System.out.println("Number is empty");
            return null;
        } else if (accounts.containsKey(number)) {
            System.out.println("Number exists");
            return null;
        }

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            System.out.println("Name is empty");
            return null;
        }
        return new User(number, name);
    }

    public static User createUser(Map<String, User> accounts) {
        User newUser = new User("", "");
        return newUser.registerAccount(accounts);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
