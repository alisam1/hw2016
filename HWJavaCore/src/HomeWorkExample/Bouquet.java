package HomeWorkExample;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
	 private double price;
	    private List<Flower> flowers = new ArrayList<Flower>();
	    
	    public double getPrice() {
	        return price;
	    }
	    
	    public Bouquet addFlower(Flower flower) {
	        flowers.add(flower);
	        price += flower.getPrice();
	        return this;
	    }
	}

	enum Color {
	    Red, Yellow, Green;
	}

	 class Flower {
	    private final double price;
	    private final String name;
	    private final Color color;

	    protected Flower(double price, String name, Color color) {
	        if (price < 0) {
	            throw new IllegalArgumentException("Price can not be less then zero.");
	        }
	        this.price = price;
	        if (name == null) {
	            throw new NullPointerException("Argument name can not be null.");
	        }
	        if (name.isEmpty()) {
	            throw new IllegalArgumentException("Name of flower can not be empty.");
	        }
	        this.name = name;
	        if (color == null) {
	            throw new NullPointerException("Argument color can not be null.");
	        }
	        this.color = color;
	    }

	    public double getPrice() {
	        return price;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public Color getColoe() {
	        return color;
	    }
	}

	 class Rouse extends Flower{
	    private final static String name = "Роза";
	    public Rouse(double price, Color color) {
	        super(price, name, color);
	    }
	}

	 class Violet extends Flower{
	    private final static String name = "Фиалка";
	    public Violet(double price, Color color) {
	        super(price, name, color);
	    }
	}

	 class Tulip extends Flower{
	    private final static String name = "Тюльпан";
	    public Tulip(double price, Color color) {
	        super(price, name, color);
	    }
	}

	 class Main {
	    public static void main(String[] args) {
	        double total = 0;
	        Rouse ros1 = new Rouse(36.5, Color.Red);
	        Rouse ros2 = new Rouse(20, Color.Green);
	        Violet vio1 = new Violet(55.56, Color.Yellow);
	        Bouquet bouquet = new Bouquet();
	        bouquet.addFlower(ros1).addFlower(ros2).addFlower(vio1);
	        System.out.println(bouquet.getPrice());
	    }
}
