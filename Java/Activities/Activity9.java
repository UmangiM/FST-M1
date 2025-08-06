package Activities;


	import java.util.ArrayList;

	public class Activity9 {
	    public static void main(String[] args) {
	       
	        ArrayList<String> myList = new ArrayList<>();

	        myList.add("Alpha");
	        myList.add("Bita");
	        myList.add("Gamma");
	        myList.add("Delta");
	       

	        
	        System.out.println("All names in the list:");
	        for (int i = 0; i < myList.size(); i++) {
	            System.out.println(myList.get(i));
	        }

	        
	        String thirdName = myList.get(2); 
	        System.out.println("\nThe 3rd name in the list is: " + thirdName);

	        
	        String nameToCheck = "Delta";
	        boolean exists = myList.contains(nameToCheck);
	        System.out.println("\nDoes the name \"" + nameToCheck + "\" exist in the list? " + exists);

	       
	        System.out.println("\nNumber of names in the list: " + myList.size());

	      
	        myList.remove("Bita");
	        System.out.println("\nAfter removing 'Bita', the new number of names: " + myList.size());
	    }
	}



