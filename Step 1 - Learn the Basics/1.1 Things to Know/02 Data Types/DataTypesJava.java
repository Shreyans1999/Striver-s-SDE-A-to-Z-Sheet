import java.util.*;
public class DataTypesJava {
    public static void main(String[] args) {
        // Primitive Data Types
        byte byteVar = 127;            // 1 byte, range: -128 to 127
        short shortVar = 32000;        // 2 bytes, range: -32,768 to 32,767
        int intVar = 100000;           // 4 bytes, range: -2^31 to 2^31-1
        long longVar = 10000000000L;   // 8 bytes, range: -2^63 to 2^63-1
        float floatVar = 3.14f;        // 4 bytes, decimal up to 7 digits
        double doubleVar = 3.14159;    // 8 bytes, decimal up to 15 digits
        char charVar = 'A';            // 2 bytes, single character or Unicode
        boolean boolVar = true;        // 1 bit, true or false

        // Non-Primitive Data Types (Reference Types)
        String stringVar = "Hello, Java!";
        int[] intArray = {1, 2, 3, 4, 5};

        // Displaying the values and types
        System.out.println("byte: " + byteVar + " | Type: " + ((Object) byteVar).getClass().getName());
        System.out.println("short: " + shortVar + " | Type: " + ((Object) shortVar).getClass().getName());
        System.out.println("int: " + intVar + " | Type: " + ((Object) intVar).getClass().getName());
        System.out.println("long: " + longVar + " | Type: " + ((Object) longVar).getClass().getName());
        System.out.println("float: " + floatVar + " | Type: " + ((Object) floatVar).getClass().getName());
        System.out.println("double: " + doubleVar + " | Type: " + ((Object) doubleVar).getClass().getName());
        System.out.println("char: " + charVar + " | Type: " + ((Object) charVar).getClass().getName());
        System.out.println("boolean: " + boolVar + " | Type: " + ((Object) boolVar).getClass().getName());
        System.out.println("String: " + stringVar + " | Type: " + stringVar.getClass().getName());
        System.out.println("Array: " + Arrays.toString(intArray) + " | Type: " + intArray.getClass().getName());
    }
}
