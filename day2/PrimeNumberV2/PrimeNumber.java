import java.util.Scanner;

class PrimeNumber {
    public static boolean isPrime(int num) {
        // Check if num is 0 or 1 (not prime)
        long startTime = System.nanoTime();
        long duration = 0;
        if (num < 2) {
            duration = System.nanoTime() - startTime;
            System.out.println("Duration: " + duration);
            return false;
        }
        // If num is greather than or equal 2
        // Check if num is divisible by any number from 2 to its square root
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                duration = System.nanoTime() - startTime;
                System.out.println("Duration: " + duration);
                return false;
            }
        }
        // Otherwise num is prime
        duration = System.nanoTime() - startTime;
        System.out.println("Duration: " + duration);
        return true;
    }

    public static void main(String args[]) {
        System.out.println("Prime Number Checker");
        int num = 17;
        boolean result = isPrime(num);
        
        if (result)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
}
