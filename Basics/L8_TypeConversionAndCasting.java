public class L8_TypeConversionAndCasting {

    public static void main(String[] args) {
        
        // Type conversion (widening)
        int integerNumber = 20;
        float floatNumber = integerNumber;
        System.out.println(floatNumber);


        // Type Casting (Explicity Conversion)
        float secondFloatNumber = 20.5f;
        int seconfIntNumber = (int) secondFloatNumber;
        System.out.println(seconfIntNumber);


        // 10 + 10 = 20
        // (int)"20" + (int)"30": 20 + 30 = 50

    }
    
}
