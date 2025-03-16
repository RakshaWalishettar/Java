class Water{
	String type;
    double pH;
    double temperature;
    boolean isDrinkable;
    int density;
    String source;

    Water() {}
    
    Water(String type) {
        this.type = type;
    }

    Water(String type, double pH) {
        this.type = type;
        this.pH = pH;
    }

    Water(String type, double pH, double temperature) {
        this.type = type;
        this.pH = pH;
        this.temperature = temperature;
    }

    Water(String type, double pH, double temperature, boolean isDrinkable) {
        this.type = type;
        this.pH = pH;
        this.temperature = temperature;
        this.isDrinkable = isDrinkable;
    }

    Water(String type, double pH, double temperature, boolean isDrinkable, int density) {
        this.type = type;
        this.pH = pH;
        this.temperature = temperature;
        this.isDrinkable = isDrinkable;
        this.density = density;
    }

    Water(String type, double pH, double temperature, boolean isDrinkable, int density, String source) {
        this.type = type;
        this.pH = pH;
        this.temperature = temperature;
        this.isDrinkable = isDrinkable;
        this.density = density;
        this.source = source;
    }

     void display() {
        System.out.println("type: " + type);
        System.out.println("pH: " + pH);
        System.out.println("temperature: " + temperature);
        System.out.println("isDrinkable: " + isDrinkable);
        System.out.println("density: " + density);
        System.out.println("source: " + source);
        System.out.println("==================================");
    }

}