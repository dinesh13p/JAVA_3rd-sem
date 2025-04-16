class Animal {
    void makeSound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat mewos!");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        Animal animal;
        animal = new Animal();
        animal.makeSound();

        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();

        /*
         * Dynamic Method Dispatch
         * -> It is also known as runtime polymorphism
         * -> Advantages:
         * a. Loose coupling can be achieved.
         * It can be achieved in:
         * i) Abstract classes
         * ii) Interfaces
         */

    }
}
