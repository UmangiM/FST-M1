package Activities;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Activity13 {
	 public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scan = new Scanner(System.in);
	        
	        // Create an ArrayList to store the integers
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        // Create a Random object to generate index
	        Random indexGen = new Random();
	        
	        System.out.println("Enter integer values (non-integer to stop):");

	        // Read integers until a non-integer is entered
	        while (scan.hasNextInt()) {
	            int num = scan.nextInt();
	            list.add(num);
	        }

	        // Convert ArrayList to array
	        Integer[] nums = list.toArray(new Integer[0]);

	        // Check if the array is not empty before generating a random index
	        if (nums.length > 0) {
	            // Generate a random index between 0 and nums.length - 1
	            int randomIndex = indexGen.nextInt(nums.length);
	            
	            // Print the generated index and the value at that index
	            System.out.println("Generated Index: " + randomIndex);
	            System.out.println("Value at Index: " + nums[randomIndex]);
	        } else {
	            System.out.println("No integers were entered.");
	        }

	        // Close the scanner
	        scan.close();
	    }

}
