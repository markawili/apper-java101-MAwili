package day4;

public class App {
    public static void main(String[] args) {
        Flight manilaToBoracay;
        manilaToBoracay = new Flight();

        manilaToBoracay.printNumPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.printNumPassenger();
        manilaToBoracay.addPassenger(); //full
        manilaToBoracay.printNumSeats();
        System.out.println("++++++++");
        manilaToBoracay.setNumberOfSeats(20);
        System.out.println("Added 20 seats");
        manilaToBoracay.printNumSeats();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.printNumPassenger();
        manilaToBoracay.printNumSeats();
    }
}
