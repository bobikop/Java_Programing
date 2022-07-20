package day34_abstraction.carTask;

public abstract class Car { //can't make his class final since we can't extend it if is final


    private final String make, model;
    private String color;
    private  final int year; // if car are made 2020 that can not be changed or updates no mather what car will steel be made 2020
    private double price;


    public Car(String model, String color, int year, double price) {
        this.make = getClass().getSimpleName();// we can assign class name to the make of the car!
        this.model = model;
        setColor(color);
        if(year < 1886){
            System.err.println("Invalid year " + year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }

    // if constructor already set final variables we can't use getter and setter for those variables(no getter and setter for final variables)
  // therefore we have 5 getters for all variables and 2 setters

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if(price <=0){
            System.err.println("Invalid price " + price);
            System.exit(1);

        }
        this.price = price;
    }



    protected final void stop(){ // to make sure that non - sub classes outside the package can not be  access it
        System.out.println("press the break to stop " + make + " " + model);
    }

    protected abstract void start();// must be overriden


    @Override
    public String toString() {
        return make + "{" +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
1. Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price

			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not be negative or zero

			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car

			Methods:
				stop() (final): prints "Presse the brake"

				start() (abstract)

				toString(): prints the given car info when a car object is passed in the print statement

	2. Create the following sub classes of Car
			1. Honda
			2. Audi
					extra methods:
						autoPark()
			3. Tesla
					extra methods:
						autoPilot()

 */