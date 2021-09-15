package repairs;

public class Car implements Vehicle{

    private int engineSize;
    private int wheels;
    private int doors;

    public Car(int engineSize, int wheels, int doors) {
        this.engineSize = engineSize;
        this.wheels = wheels;
        this.doors = doors;
    }

    @Override
    public double getEngineSize() {
        return this.engineSize;
    }

    @Override
    public int getNumberOfWheels() {
        return this.wheels;
    }
}
