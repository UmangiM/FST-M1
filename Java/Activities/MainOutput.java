package Activities;

public class MainOutput {
	 public static void main(String[] args) {
	        MountainBike mb = new MountainBike(5, 20, 25);

	        System.out.println(mb.bicycleDesc());  

	        mb.speedUp(20);
	        mb.applyBrake(5);
	        mb.setHeight(25);                    

	        System.out.println("Current Speed: " + mb.currentSpeed);
	        System.out.println("Updated Description: " + mb.bicycleDesc());
	    }

}
