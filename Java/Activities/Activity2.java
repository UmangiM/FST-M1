package Activities;

public class Activity2 {
	public static void main(String[] args) {
		// Initialize the array
		int[]numbers = {10, 77, 10, 54, -11, 10};
		
		       int sum = 0;
		
		//Looping
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 10) {
                sum += numbers[i];
            }
        }

        // Check if the sum equals 30
        if (sum == 30) {
            System.out.println("Result: true");
        } else {
            System.out.println("Result: false");
        }
    }
}
