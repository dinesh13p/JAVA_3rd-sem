class Shape {
    int length;
    int breadth;
    int height;

}

class Cube extends Shape {
    int cubeVolume() {
        return length * length * length;
    }

}

class Cuboid extends Shape {
    int cuboidVolume() {
        return length * breadth * height;
    }
}

public class L15_Inheritance {
    public static void main(String[] args) {

        Cube cube = new Cube();
        cube.length = 10;
        System.out.println("Volume of cube: " + cube.cubeVolume());

        Cuboid cuboid = new Cuboid();
        cuboid.length = 4;
        cuboid.breadth = 5;
        cuboid.height = 6;
        System.out.println("Volume of cuboid: " + cuboid.cuboidVolume());
    }

}
