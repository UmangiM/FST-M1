package Activities;

public class Activity1 {
	public static void main(String[] args) {
        //Defining new object
		Car carName = new Car();

       //Values for car
		carName.make = 2014;
		carName.transmission = "Manual";
		carName.color = "Black";
        
        
		//calling methods
       	carName.displayCharacteristics();
		carName.accelarate();
		carName.brake();
    }
}


