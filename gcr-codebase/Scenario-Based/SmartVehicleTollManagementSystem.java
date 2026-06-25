public class SmartVehicleTollManagementSystem {

    static class Vehicle {
        protected String vehicleNumber;
        protected String ownerName;

        Vehicle(String vehicleNumber, String ownerName) {
            this.vehicleNumber = vehicleNumber;
            this.ownerName = ownerName;
        }

        double calculateToll() {
            return 0.0;
        }
    }

    static class Car extends Vehicle {
        Car(String vehicleNumber, String ownerName) {
            super(vehicleNumber, ownerName);
        }

        @Override
        double calculateToll() {
            return 80.0;
        }
    }

    static class Bus extends Vehicle {
        Bus(String vehicleNumber, String ownerName) {
            super(vehicleNumber, ownerName);
        }

        @Override
        double calculateToll() {
            return 150.0;
        }
    }

    static class Truck extends Vehicle {
        Truck(String vehicleNumber, String ownerName) {
            super(vehicleNumber, ownerName);
        }

        @Override
        double calculateToll() {
            return 220.0;
        }
    }

    static double calculateTotalRevenue(Vehicle[] vehicles) {
        double total = 0.0;
        for (Vehicle vehicle : vehicles) {
            total += vehicle.calculateToll();
        }
        return total;
    }

    static Vehicle searchVehicle(Vehicle[] vehicles, String vehicleNumber) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.vehicleNumber.equalsIgnoreCase(vehicleNumber)) {
                return vehicle;
            }
        }
        return null;
    }

    static Vehicle highestTollVehicle(Vehicle[] vehicles) {
        if (vehicles.length == 0) {
            return null;
        }

        Vehicle highest = vehicles[0];
        for (int i = 1; i < vehicles.length; i++) {
            if (vehicles[i].calculateToll() > highest.calculateToll()) {
                highest = vehicles[i];
            }
        }
        return highest;
    }

    static void countVehiclesByType(Vehicle[] vehicles) {
        int carCount = 0;
        int busCount = 0;
        int truckCount = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                carCount++;
            } else if (vehicle instanceof Bus) {
                busCount++;
            } else if (vehicle instanceof Truck) {
                truckCount++;
            }
        }

        System.out.println("Car count: " + carCount);
        System.out.println("Bus count: " + busCount);
        System.out.println("Truck count: " + truckCount);
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("MH12AB1001", "Ravi"),
            new Bus("MH12CD2002", "State Transport"),
            new Truck("MH12EF3003", "LogiMove"),
            new Car("MH12GH4004", "Neha"),
            new Truck("MH12IJ5005", "CargoKing")
        };

        System.out.println("Total revenue: " + calculateTotalRevenue(vehicles));

        Vehicle found = searchVehicle(vehicles, "MH12EF3003");
        if (found != null) {
            System.out.println("Found vehicle: " + found.vehicleNumber + " Owner: " + found.ownerName);
        }

        Vehicle maxPaid = highestTollVehicle(vehicles);
        if (maxPaid != null) {
            System.out.println("Highest toll paid by: " + maxPaid.vehicleNumber + " Toll: " + maxPaid.calculateToll());
        }

        countVehiclesByType(vehicles);
    }
}
