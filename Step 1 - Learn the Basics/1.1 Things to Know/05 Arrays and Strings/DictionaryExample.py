# Dictionary Example with For Loop

my_dict = {'a': 1, 'b': 2, 'c': 3, 'd': 4, 'e': 5}

print("Dictionary values doubled:")
for key, value in my_dict.items():
    print(f"Key: {key}, Value: {value * 2}")

# Dictionary Methods and Operations in Python

# Creating dictionaries
dict1 = {'a': 1, 'b': 2, 'c': 3}
dict2 = {'d': 4, 'e': 5, 'f': 6}

print("Original dictionaries:")
print("dict1:", dict1)  # Output: dict1: {'a': 1, 'b': 2, 'c': 3}
print("dict2:", dict2)  # Output: dict2: {'d': 4, 'e': 5, 'f': 6}

# 1. Adding/Updating elements
dict1['d'] = 4
print("\nAfter adding 'd':", dict1)  # Output: After adding 'd': {'a': 1, 'b': 2, 'c': 3, 'd': 4}

dict1.update({'e': 5, 'f': 6})
print("After updating with multiple items:", dict1)  # Output: After updating with multiple items: {'a': 1, 'b': 2, 'c': 3, 'd': 4, 'e': 5, 'f': 6}

# 2. Removing elements
removed_value = dict1.pop('a')
print("\nRemoved value for 'a':", removed_value)  # Output: Removed value for 'a': 1
print("dict1 after popping 'a':", dict1)  # Output: dict1 after popping 'a': {'b': 2, 'c': 3, 'd': 4, 'e': 5, 'f': 6}

# Remove last inserted item
last_item = dict1.popitem()
print("Last item removed:", last_item)  # Output: Last item removed: ('f', 6)
print("dict1 after popitem:", dict1)  # Output: dict1 after popitem: {'b': 2, 'c': 3, 'd': 4, 'e': 5}

# 3. Dictionary Methods
# Get value with default
value = dict1.get('b', 'Not found')
print("\nValue for 'b':", value)  # Output: Value for 'b': 2

# Get all keys
keys = dict1.keys()
print("Keys in dict1:", list(keys))  # Output: Keys in dict1: ['b', 'c', 'd', 'e']

# Get all values
values = dict1.values()
print("Values in dict1:", list(values))  # Output: Values in dict1: [2, 3, 4, 5]

# Get all items
items = dict1.items()
print("Items in dict1:", list(items))  # Output: Items in dict1: [('b', 2), ('c', 3), ('d', 4), ('e', 5)]

# Check if key exists
print("Is 'c' in dict1?", 'c' in dict1)  # Output: Is 'c' in dict1? True

# Length
print("Length of dict1:", len(dict1))  # Output: Length of dict1: 4

# Clear
dict1.clear()
print("After clearing dict1:", dict1)  # Output: After clearing dict1: {}

"""
Table of Dictionary Methods Used in This Program:

| Method/Operation | Description                                    | Example                    | Return Value                    |
|-----------------|------------------------------------------------|----------------------------|--------------------------------|
| []              | Access/Add/Update value by key                 | dict1['d'] = 4            | None                           |
| update()        | Updates dict with key-value pairs              | dict1.update({'e': 5})    | None                           |
| pop()           | Removes key and returns value                  | dict1.pop('a')            | Value of removed key           |
| popitem()       | Removes and returns last item                  | dict1.popitem()           | Tuple of (key, value)          |
| get()           | Returns value for key with default             | dict1.get('b', 'Not found')| Value or default              |
| keys()          | Returns view of all keys                       | dict1.keys()              | View object of keys            |
| values()        | Returns view of all values                     | dict1.values()            | View object of values          |
| items()         | Returns view of all items                      | dict1.items()             | View object of (key, value) pairs|
| in              | Checks if key exists                           | 'c' in dict1              | Boolean                        |
| len()           | Returns number of items                        | len(dict1)                | Integer                        |
| clear()         | Removes all items                              | dict1.clear()             | None                           |
"""
