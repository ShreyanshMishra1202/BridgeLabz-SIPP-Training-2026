package gcr-codebase.encapsulation;

abstract class Vehicle {
    private String vehicleNumber;
    private String vehicleType;

    Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    abstract double calculateRentalCost(int days);

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

class Car extends Vehicle {
    private double dailyRate;

    Car(String vehicleNumber, double dailyRate) {
        super(vehicleNumber, "Car");
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Bike extends Vehicle {
    private double dailyRate;

    Bike(String vehicleNumber, double dailyRate) {
        super(vehicleNumber, "Bike");
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Truck extends Vehicle {
    private double dailyRate;
    private double loadingCharge;

    Truck(String vehicleNumber, double dailyRate, double loadingCharge) {
        super(vehicleNumber, "Truck");
        this.dailyRate = dailyRate;
        this.loadingCharge = loadingCharge;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getLoadingCharge() {
        return loadingCharge;
    }

    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }

    @Override
    double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {

        int days = 5;

        Car car = new Car("CAR101", 1500);
        Bike bike = new Bike("BIKE201", 500);
        Truck truck = new Truck("TRK301", 3000, 2000);

        System.out.println("Car Details");
        car.displayDetails();
        System.out.println("Rental Cost: ₹" + car.calculateRentalCost(days));

        System.out.println("\nBike Details");
        bike.displayDetails();
        System.out.println("Rental Cost: ₹" + bike.calculateRentalCost(days));

        System.out.println("\nTruck Details");
        truck.displayDetails();
        System.out.println("Rental Cost: ₹" + truck.calculateRentalCost(days));
    }
}