// Compile-time Polymorphism: Method Overloading
class CompileTimePolymorphism {
    void show(int a) {
        System.out.println("Argument: " + a);
    }
    void show(String a) {
        System.out.println("Argument: " + a);
    }
}

// Runtime Polymorphism: Method Overriding
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Compile-time Polymorphism
        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        obj.show(10);
        obj.show("Hello");

        // Runtime Polymorphism
        Animal a;
        a = new Animal();
        a.sound();
        a = new Dog();
        a.sound();
    }
}
