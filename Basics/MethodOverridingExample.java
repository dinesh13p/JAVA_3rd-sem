class Animal{
    void makeSound(){
        System.out.println("Animal makes sound!");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog barks.");
    }
}


public class MethodOverridingExample {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();
        
    }
    
}
