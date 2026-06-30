class Vehicle {

    double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {

    @Override
    double fuelCost(int km) {
        return km * 8;
    }
}

class Bus extends Vehicle {

    @Override
    double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicle {

    @Override
    double fuelCost(int km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {

    @Override
    double fuelCost(int km) {
        return km * 2;
    }
}

public class TransportCompany {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[4];

        vehicles[0] = new Car();
        vehicles[1] = new Bus();
        vehicles[2] = new Bike();
        vehicles[3] = new ElectricCar();

        int distance = 100;

        for (int i = 0; i < vehicles.length; i++) {

            System.out.println("Vehicle : " +
                    vehicles[i].getClass().getSimpleName());

            System.out.println("Fuel Cost : ₹" +
                    vehicles[i].fuelCost(distance));

            if (vehicles[i] instanceof Car) {

                Car c = (Car) vehicles[i];
                System.out.println("This is a Car.");

            } else if (vehicles[i] instanceof Bus) {

                Bus b = (Bus) vehicles[i];
                System.out.println("This is a Bus.");

            } else if (vehicles[i] instanceof Bike) {

                Bike b = (Bike) vehicles[i];
                System.out.println("This is a Bike.");

            } else if (vehicles[i] instanceof ElectricCar) {

                ElectricCar e = (ElectricCar) vehicles[i];
                System.out.println("This is an Electric Car.");
            }

            System.out.println();
        }
    }
}