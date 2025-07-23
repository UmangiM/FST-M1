package Activities;

public class Car {
	String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    // Constructor
    public Car() {
        tyres = 4;
        doors = 4;
    }

    // Method that displays car characteristics
    public void displayCharacteristics() {
        System.out.println("Car Characteristics:");
        System.out.println("Color: " + color);
        System.out.println("Transmission: " + transmission);
        System.out.println("Make: " + make);
        System.out.println("Tyres: " + tyres);
        System.out.println("Doors: " + doors);
    }

    // Method for acceleration
    public void accelarate() {
        System.out.println("Car is moving forward.");
    }

    // Method for braking
    public void brake() {
        System.out.println("Car has stopped.");
    }
}
