package DEmo.example.com;

public class PhoneMain {
    public static void main(String [] args){
        Phone mobile=new Phone();
        System.out.println("Screen:" +mobile.length);
        System.out.println("brand :"+ mobile.company);
        //System.out.println("price :" +mobile.Price);

        mobile.screen(mobile.length);
        mobile.brand(mobile.company);
        //mobile.price();


    }
}
