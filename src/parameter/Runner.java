package Parameter.instance.com;

public class Runner {
    public static void main(String[] args) {
        Clip clip1 = new Clip("pink");
        Clip clip2 = new Clip("green");
        Clip clip3 = new Clip("yellow");
        Clip clip4 = new Clip("green");
        Clip clip5 = new Clip("black");

        Clip[] clips = {clip1, clip2,clip3, clip4, clip5};
        Pushpa pushpa = new Pushpa();
        pushpa.Movie(clips);
        System.out.println("======================================================================");

        Ticket ticket = new Ticket(Tickettype.CONFIRM, 800.00);
        Cricket cricket = new Cricket(ticket);
        cricket.watch();
        cricket.profit();
        System.out.println("======================================================================");

        Brush brush = new Brush(Colour.YELLOW);
        Virat virat = new Virat(brush, cricket, ticket);
        virat.play();
        virat.clean();
        virat.relax();
        System.out.println("======================================================================");


    }
}
