// Abstract class for abstraction
abstract class Vehicle {
    // Encapsulation: private fields with public getters/setters
    private String brand;
    private double speed;
    private double fuelCapacity;

    // Constructor
    public Vehicle(String brand, double fuelCapacity) {
        this.brand = brand;
        this.speed = 0;
        this.fuelCapacity = fuelCapacity; 
    }

    // Abstract method (subclasses must implement)
    abstract void accelerate();

    // Concrete method
    public void stop() {
        speed = 0;
        System.out.println(brand + " has stopped. Speed: " + speed);
    }

    // Encapsulation: getters and setters
    public String getBrand() {
        return brand;
    }

    public double getSpeed() {
        return speed;
    }

    protected void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }
}

// Single inheritance: Car inherits from Vehicle
class Car extends Vehicle {
    private int numberOfDoors;

    // Extended Constructor
    public Car(String brand, double fuelCapacity, int numberOfDoors) {
        super(brand, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
    }

    // Polymorphism: overriding accelerate
    void accelerate() {
        setSpeed(getSpeed() + 20);
        System.out.println(getBrand() + " (Car) accelerates. Speed: " + getSpeed());
    }

    // Car-specific method
    public void openDoors() {
        System.out.println(getBrand() + " opens its " + numberOfDoors + " doors.");
    }
}

//  ElectricCar inherits from Car
class ElectricCar extends Car {
    private double batteryLevel;

    // Extended Constructor
    public ElectricCar(String brand, double fuelCapacity, int numberOfDoors, double batteryLevel) {
        super(brand, fuelCapacity, numberOfDoors);
        this.batteryLevel = batteryLevel;
    }

    // Polymorphism: overriding accelerate
    void accelerate() {
        if (batteryLevel > 10) {
            setSpeed(getSpeed() + 30);
            batteryLevel -= 10;
            System.out.println(getBrand() + " (ElectricCar) accelerates. Speed: " + getSpeed() + ", Battery: " + batteryLevel + "%");
        } else {
            System.out.println(getBrand() + " cannot accelerate - low battery!");
        }
    }

    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println(getBrand() + " battery charged to " + batteryLevel + "%");
    }
}

// Another class for polymorphism: Motorcycle inherits from Vehicle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Extended constructor
    public Motorcycle(String brand, double fuelCapacity, boolean hasSidecar) {
        super(brand, fuelCapacity);
        this.hasSidecar = hasSidecar;
    }

    // Polymorphism: overriding accelerate
    void accelerate() {
        setSpeed(getSpeed() + 25);
        System.out.println(getBrand() + " (Motorcycle) accelerates. Speed: " + getSpeed());
    }

    public void wheelie() {
        System.out.println(getBrand() + " does a wheelie!");
    }
}

// Main class
public class VehicleManagement {
    public static void main(String[] args) {
        // Instances
        Car car = new Car("Toyota", 50.0, 4);
        ElectricCar eCar = new ElectricCar("Tesla", 0.0, 4, 50.0);
        Motorcycle moto = new Motorcycle("Harley", 20.0, false);

        // Polymorphism: using Vehicle reference for different types
        Vehicle[] vehicles = {car, eCar, moto};
        System.out.println("Testing all vehicles:");
        for (int i=0; i < vehicles.length; i++) {
            vehicles[i].accelerate(); // Calls each subclass’s version
            vehicles[i].stop();
        }

        // Specific behaviors
        car.openDoors();
        eCar.chargeBattery();
        eCar.accelerate();
        moto.wheelie();

        // Encapsulated data access
        System.out.println("Car brand: " + car.getBrand());
        System.out.println("ElectricCar speed: " + eCar.getSpeed());
    }
}