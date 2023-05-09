package day4;

public class Flight {
    //members
    //has state and executable code
    //fields: store object data
    //methods: manipulate state and perform operations
    //constructors: executable during object creation, initial state

    int passenger;
    int seats;
    Flight() {
        seats = 10;
        passenger = 0;
    }
    //TODO: validate if there are available seats left. If no, display "FULL"
    public void addPassenger() {
        if(this.seats > 0) {
            this.passenger++;
            this.seats--;
        } else {
            System.out.println("Flight is full");
        }
    }
    public void printNumPassenger() {
        System.out.println("Passenger count: " + this.passenger);
    }
    //TODO: set new value of seat so addPassenger allows again
    public void setNumberOfSeats(int seats) {
        if(this.passenger > 0) {
            this.seats = seats - this.passenger;
        } else {
            this.seats = seats;
        }
    }
    public void printNumSeats() {
        System.out.println("Seat count: " + this.seats);
    }
}
