class Parent {
    int number = 100; // attribute

    // constructor
    Parent() {
        System.out.println("parent class constructor called");
    }

    // parent method
    void otherMethod() {
        System.out.println("Parent other method called");
    }

    // parent second method
    void secondMethod() {
        System.out.println("Parent second method is called");
    }
}

class Child extends Parent {
    int number = 200; // attribute

    void display() {
        super.otherMethod();
        System.out.println("parent class number: " + super.number); // 100
        System.out.println("child class number: " + this.number); // 200
        super.secondMethod();
    }
}

public class L17_SuperKeywordExample {
    public static void main(String[] args) {

        Child Child = new Child();
        Child.display();
    }
}
