# Strings in Python:

# Strings are immutable sequences of characters.
# They are created using single or double quotes.

greeting = "Hello, World!"
print(greeting.upper())

# String Methods and Operations in Python

# Creating strings
str1 = "Hello, World!"
str2 = "Python Programming"

print("Original strings:")
print("str1:", str1)  # Output: str1: Hello, World!
print("str2:", str2)  # Output: str2: Python Programming

# 1. Case Conversion Methods
print("\nCase Conversion:")
print("Uppercase:", str1.upper())  # Output: Uppercase: HELLO, WORLD!
print("Lowercase:", str1.lower())  # Output: Lowercase: hello, world!
print("Title case:", str2.title())  # Output: Title case: Python Programming
print("Capitalize:", str1.capitalize())  # Output: Capitalize: Hello, world!

# 2. Search and Replace
print("\nSearch and Replace:")
print("Find 'World':", str1.find("World"))  # Output: Find 'World': 7
print("Count 'l':", str1.count("l"))  # Output: Count 'l': 3
print("Replace 'World' with 'Python':", str1.replace("World", "Python"))  # Output: Replace 'World' with 'Python': Hello, Python!

# 3. String Validation
print("\nString Validation:")
print("Is alpha:", "Hello".isalpha())  # Output: Is alpha: True
print("Is digit:", "123".isdigit())  # Output: Is digit: True
print("Is alphanumeric:", "Hello123".isalnum())  # Output: Is alphanumeric: True
print("Is space:", "   ".isspace())  # Output: Is space: True
print("Starts with 'Hello':", str1.startswith("Hello"))  # Output: Starts with 'Hello': True
print("Ends with '!':", str1.endswith("!"))  # Output: Ends with '!': True

# 4. String Formatting
print("\nString Formatting:")
print("Strip whitespace:", "  Hello  ".strip())  # Output: Strip whitespace: Hello
print("Split by comma:", str1.split(","))  # Output: Split by comma: ['Hello', ' World!']
print("Join with space:", " ".join(["Hello", "World"]))  # Output: Join with space: Hello World

# 5. String Operations
print("\nString Operations:")
print("Length:", len(str1))  # Output: Length: 13
print("First character:", str1[0])  # Output: First character: H
print("Last character:", str1[-1])  # Output: Last character: !
print("Substring:", str1[0:5])  # Output: Substring: Hello

# 6. String Formatting (f-strings)
name = "Alice"
age = 25
print(f"\nFormatted string: {name} is {age} years old")  # Output: Formatted string: Alice is 25 years old

# 7. String Alignment
text = "Python"
print("\nString Alignment:")
print("Left align:", text.ljust(10, "*"))  # Output: Left align: Python****
print("Right align:", text.rjust(10, "*"))  # Output: Right align: ****Python
print("Center align:", text.center(10, "*"))  # Output: Center align: **Python**

"""
Table of String Methods Used in This Program:

| Method/Operation | Description                                    | Example                    | Return Value                    |
|-----------------|------------------------------------------------|----------------------------|--------------------------------|
| upper()         | Converts to uppercase                          | str1.upper()              | Uppercase string               |
| lower()         | Converts to lowercase                          | str1.lower()              | Lowercase string               |
| title()         | Converts to title case                         | str2.title()              | Title case string              |
| capitalize()    | Capitalizes first character                    | str1.capitalize()         | Capitalized string             |
| find()          | Finds substring index                          | str1.find("World")        | Integer index or -1            |
| count()         | Counts substring occurrences                   | str1.count("l")           | Integer count                  |
| replace()       | Replaces substring                            | str1.replace("World", "Python") | New string                |
| isalpha()       | Checks if all characters are alphabetic        | "Hello".isalpha()         | Boolean                        |
| isdigit()       | Checks if all characters are digits            | "123".isdigit()           | Boolean                        |
| isalnum()       | Checks if alphanumeric                         | "Hello123".isalnum()      | Boolean                        |
| isspace()       | Checks if all characters are whitespace        | "   ".isspace()           | Boolean                        |
| startswith()    | Checks if string starts with prefix            | str1.startswith("Hello")  | Boolean                        |
| endswith()      | Checks if string ends with suffix              | str1.endswith("!")        | Boolean                        |
| strip()         | Removes leading/trailing whitespace            | "  Hello  ".strip()       | Stripped string                |
| split()         | Splits string by delimiter                     | str1.split(",")           | List of strings                |
| join()          | Joins strings with separator                   | " ".join(["Hello", "World"]) | Joined string              |
| len()           | Returns string length                          | len(str1)                 | Integer                        |
| []              | Access character by index                      | str1[0]                   | Character                      |
| [:]             | Get substring                                  | str1[0:5]                 | Substring                      |
| ljust()         | Left aligns string                             | text.ljust(10, "*")       | Aligned string                 |
| rjust()         | Right aligns string                            | text.rjust(10, "*")       | Aligned string                 |
| center()        | Center aligns string                           | text.center(10, "*")      | Aligned string                 |
"""
