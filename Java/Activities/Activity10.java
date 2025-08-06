package Activities;
import java.util.HashSet;

public class Activity10 {
	public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hs = new HashSet<>();

        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
        hs.add("Date");
        hs.add("Papaya");
        hs.add("Melon");

        
        System.out.println("Size of HashSet: " + hs.size());

        
        hs.remove("Cherry");
        System.out.println("Removed 'Cherry' from the HashSet.");

        
        boolean isRemoved = hs.remove("Grapes");
        System.out.println("Tried removing 'Grapes': " + (isRemoved ? "Success" : "Not found"));

        
        System.out.println("Contains 'Apple'? " + hs.contains("Apple"));
        System.out.println("Contains 'Cherry'? " + hs.contains("Cherry"));

        
        System.out.println("Updated HashSet: " + hs);
    }

}
