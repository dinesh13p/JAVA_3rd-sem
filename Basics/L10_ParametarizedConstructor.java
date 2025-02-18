public class L10_ParametarizedConstructor {
    
    //Data members
    int length;
    int breadth;

    //Parametarized Constructor
    L10_ParametarizedConstructor(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void displayDetails(){
        System.out.println("Length: "+ length);
        System.out.println("Breadth: "+ breadth);
    }

    public static void main(String[] args) {
        L10_ParametarizedConstructor parametarizedConstructor = new L10_ParametarizedConstructor(10, 20);
        parametarizedConstructor.displayDetails();
    }
}
