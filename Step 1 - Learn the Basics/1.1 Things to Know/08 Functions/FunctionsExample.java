
// Java Example: Pass by Value and Pass by Reference

class Box {
    int value;
    
    Box(int value) {
        this.value = value;
    }
}

public class FunctionsExample {
    
    // Pass by Value (Primitive types)
    public static void incrementByValue(int num) {
        num += 10;
        System.out.println("Inside incrementByValue: " + num);
    }

    // Pass by Reference (Object types)
    public static void incrementByReference(Box box) {
        box.value += 10;
        System.out.println("Inside incrementByReference: " + box.value);
    }

    public static void main(String[] args) {
        // Pass by Value example
        int number = 20;
        System.out.println("Before incrementByValue: " + number);
        incrementByValue(number);
        System.out.println("After incrementByValue: " + number);
        
        // Pass by Reference example
        Box box = new Box(30);
        System.out.println("Before incrementByReference: " + box.value);
        incrementByReference(box);
        System.out.println("After incrementByReference: " + box.value);
    }
}
