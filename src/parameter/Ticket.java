package Parameter.instance.com;

public class Ticket {
    Tickettype ticketTypes;
    double cost;
    Ticket(Tickettype ticketTypes, double cost){
        this.ticketTypes = ticketTypes;
        this.cost = cost;
    }

    void buy(){
        System.out.println("Buying Ticket for traveling (Ticket Type) : "+this.ticketTypes);
    }
    void sell(){
        System.out.println("Selling Tickets for stall (Price) : "+this.cost);
    }
}
