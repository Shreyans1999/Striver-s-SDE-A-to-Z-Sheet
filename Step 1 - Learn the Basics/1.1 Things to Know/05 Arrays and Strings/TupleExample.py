# Tuple Example with For Loop

my_tuple = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

print("Tuple elements tripled:")
for item in my_tuple:
    print(item * 3)

# Tuple Methods and Operations in Python

# Creating tuples
tuple1 = (1, 2, 3, 4, 5)
tuple2 = (6, 7, 8, 9, 10)

print("Original tuples:")
print("tuple1:", tuple1)  # Output: tuple1: (1, 2, 3, 4, 5)
print("tuple2:", tuple2)  # Output: tuple2: (6, 7, 8, 9, 10)

# 1. Tuple Operations
# Concatenation
combined_tuple = tuple1 + tuple2
print("\nCombined tuple:", combined_tuple)  # Output: Combined tuple: (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

# Repetition
repeated_tuple = tuple1 * 2
print("Repeated tuple:", repeated_tuple)  # Output: Repeated tuple: (1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

# 2. Tuple Methods
# Count occurrences
count_3 = tuple1.count(3)
print("\nCount of 3 in tuple1:", count_3)  # Output: Count of 3 in tuple1: 1

# Find index
index_5 = tuple1.index(5)
print("Index of 5 in tuple1:", index_5)  # Output: Index of 5 in tuple1: 4

# Length
print("Length of tuple1:", len(tuple1))  # Output: Length of tuple1: 5

# 3. Tuple Unpacking
a, b, c, d, e = tuple1
print("\nUnpacked values:", a, b, c, d, e)  # Output: Unpacked values: 1 2 3 4 5

# 4. Tuple with different data types
mixed_tuple = (1, "hello", 3.14, True)
print("\nMixed tuple:", mixed_tuple)  # Output: Mixed tuple: (1, 'hello', 3.14, True)

# 5. Nested tuples
nested_tuple = ((1, 2), (3, 4), (5, 6))
print("Nested tuple:", nested_tuple)  # Output: Nested tuple: ((1, 2), (3, 4), (5, 6))

# Accessing nested elements
print("First element of first tuple:", nested_tuple[0][0])  # Output: First element of first tuple: 1

"""
Table of Tuple Methods and Operations Used in This Program:

| Method/Operation | Description                                    | Example                    | Return Value                    |
|-----------------|------------------------------------------------|----------------------------|--------------------------------|
| +               | Concatenates tuples                            | tuple1 + tuple2           | New tuple                      |
| *               | Repeats tuple                                  | tuple1 * 2                | New tuple                      |
| count()         | Counts occurrences of element                  | tuple1.count(3)           | Integer                        |
| index()         | Returns index of first occurrence              | tuple1.index(5)           | Integer                        |
| len()           | Returns number of elements                     | len(tuple1)               | Integer                        |
| []              | Access element by index                        | tuple1[0]                 | Element at index               |
| unpacking       | Assigns tuple elements to variables            | a, b, c = tuple1          | None                           |
| in              | Checks if element exists                       | 3 in tuple1               | Boolean                        |
| min()           | Returns minimum value                          | min(tuple1)               | Minimum element                |
| max()           | Returns maximum value                          | max(tuple1)               | Maximum element                |
| sum()           | Returns sum of all elements                    | sum(tuple1)               | Sum of elements                |
| sorted()        | Returns sorted list of elements                | sorted(tuple1)            | Sorted list                    |
"""
