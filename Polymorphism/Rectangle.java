public class Rectangle {

    static double Area( double length, double breadth){
        return length * breadth;
    }
    static double Perimeter (double length, double breadth){
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        
        double area = Area(12, 10);
        double perimeter = Perimeter(12, 10);
        
        System.out.println("Area: "+ area);
        System.out.println("Perimeter: "+ perimeter);



    }
    
}
