# Arrays in Python:

# Python does not have a built-in array type but uses lists or the array module for array-like structures.
# Lists are more commonly used because they are versatile and can hold mixed data types.

numbers = [1, 2, 3, 4, 5]
for num in numbers:
    print(num)


# List Example with For Loop

my_list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

print("List elements doubled:")
for item in my_list:
    print(item * 2)

# List Methods and Operations in Python

# Creating lists
list1 = [1, 2, 3, 4, 5]
list2 = [6, 7, 8, 9, 10]

print("Original lists:")
print("list1:", list1)  # Output: list1: [1, 2, 3, 4, 5]
print("list2:", list2)  # Output: list2: [6, 7, 8, 9, 10]

# 1. Adding elements
list1.append(6)
print("\nAfter appending 6 to list1:", list1)  # Output: After appending 6 to list1: [1, 2, 3, 4, 5, 6]

list1.extend([7, 8])
print("After extending list1:", list1)  # Output: After extending list1: [1, 2, 3, 4, 5, 6, 7, 8]

list1.insert(0, 0)
print("After inserting 0 at index 0:", list1)  # Output: After inserting 0 at index 0: [0, 1, 2, 3, 4, 5, 6, 7, 8]

# 2. Removing elements
list1.remove(0)  # Removes first occurrence of value
print("\nAfter removing 0 from list1:", list1)  # Output: After removing 0 from list1: [1, 2, 3, 4, 5, 6, 7, 8]

popped_element = list1.pop()  # Removes and returns last element
print("Popped element:", popped_element)  # Output: Popped element: 8
print("list1 after popping:", list1)  # Output: list1 after popping: [1, 2, 3, 4, 5, 6, 7]

# 3. List Operations
# Concatenation
combined_list = list1 + list2
print("\nCombined list:", combined_list)  # Output: Combined list: [1, 2, 3, 4, 5, 6, 7, 6, 7, 8, 9, 10]

# Repetition
repeated_list = list1 * 2
print("Repeated list:", repeated_list)  # Output: Repeated list: [1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7]

# 4. List Methods
# Sorting
list1.sort()
print("\nSorted list1:", list1)  # Output: Sorted list1: [1, 2, 3, 4, 5, 6, 7]

list1.reverse()
print("Reversed list1:", list1)  # Output: Reversed list1: [7, 6, 5, 4, 3, 2, 1]

# Counting
count_3 = list1.count(3)
print("Count of 3 in list1:", count_3)  # Output: Count of 3 in list1: 1

# Finding index
index_5 = list1.index(5)
print("Index of 5 in list1:", index_5)  # Output: Index of 5 in list1: 2

# Length
print("Length of list1:", len(list1))  # Output: Length of list1: 7

# Clear
list1.clear()
print("After clearing list1:", list1)  # Output: After clearing list1: []

"""
Table of List Methods Used in This Program:

| Method/Operation | Description                                    | Example                    | Return Value                    |
|-----------------|------------------------------------------------|----------------------------|--------------------------------|
| append()        | Adds element at the end                        | list1.append(6)           | None                           |
| extend()        | Adds multiple elements at the end              | list1.extend([7, 8])      | None                           |
| insert()        | Inserts element at specified index             | list1.insert(0, 0)        | None                           |
| remove()        | Removes first occurrence of value              | list1.remove(0)           | None                           |
| pop()           | Removes and returns element at index           | list1.pop()               | Removed element                |
| sort()          | Sorts list in ascending order                  | list1.sort()              | None                           |
| reverse()       | Reverses list in place                         | list1.reverse()           | None                           |
| count()         | Counts occurrences of element                  | list1.count(3)            | Integer                        |
| index()         | Returns index of first occurrence              | list1.index(5)            | Integer                        |
| clear()         | Removes all elements                           | list1.clear()             | None                           |
| len()           | Returns number of elements                     | len(list1)                | Integer                        |
| +               | Concatenates lists                             | list1 + list2             | New list                       |
| *               | Repeats list                                   | list1 * 2                 | New list                       |
"""