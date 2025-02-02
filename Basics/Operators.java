public class Operators {
    
    public static void main(String[] args) {
        // Operators: Operators are the symbol used to perform operations
        //   (+, -, <, >, !=, ==)

        // Operands: Operands are the variables
        // (a + b): a and b are operands, + is an operator



        // 1. Arithmetic Operator: Performs Mathematical calculation.
            // (+, -, *, /)
            
        System.out.println("Arithmetic Operators:");

        float a = 20;
        float b = 30;
        float AddResult = a + b;
        float SubResult = a - b;
        float Multiply = a * b;
        float Divide = a / b;

        System.out.println("Addition: " + AddResult);
        // System.out.println(Add: +(a + b));
        System.out.println("Subtraction: " + SubResult);
        // System.out.println(Sub: +(a - b));
        System.out.println("Multiplication: " + Multiply);
        // System.out.println(Multiply: +(a * b));
        System.out.println("Division: " + Divide);
        // System.out.println(Divide: +(a / b));



        // 2. Relational Operator: Compare between two or more than two values
            // (<, >, ==, <=, >=, !=)

            System.out.println("\nRelational Operators:");

            int num1 = 30;
            int num2 = 40;

            System.out.println("num1 < num2: "+ (num1 < num2));
            System.out.println("num1 > num2: "+ (num1 > num2));
            System.out.println("num1 == num2: "+ (num1 == num2));
            System.out.println("num1 <= num2: "+ (num1 <= num2));
            System.out.println("num1 =< num2: "+ (num1 >= num2));
            System.out.println("num1 != num2: "+ (num1 != num2));



        // 3. Logical Operator: Operation on boolean values
            // eg. AND(&&), OR(||), NOT(!)
            System.out.println("\nLogical Operators:");

            boolean x = true;
            boolean y = false;

            System.out.println("AND: "+ (x && y));
            System.out.println("OR: "+ (x || y));
            System.out.println("NOT: "+ (x != y));



        // 4. Assignment Operator: It is use dto assign the values
            // Operators: (+=, -=, /=, *=, =, %=)

            System.out.println("\nAssignment Operators:");
            int f = 2;
            int g = 3;

            System.out.println("+= : "+(f += g));
            System.out.println("-= : "+(f -= g));
            System.out.println("/= : "+(f /= g));
            System.out.println("*= : "+(f *= g));
            System.out.println("= : "+(f = g));
            System.out.println("%= : "+(f %= g));



        // 5. Ternary Operator:
            //  Syntax: (condition) ? "if true" : "if false"

            System.out.println("\nTernary Operators:");
            int k = 10;
            int l = 20;

            String result = (k < l) ? "True" : "False";
            // String result = (k < l) ? "Is less than" : "Is greater than";
            System.out.println(result);



        // 6. Bitwise Operator: Operation on bits (binary numbers)
            // Operators : & (bitwise AND), | (bitwise OR), ^ (bitwise XOR), ~ (bitwise Complement)

            System.out.println("\nBitwise Operators:");
            int m = 9;
            int n = 10;

            System.out.println("The Bitwise AND is: "+ (m & n));
            /* 9 = 1001
              10 = 1010
             AND   1000 (8)
            */
            System.out.println("The Bitwise OR is: "+ (m | n));
            /* 9 = 1001
              10 = 1010
              OR   1011 (11)
            */
            System.out.println("The Bitwise XOR is: "+ (m ^ n));
            System.out.println("The Bitwise Complement is: "+ (~m));



        // 7. Increament/Decreament operator:
        System.out.println("\nIncreament/Decreament Operators:");
        
        // In post increament/decreament the value is increased/decreased after variable is assigned
          // example: p++ , p--
              int v = 5;
              System.out.println("Post increament: "+(v++)); //will print 5 but value is increased
              System.out.println(v); //6
              System.out.println("Pre increament: "+(++v)); //7
              
              // In pre increament/decreament the value is increased/decreased before variable is assigned
                // example: ++p , --p
            int p = 5;
            System.out.println("Post decreament: "+(p--)); //will print 5 but value is decreased
            System.out.println(p); //4
            System.out.println("Pre decreament: "+(--p)); //3



        // 8. Shift Operator: Used to manipulate the bits.
        System.out.println("\nShift Operators:");

            // Left Shift (<<): Shifts are the bits to the left and fills 0 to the right 
            //    left shift by 2:  0000  0101  (5)
            //                    0 0001  0100  (20)
            int q = 5;
            int leftshiftResult = q << 2;
            System.out.println("The lest shift by 2: "+ (leftshiftResult));

            // Right Shift (<<): Right Shifts are the bits to the right and copy's 0 first and fills 0 to the left
            //   Right shift by 1:  0000  1010  (10)
            //                      0000  0101  (5)
            int r = 10;
            int rightshiftResult = r >> 1;
            System.out.println("The right shift by 1: "+ (rightshiftResult));
    }
}

