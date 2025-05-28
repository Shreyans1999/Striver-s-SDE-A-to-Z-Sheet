// Java Example: Pass by Value and Pass by Reference

class Box {
    int value;
    
    Box(int value) {
        this.value = value;
    }
}

class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class FunctionsExample {
    
    // Pass by Value (Primitive types)
    public static void incrementByValue(int num) {
        num += 10;
        System.out.println("Inside incrementByValue: " + num);  // Output: Inside incrementByValue: 30
    }

    // Pass by Value (Primitive types - double)
    public static void modifyDouble(double d) {
        d += 5.5;
        System.out.println("Inside modifyDouble: " + d);  // Output: Inside modifyDouble: 16.0
    }

    // Pass by Value (Primitive types - boolean)
    public static void modifyBoolean(boolean b) {
        b = !b;
        System.out.println("Inside modifyBoolean: " + b);  // Output: Inside modifyBoolean: false
    }

    // Pass by Reference (Object types)
    public static void incrementByReference(Box box) {
        box.value += 10;
        System.out.println("Inside incrementByReference: " + box.value);  // Output: Inside incrementByReference: 40
    }

    // Pass by Reference (String - special case)
    public static void modifyString(String str) {
        str = str + " Modified";
        System.out.println("Inside modifyString: " + str);  // Output: Inside modifyString: Hello Modified
    }

    // Pass by Reference (Custom Object)
    public static void modifyPerson(Person p) {
        p.age += 1;
        p.name = p.name + " Jr.";
        System.out.println("Inside modifyPerson: " + p.name + ", " + p.age);  // Output: Inside modifyPerson: John Jr., 26
    }

    public static void main(String[] args) {
        // Pass by Value examples
        int number = 20;
        System.out.println("Before incrementByValue: " + number);  // Output: Before incrementByValue: 20
        incrementByValue(number);
        System.out.println("After incrementByValue: " + number);  // Output: After incrementByValue: 20
        
        double price = 10.5;
        System.out.println("\nBefore modifyDouble: " + price);  // Output: Before modifyDouble: 10.5
        modifyDouble(price);
        System.out.println("After modifyDouble: " + price);  // Output: After modifyDouble: 10.5

        boolean flag = true;
        System.out.println("\nBefore modifyBoolean: " + flag);  // Output: Before modifyBoolean: true
        modifyBoolean(flag);
        System.out.println("After modifyBoolean: " + flag);  // Output: After modifyBoolean: true
        
        // Pass by Reference examples
        Box box = new Box(30);
        System.out.println("\nBefore incrementByReference: " + box.value);  // Output: Before incrementByReference: 30
        incrementByReference(box);
        System.out.println("After incrementByReference: " + box.value);  // Output: After incrementByReference: 40

        String message = "Hello";
        System.out.println("\nBefore modifyString: " + message);  // Output: Before modifyString: Hello
        modifyString(message);
        System.out.println("After modifyString: " + message);  // Output: After modifyString: Hello

        Person person = new Person("John", 25);
        System.out.println("\nBefore modifyPerson: " + person.name + ", " + person.age);  // Output: Before modifyPerson: John, 25
        modifyPerson(person);
        System.out.println("After modifyPerson: " + person.name + ", " + person.age);  // Output: After modifyPerson: John Jr., 26
    }
}

/*
| **Pass by Value**                        | **Pass by Reference (Reference Passed by Value)** |
| ---------------------------------------- | ------------------------------------------------- |
| `int`                                    | Custom objects (e.g., `Person`, `Box`)            |
| `double`                                 | Arrays (e.g., `int[]`, `String[]`)                |
| `boolean`                                | `String` *(immutable — content can't be changed)* |
| `char`, `byte`, `short`, `long`, `float` | Wrapper classes (e.g., `Integer`, `Double`)       |
*/



