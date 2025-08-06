package Activities;

	class Activity8 extends Exception {
	    private String message;

	   
	    public Activity8(String message) {
	        this.message = message;
	    }

	  
	    @Override
	    public String getMessage() {
	        return message;
	    }

	    
	    public static void exceptionTest(String value) throws Activity8 {
	        if (value == null) {
	            throw new Activity8("Input string is null! Custom Exception Thrown.");
	        } else {
	            System.out.println("Input string: " + value);
	        }
	    }

	    
	    public static void main(String[] args) {
	        try {
	           
	            exceptionTest("Hello, World!");

	            
	            exceptionTest(null);
	        } catch (Activity8 e) {
	           
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
	    }
	}


