# Python Example: Pass by Value and Pass by Reference with Various Data Types

# Pass by Value (Immutable types)
def increment_by_value(num):
    if isinstance(num, (int, float)):  # Check if num is a number
        num += 10
    elif isinstance(num, str):  # Handle string separately
        num += "10"
    print(f"Inside increment_by_value: {num}")  # Output: Inside increment_by_value: 30 (for int)
                                                # Output: Inside increment_by_value: 3010 (for string)

# Pass by Reference (Mutable types)
def increment_by_reference(obj):
    if isinstance(obj, dict) or isinstance(obj, list) or isinstance(obj, set):
        if isinstance(obj, dict):
            obj['value'] += 10
        elif isinstance(obj, list):
            obj[0] += 10  # Modify the first element of the list
        elif isinstance(obj, set):
            obj.add(99)  # Add an element to the set
        print(f"Inside increment_by_reference: {obj}")  # Output varies based on type:
                                                       # dict: Inside increment_by_reference: {'value': 40}
                                                       # list: Inside increment_by_reference: [40]
                                                       # set: Inside increment_by_reference: {30, 99}

# Pass by Value example
number = 20
print(f"Before increment_by_value: {number}")  # Output: Before increment_by_value: 20
increment_by_value(number)
print(f"After increment_by_value: {number}")  # Output: After increment_by_value: 20

# Pass by Reference examples
# Dictionary
box = {'value': 30}
print(f"Before increment_by_reference (dict): {box['value']}")  # Output: Before increment_by_reference (dict): 30
increment_by_reference(box)
print(f"After increment_by_reference (dict): {box['value']}")  # Output: After increment_by_reference (dict): 40

# List
box_list = [30]
print(f"Before increment_by_reference (list): {box_list[0]}")  # Output: Before increment_by_reference (list): 30
increment_by_reference(box_list)
print(f"After increment_by_reference (list): {box_list[0]}")  # Output: After increment_by_reference (list): 40

# Tuple (immutable, behaves as pass by value)
box_tuple = (30,)
try:
    print(f"Before increment_by_reference (tuple): {box_tuple[0]}")  # Output: Before increment_by_reference (tuple): 30
    increment_by_reference(box_tuple)  # This will not work as tuples are immutable
    print(f"After increment_by_reference (tuple): {box_tuple[0]}")
except Exception as e:
    print(f"Error for tuple: {e}")  # Output: Error for tuple: 'tuple' object does not support item assignment

# Set
box_set = {30}
print(f"Before increment_by_reference (set): {box_set}")  # Output: Before increment_by_reference (set): {30}
increment_by_reference(box_set)
print(f"After increment_by_reference (set): {box_set}")  # Output: After increment_by_reference (set): {30, 99}

# String (immutable, behaves as pass by value)
box_string = "30"
print(f"Before increment_by_value (string): {box_string}")  # Output: Before increment_by_value (string): 30
increment_by_value(box_string)  # Strings are immutable
print(f"After increment_by_value (string): {box_string}")  # Output: After increment_by_value (string): 30
