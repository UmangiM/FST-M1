package Activities;


	public class MountainBike extends Bicycle {
	    private int seatHeight;

	    public MountainBike(int gears, int currentSpeed, int seatHeight) {
	        super(gears, currentSpeed);   
	        this.seatHeight = seatHeight;
	    }

	    public void setHeight(int newHeight) {
	        seatHeight = newHeight;
	    }

	    @Override
	    public String bicycleDesc() {
	        return super.bicycleDesc() + ", Seat Height: " + seatHeight;
	    }
	}

