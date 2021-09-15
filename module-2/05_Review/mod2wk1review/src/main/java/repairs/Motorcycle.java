package repairs;

public class Motorcycle implements Vehicle{

    private int engineSize;
    private int wheels;
    private boolean isKickStandRetracted;

    public Motorcycle(int engineSize, int wheels) {
        this.engineSize = engineSize;
        this.wheels = wheels;
        this.isKickStandRetracted = false;
    }

    public void setKickStandRetracted(boolean kickStandRetracted) {
        isKickStandRetracted = kickStandRetracted;
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
