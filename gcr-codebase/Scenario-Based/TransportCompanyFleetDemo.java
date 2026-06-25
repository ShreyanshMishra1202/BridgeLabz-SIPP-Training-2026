public class TransportCompanyFleetDemo {

    static abstract class Vehicle {
        private final String vehicleId;

        Vehicle(String vehicleId) {
            this.vehicleId = vehicleId;
        }

        String getVehicleId() {
            return vehicleId;
        }

        abstract double fuelCost(double km);
    }

    static class Car extends Vehicle {
        private final double costPerKm;

        Car(String vehicleId, double costPerKm) {
            super(vehicleId);
            this.costPerKm = costPerKm;
        }

        @Override
        double fuelCost(double km) {
            return km * costPerKm;
        }
    }

    static class Bus extends Vehicle {
        private final double mileageKmPerLiter;
        private final double dieselPricePerLiter;

        Bus(String vehicleId, double mileageKmPerLiter, double dieselPricePerLiter) {
            super(vehicleId);
            this.mileageKmPerLiter = mileageKmPerLiter;
            this.dieselPricePerLiter = dieselPricePerLiter;
        }

        @Override
        double fuelCost(double km) {
            return (km / mileageKmPerLiter) * dieselPricePerLiter;
        }
    }

    static class Bike extends Vehicle {
        private final double petrolPricePerLiter;

        Bike(String vehicleId, double petrolPricePerLiter) {
            super(vehicleId);
            this.petrolPricePerLiter = petrolPricePerLiter;
        }

        @Override
        double fuelCost(double km) {
            double averageKmPerLiter = 45.0;
            return (km / averageKmPerLiter) * petrolPricePerLiter;
        }
    }

    // Added later without changing processFleet() logic.
    static class ElectricCar extends Vehicle {
        private final double unitPerKm;
        private final double electricityRatePerUnit;

        ElectricCar(String vehicleId, double unitPerKm, double electricityRatePerUnit) {
            super(vehicleId);
            this.unitPerKm = unitPerKm;
            this.electricityRatePerUnit = electricityRatePerUnit;
        }

        @Override
        double fuelCost(double km) {
            return (km * unitPerKm) * electricityRatePerUnit;
        }
    }

    static void processFleet(Vehicle[] fleet, double km) {
        for (Vehicle vehicle : fleet) {
            double cost = vehicle.fuelCost(km);
            System.out.printf("%s -> Cost for %.2f km: %.2f%n", vehicle.getVehicleId(), km, cost);
            printTypeSpecificInfo(vehicle);
        }
    }

    static void printTypeSpecificInfo(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            System.out.println("Type: Car, ID: " + car.getVehicleId());
        } else if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            System.out.println("Type: Bus, ID: " + bus.getVehicleId());
        } else if (vehicle instanceof Bike) {
            Bike bike = (Bike) vehicle;
            System.out.println("Type: Bike, ID: " + bike.getVehicleId());
        } else if (vehicle instanceof ElectricCar) {
            ElectricCar electricCar = (ElectricCar) vehicle;
            System.out.println("Type: ElectricCar, ID: " + electricCar.getVehicleId());
        }
    }

    public static void main(String[] args) {
        Vehicle[] fleet = {
            new Car("CAR-101", 8.5),
            new Bus("BUS-205", 4.0, 95.0),
            new Bike("BIKE-309", 102.0),
            new ElectricCar("EV-777", 0.18, 9.0)
        };

        processFleet(fleet, 120.0);
    }
}
