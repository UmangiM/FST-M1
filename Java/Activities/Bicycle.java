package Activities;

public class Bicycle implements BicycleParts, BicycleOperations {
    protected int gears;
    protected int currentSpeed;

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        currentSpeed += increment;
    }

    public String bicycleDesc() {
        return "Gears: " + gears + ", Max Speed: " + maxSpeed;
    }
}