class Car{
    String name;
    int price;
}
public class L12_PassByReference{
    public static void main(String[] args){
        Car Car1 = new Car();
        Car1.name = "BMW";
        Car1.price = 23232;
        System.out.println(Car1.name);
        System.out.println(Car1.price);
        
        Car Car2 = new Car();
        Car2 = Car1;// Car2 is initialized with reference value of Car1
        System.out.println(Car2.name);
        System.out.println(Car2.price);
        Car2.name = "Porche";
        System.out.println(Car1.name);
    }
}