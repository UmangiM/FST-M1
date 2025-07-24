package Activities;

public class Activity4 {
	
	     public static void ascendingorder(int[] arr) {
	        for (int i = 1; i < arr.length; i++) {
	            int order = arr[i];
	            int j = i - 1;

	            
	            while (j >= 0 && arr[j] > order) {
	                arr[j + 1] = arr[j];
	                j--;
	            }

	            
	            arr[j + 1] = order;
	        }
	    }

	   
	    public static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }

	    
	    public static void main(String[] args) {
	        int[] numbers = {3,7,4,8,1};

	        System.out.println("Array before sorting:");
	        printArray(numbers);

	        ascendingorder(numbers);

	        System.out.println("Array after sorting:");
	        printArray(numbers);
	    }
	}


