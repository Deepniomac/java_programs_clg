// Write a Java program to implement Wrapper Classes
class WrapperClass{
    public static void main(String args[]){
        // Creating Integer wrapper class object
        Integer Obj1 = Integer.valueOf(10);
        System.out.println("\nInteger Value: " + Obj1);

        // Creating Double wrapper class object
        Double Obj2 = Double.valueOf(10.5);
        System.out.println("Double Value: " + Obj2);

        // Creating Character wrapper class object
        Character Obj3 = Character.valueOf('A');
        System.out.println("Character Value: " + Obj3 +"\n");

        // Unboxing - converting wrapper class object to primitive type
        int intValue = Obj1.intValue();
        double doubleValue = Obj2.doubleValue();
        char charValue = Obj3.charValue();

        System.out.println("Unboxed Integer Value: " + intValue);
        System.out.println("Unboxed Double Value: " + doubleValue);
        System.out.println("Unboxed Character Value: " + charValue + "\n");
    }
}