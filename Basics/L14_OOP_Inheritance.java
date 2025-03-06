class Vehicle { // parent class or super class
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle { // child class or sub class
    void stop() {
        System.out.println("Vehicle stopped!");
    }
}

public class L14_OOP_Inheritance {
    public static void main(String[] args) {
        /*
         * Inheritance
         * Extracting the property from parent (super) class to child (sub) class
         * 
         * Functions:
         * a. Polymorphism
         * b. Code reusability
         * c. Method Overriding
         * 
         * Types of Inheritance:
         * a. Single Inheritance
         * b. Multiple
         * c. Multilevel
         * d. Hybrid
         * 
         */
        Vehicle vehicle = new Vehicle();
        vehicle.run();

        Car car = new Car();
        car.stop();
        car.run();

    }
}
