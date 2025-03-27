package banking;

public class Ticket {
    public String passengerName = "Alice Smith"; // Public variable
    String seatNumber = "A12";  // Package-level (default) variable
    private double price = 120.50;  // Private variable

    public void showTicketDetails() {  // Public method
        System.out.println("Passenger: " + passengerName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }

    void showSeatNumber() {  // Package-level (default) method
        System.out.println("Seat Number: " + seatNumber);
    }

    private void showPrice() {  // Private method
        System.out.println("Price: $" + price);
    }
}
