class WaterBalls{
	String color;
    double radius;
    double weight;
    String material;
    boolean isBouncy;
    String brand;
	
	WaterBalls() 
	{
		System.out.println("no-args const of Waterballs");
	}

    WaterBalls(String color) {
        this.color = color;
		System.out.println("the color const of Waterballs");
    }

    WaterBalls(String color, double radius) {
        this.color = color;
        this.radius = radius;
		System.out.println("the color,radius const of Waterballs");
    }

    WaterBalls(String color, double radius, double weight) {
        this.color = color;
        this.radius = radius;
        this.weight = weight;
		System.out.println("the color,radius,weight const of Waterballs");
    }

    WaterBalls(String color, double radius, double weight, String material) {
        this.color = color;
        this.radius = radius;
        this.weight = weight;
        this.material = material;
		System.out.println("the color,radius,weight,material const of Waterballs");
    }

    WaterBalls(String color, double radius, double weight, String material, boolean isBouncy) {
        this.color = color;
        this.radius = radius;
        this.weight = weight;
        this.material = material;
        this.isBouncy = isBouncy;
		System.out.println("the color,radius,weight,material,isBouncy const of Waterballs");
    }

    WaterBalls(String color, double radius, double weight, String material, boolean isBouncy, String brand) {
        this.color = color;
        this.radius = radius;
        this.weight = weight;
        this.material = material;
        this.isBouncy = isBouncy;
        this.brand = brand;
		System.out.println("color,radius,weight,material,isBouncy,brand const of Waterballs");
    }
	void display()
	{
		System.out.println("details of WaterBalls:");
		System.out.println("color :"+color);
		System.out.println("radius :"+radius);
		System.out.println("weight :"+weight);
		System.out.println("material :"+material);
		System.out.println("isBouncy :"+isBouncy);
		System.out.println("brand :"+brand);
		System.out.println("=================================");
	}

}