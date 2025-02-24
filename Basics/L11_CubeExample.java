public class L11_CubeExample {

    static int length;

    static int calculateVolumeOfCube(){
        return length * length * length;
    }

    public static void main(String[] args) {
        L11_CubeExample.length = 7;
        System.out.println("The volume of cube: "+calculateVolumeOfCube());
    }
    
}
