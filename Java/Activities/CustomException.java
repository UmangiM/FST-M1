package Activities;

	class CustomException extends Exception {
	    private String message;

	   
	    public CustomException(String message) {
	        this.message = message;
	    }

	  
	    @Override
	    public String getMessage() {
	        return message;
	    }

	    
	    public static void exceptionTest(String value) throws CustomException {
	        if (value == null) {
	            throw new CustomException("Input string is null! Custom Exception Thrown.");
	        } else {
	            System.out.println("Input string: " + value);
	        }
	    }

	    
	    public static void main(String[] args) {
	        try {
	           
	            exceptionTest("Hello, World!");

	            
	            exceptionTest(null);
	        } catch (CustomException e) {
	           
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
	    }
	}


