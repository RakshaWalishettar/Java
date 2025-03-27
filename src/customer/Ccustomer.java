package customer;
import banking.Ticket;

public class Ccustomer {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        System.out.println("Passenger Name: " + ticket.passengerName);
        ticket.showTicketDetails();
        System.out.println("=============================");
    }
}
