package org.example;

public class App {
    public static void Main(String[] args) {
        Car car = new Car(modelName"car1", wheelCount 4);
        Car car2 = new Car(modelName"car2", wheelCount 4);

        Truck truck = new Truck(modelName "truck1", wheelCount 6);
        Truck truck2 = new Truck(modelName"truck2", wheelCount 6);

        Bicycle bicycle = new Bicycle(modelName"bike1", wheelCount 2);
        Bicycle blcycle2 = new Bicycle(modelName"bike2", wheelCount 2);
        Transport[] transports = {
                car,
                car2, |
                truck,
                truck2,
                bicycle,
                bicycle2
};
        ServiceStation station = new ServiceStation();

        for (Transport transport : transports) {
            station.check(transport);
        }
    }
}

