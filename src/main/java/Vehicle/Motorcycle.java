package Vehicle;

public class Motorcycle extends Vehicle {
    public Motorcycle(String company, String model, int yearRelease) {
        super.numWheels = 2;
        super.speed = 0;
        super.company = company;
        super.model = model;
        super.yearRelease = yearRelease;
    }

    @Override
    void testDrive() {
        this.speed = 75;
    }

    @Override
    void park() {
        this.speed = 0;
    }
}
