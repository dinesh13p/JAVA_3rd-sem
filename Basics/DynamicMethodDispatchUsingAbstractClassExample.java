// An abstract class can have both abstract (without body) and concrete methods.

abstract class Animal {
    // Abstract method
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bhow Bhow");
    }
}

public class DynamicMethodDispatchUsingAbstractClassExample {
    public static void main(String[] args) {
        Animal animal;
        animal = new Cat();
        animal.makeSound();

        animal = new Dog();
        animal.makeSound();
    }
}

