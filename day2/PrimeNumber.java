import java.util.Scanner;

class PrimeNumber {
    public static boolean isPrime(int num) {
        // Check if num is 0 or 1 (not prime)
        if (num < 2)
            return false;
        // If num is greather than or equal 2
        // Check if num is divisible by any number from 2 to its square root
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        // Otherwise num is prime
        return true;
    }

    public static void main(String args[]) {
        System.out.println("Prime Number Checker");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int numToCheck = scanner.nextInt();
        boolean result = isPrime(numToCheck);
        
        if (result)
            System.out.println(numToCheck + " is a prime number");
        else
            System.out.println(numToCheck + " is not a prime number");
    }
}
