# Set Example with For Loop

my_set = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

print("Set elements squared:")
for item in my_set:
    print(item ** 2)

# Set Methods and Operations in Python

# Creating sets
set1 = {1, 2, 3, 4, 5}
set2 = {4, 5, 6, 7, 8}

print("Original sets:")
print("set1:", set1)  # Output: set1: {1, 2, 3, 4, 5}
print("set2:", set2)  # Output: set2: {4, 5, 6, 7, 8}

# 1. Adding elements
set1.add(6)
print("\nAfter adding 6 to set1:", set1)  # Output: After adding 6 to set1: {1, 2, 3, 4, 5, 6}

# 2. Removing elements
set1.remove(1)  # Raises KeyError if element not found
print("After removing 1 from set1:", set1)  # Output: After removing 1 from set1: {2, 3, 4, 5, 6}

set1.discard(10)  # No error if element not found
print("After trying to discard 10 from set1:", set1)  # Output: After trying to discard 10 from set1: {2, 3, 4, 5, 6}

# 3. Set Operations
# Union
union_set = set1 | set2  # or set1.union(set2)
print("\nUnion of set1 and set2:", union_set)  # Output: Union of set1 and set2: {2, 3, 4, 5, 6, 7, 8}

# Intersection
intersection_set = set1 & set2  # or set1.intersection(set2)
print("Intersection of set1 and set2:", intersection_set)  # Output: Intersection of set1 and set2: {4, 5, 6}

# Difference
difference_set = set1 - set2  # or set1.difference(set2)
print("Difference of set1 and set2:", difference_set)  # Output: Difference of set1 and set2: {2, 3}

# Symmetric Difference
symmetric_diff = set1 ^ set2  # or set1.symmetric_difference(set2)
print("Symmetric difference of set1 and set2:", symmetric_diff)  # Output: Symmetric difference of set1 and set2: {2, 3, 7, 8}

# 4. Set Methods
# Check if element exists
print("\nIs 3 in set1?", 3 in set1)  # Output: Is 3 in set1? True

# Check if set is subset
subset = {2, 3}
print("Is {2, 3} a subset of set1?", subset.issubset(set1))  # Output: Is {2, 3} a subset of set1? True

# Check if set is superset
print("Is set1 a superset of {2, 3}?", set1.issuperset(subset))  # Output: Is set1 a superset of {2, 3}? True

# Clear all elements
set3 = {1, 2, 3}
set3.clear()
print("\nAfter clearing set3:", set3)  # Output: After clearing set3: set()

# Copy a set
set4 = set1.copy()
print("Copy of set1:", set4)  # Output: Copy of set1: {2, 3, 4, 5, 6}

# Length of set
print("Length of set1:", len(set1))  # Output: Length of set1: 5

# Pop an arbitrary element
popped_element = set1.pop()
print("Popped element from set1:", popped_element)  # Output: Popped element from set1: 2 (or any other element)
print("set1 after popping:", set1)  # Output: set1 after popping: {3, 4, 5, 6} (remaining elements)

"""
Table of Set Methods Used in This Program:

| Method/Operation | Description                                    | Example                    | Return Value                    |
|-----------------|------------------------------------------------|----------------------------|--------------------------------|
| add()           | Adds a single element to the set              | set1.add(6)               | None                           |
| remove()        | Removes an element (raises KeyError if not found) | set1.remove(1)        | None                           |
| discard()       | Removes an element (no error if not found)    | set1.discard(10)          | None                           |
| union()         | Combines elements from both sets              | set1 | set2 or set1.union(set2) | New set with all elements     |
| intersection()  | Returns common elements                       | set1 & set2 or set1.intersection(set2) | New set with common elements |
| difference()    | Returns elements in first set but not in second | set1 - set2 or set1.difference(set2) | New set with unique elements |
| symmetric_difference() | Returns elements in either set but not both | set1 ^ set2 or set1.symmetric_difference(set2) | New set with unique elements |
| in              | Checks if element exists in set               | 3 in set1                 | Boolean (True/False)           |
| issubset()      | Checks if set is subset of another            | subset.issubset(set1)     | Boolean (True/False)           |
| issuperset()    | Checks if set is superset of another          | set1.issuperset(subset)   | Boolean (True/False)           |
| clear()         | Removes all elements from set                 | set3.clear()              | None                           |
| copy()          | Creates a shallow copy of set                 | set4 = set1.copy()        | New set with same elements     |
| len()           | Returns number of elements                    | len(set1)                 | Integer                        |
| pop()           | Removes and returns arbitrary element         | set1.pop()                | Removed element                |
"""
