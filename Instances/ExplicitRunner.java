class Boat {  
}

class Window {
}

class Mouse {
}

class Keyboard {
}

class Table {
}

class ExplicitRunner {
    public static void main(String[] args) {
        System.out.println("Explicitly creating 25 copies");

        
        Boat boat1 = new Boat();
        Boat boat2 = new Boat();
        Boat boat3 = new Boat();
        Boat boat4 = new Boat();
        Boat boat5 = new Boat();

       
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();
        Window window4 = new Window();
        Window window5 = new Window();

      
        Mouse mouse1 = new Mouse();
        Mouse mouse2 = new Mouse();
        Mouse mouse3 = new Mouse();
        Mouse mouse4 = new Mouse();
        Mouse mouse5 = new Mouse();

        
        Keyboard keyboard1 = new Keyboard();
        Keyboard keyboard2 = new Keyboard();
        Keyboard keyboard3 = new Keyboard();
        Keyboard keyboard4 = new Keyboard();
        Keyboard keyboard5 = new Keyboard();

        
        Table table1 = new Table();
        Table table2 = new Table();
        Table table3 = new Table();
        Table table4 = new Table();
        Table table5 = new Table();
        
        System.out.println("All objects created explicitly!");
    }
}
