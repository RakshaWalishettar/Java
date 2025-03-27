package DEmo.example.com;

public class Phone {
    int length;
    public String company;
    private double price;

    public void screen(int length)
    {
        length=6;
        System.out.println("it has 6 inches ");
    }
     void brand(String company)
    {
        company="vivo";
        System.out.println("Vivo");
    }
    private void price(double price)
    {
        price=60000;
        System.out.println("it cost upto 60k");
    }
}
