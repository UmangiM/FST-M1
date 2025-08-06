package Activities;
import java.util.*;
public class Activity11 {
	 public static void main(String[] args) {
	        
	        Map<Integer, String> colours = new HashMap<>();

	        colours.put(1, "Red");
	        colours.put(2, "Blue");
	        colours.put(3, "Green");
	        colours.put(4, "Yellow");
	        colours.put(5, "Purple");

	        System.out.println("Map Colours: " + colours);

	        colours.remove(3);
	        System.out.println("After removing key 3: " + colours);

	        boolean hasGreen = colours.containsValue("Green");
	        System.out.println("Does the map contain 'Green'? " + hasGreen);

	        System.out.println("Size of the Map: " + colours.size());
	    }
}
