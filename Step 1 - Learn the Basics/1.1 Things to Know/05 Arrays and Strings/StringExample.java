// Strings in Java:

// Strings in Java are immutable sequences of characters.
// They are objects of the String class.

// String Methods and Operations in Java

public class StringExample {
    public static void main(String[] args) {
        // Creating strings
        String str1 = "Hello, World!";
        String str2 = "Java Programming";

        System.out.println("Original strings:");
        System.out.println("str1: " + str1);  // Output: str1: Hello, World!
        System.out.println("str2: " + str2);  // Output: str2: Java Programming

        // 1. Case Conversion Methods
        System.out.println("\nCase Conversion:");
        System.out.println("Uppercase: " + str1.toUpperCase());  // Output: Uppercase: HELLO, WORLD!
        System.out.println("Lowercase: " + str1.toLowerCase());  // Output: Lowercase: hello, world!

        // 2. Search and Replace
        System.out.println("\nSearch and Replace:");
        System.out.println("Index of 'World': " + str1.indexOf("World"));  // Output: Index of 'World': 7
        System.out.println("Last index of 'l': " + str1.lastIndexOf("l"));  // Output: Last index of 'l': 10
        System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));  // Output: Replace 'World' with 'Java': Hello, Java!

        // 3. String Validation
        System.out.println("\nString Validation:");
        System.out.println("Is empty: " + "".isEmpty());  // Output: Is empty: true
        System.out.println("Contains 'World': " + str1.contains("World"));  // Output: Contains 'World': true
        System.out.println("Starts with 'Hello': " + str1.startsWith("Hello"));  // Output: Starts with 'Hello': true
        System.out.println("Ends with '!': " + str1.endsWith("!"));  // Output: Ends with '!': true

        // 4. String Formatting
        System.out.println("\nString Formatting:");
        System.out.println("Trim: '" + "  Hello  ".trim() + "'");  // Output: Trim: 'Hello'
        System.out.println("Substring: " + str1.substring(0, 5));  // Output: Substring: Hello
        String[] parts = str1.split(",");
        System.out.println("Split by comma: " + parts[0] + " and" + parts[1]);  // Output: Split by comma: Hello and World!

        // 5. String Operations
        System.out.println("\nString Operations:");
        System.out.println("Length: " + str1.length());  // Output: Length: 13
        System.out.println("Character at index 0: " + str1.charAt(0));  // Output: Character at index 0: H
        System.out.println("Compare to 'Hello': " + str1.compareTo("Hello"));  // Output: Compare to 'Hello': 7

        // 6. String Formatting
        String name = "Alice";
        int age = 25;
        System.out.printf("\nFormatted string: %s is %d years old%n", name, age);  // Output: Formatted string: Alice is 25 years old

        // 7. String Building
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println("\nStringBuilder result: " + sb.toString());  // Output: StringBuilder result: Hello World

        // 8. String Joining
        String joined = String.join(" ", "Hello", "World", "!");
        System.out.println("Joined string: " + joined);  // Output: Joined string: Hello World !

        /*
        Table of String Methods Used in This Program:

        | Method/Operation | Description                                    | Example                    | Return Value                    |
        |-----------------|------------------------------------------------|----------------------------|--------------------------------|
        | toUpperCase()   | Converts to uppercase                          | str1.toUpperCase()        | Uppercase string               |
        | toLowerCase()   | Converts to lowercase                          | str1.toLowerCase()        | Lowercase string               |
        | indexOf()       | Finds first occurrence of substring            | str1.indexOf("World")     | Integer index or -1            |
        | lastIndexOf()   | Finds last occurrence of substring             | str1.lastIndexOf("l")     | Integer index or -1            |
        | replace()       | Replaces substring                            | str1.replace("World", "Java") | New string                |
        | isEmpty()       | Checks if string is empty                      | "".isEmpty()              | Boolean                        |
        | contains()      | Checks if string contains substring            | str1.contains("World")    | Boolean                        |
        | startsWith()    | Checks if string starts with prefix            | str1.startsWith("Hello")  | Boolean                        |
        | endsWith()      | Checks if string ends with suffix              | str1.endsWith("!")        | Boolean                        |
        | trim()          | Removes leading/trailing whitespace            | "  Hello  ".trim()        | Trimmed string                 |
        | substring()     | Gets substring                                 | str1.substring(0, 5)      | Substring                      |
        | split()         | Splits string by delimiter                     | str1.split(",")           | String array                   |
        | length()        | Returns string length                          | str1.length()             | Integer                        |
        | charAt()        | Gets character at index                        | str1.charAt(0)            | Character                      |
        | compareTo()     | Compares strings lexicographically             | str1.compareTo("Hello")   | Integer                        |
        | format()        | Formats string with arguments                  | String.format("%s", name) | Formatted string               |
        | join()          | Joins strings with delimiter                   | String.join(" ", "Hello", "World") | Joined string      |
        | StringBuilder   | Mutable string builder                         | new StringBuilder()       | StringBuilder object           |
        */
    }
}
