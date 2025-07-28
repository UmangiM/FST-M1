package Activities;


	interface Addable {
	    int add(int num1, int num2);
	}

	
	public class Activity12 {
	    public static void main(String[] args) {
	        
	       
	        Addable ad1 = (num1, num2) -> num1 + num2;

	      
	        Addable ad2 = (num1, num2) -> {
	            int result = num1 + num2;
	            return result;
	        };

	        // Test both Addable instances
	        System.out.println("Result using ad1: " + ad1.add(10, 20));
	        System.out.println("Result using ad2: " + ad2.add(20, 25));
	    }

}
