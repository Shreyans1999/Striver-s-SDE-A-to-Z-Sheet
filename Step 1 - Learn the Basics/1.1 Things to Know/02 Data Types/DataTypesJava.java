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

        // Displaying values
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
        System.out.println("String: " + stringVar);
        System.out.println("Array: " + java.util.Arrays.toString(intArray));
    }
}
