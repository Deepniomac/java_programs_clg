// Write a Java program to implement Type Casting and Conversion.
class TypeCastingAndConversion{
    
    // Widening TypeCast
        public static void WideningCasting() {
        System.out.println("\nWidening Casting: ");
        
        byte byteValue = 10;
        short shortValue = byteValue;  // byte to short
        int intValue = shortValue;      // short to int
        long longValue = intValue;      // int to long
        float floatValue = longValue;   // long to float
        double doubleValue = floatValue; // float to double
        
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
    }
    
    // Narrowing TypeCast
        public static void NarrowingCasting() {
        System.out.println("\nNarrowing Casting: ");
        
        double doubleValue = 9.78;
        float floatValue = (float) doubleValue;     // double to float
        long longValue = (long) floatValue;         // float to long
        int intValue = (int) longValue;             // long to int
        short shortValue = (short) intValue;        // int to short
        byte byteValue = (byte) shortValue;         // short to byte
        
        System.out.println("double: " + doubleValue);
        System.out.println("float: " + floatValue);
        System.out.println("long: " + longValue);
        System.out.println("int: " + intValue);
        System.out.println("short: " + shortValue);
        System.out.println("byte: " + byteValue);
    }
    
    // Implicit TypeConversion
        public static void ImplicitConversion() {
        System.out.println("\nImplicit Conversion: ");
        
        int intNum = 100;
        double doubleNum = intNum;  // Implicit conversion
        System.out.println("int to double: " + doubleNum);
        
        char charValue = 'A';
        int charToInt = charValue;  // Implicit conversion
        System.out.println("char to int: " + charToInt);
    }
    
    // Explicit Conversion
        public static void ExplicitConversion() {
        System.out.println("\nExplicit Conversion: ");
        
        double doubleNum = 99.99;
        int intNum = (int) doubleNum;  // Explicit conversion
        System.out.println("double to int: " + intNum);
        
        String strNum = "123";
        int convertedInt = Integer.parseInt(strNum);  // String to int
        System.out.println("String to int: " + convertedInt + "\n");
    }
    
        public static void main(String args[]) {
        WideningCasting();
        NarrowingCasting();
        ImplicitConversion();
        ExplicitConversion();
    }
}