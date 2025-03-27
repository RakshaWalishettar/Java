package encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Rohini");
        p.setAge(24);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
