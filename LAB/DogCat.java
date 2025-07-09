interface Animal {
    void eat();
}

interface Pet {
    void play();
}

public class DogCat implements Animal, Pet {
    public void eat() {
        System.out.println("DogCat is eating...");
    }
    public void play() {
        System.out.println("DogCat is playing...");
    }

    public static void main(String[] args) {
        DogCat obj = new DogCat();
        obj.eat();
        obj.play();
    }
}
