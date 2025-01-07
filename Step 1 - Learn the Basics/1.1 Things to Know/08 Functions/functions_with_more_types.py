# Python Example: Pass by Value and Pass by Reference with Various Data Types

# Pass by Value (Immutable types)
def increment_by_value(num):
    if isinstance(num, (int, float)):  # Check if num is a number
        num += 10
    elif isinstance(num, str):  # Handle string separately
        num += "10"
    print(f"Inside increment_by_value: {num}")

# Pass by Reference (Mutable types)
def increment_by_reference(obj):
    if isinstance(obj, dict) or isinstance(obj, list) or isinstance(obj, set):
        if isinstance(obj, dict):
            obj['value'] += 10
        elif isinstance(obj, list):
            obj[0] += 10  # Modify the first element of the list
        elif isinstance(obj, set):
            obj.add(99)  # Add an element to the set
        print(f"Inside increment_by_reference: {obj}")

# Pass by Value example
number = 20
print(f"Before increment_by_value: {number}")
increment_by_value(number)
print(f"After increment_by_value: {number}")

# Pass by Reference examples
# Dictionary
box = {'value': 30}
print(f"Before increment_by_reference (dict): {box['value']}")
increment_by_reference(box)
print(f"After increment_by_reference (dict): {box['value']}")

# List
box_list = [30]
print(f"Before increment_by_reference (list): {box_list[0]}")
increment_by_reference(box_list)
print(f"After increment_by_reference (list): {box_list[0]}")

# Tuple (immutable, behaves as pass by value)
box_tuple = (30,)
try:
    print(f"Before increment_by_reference (tuple): {box_tuple[0]}")
    increment_by_reference(box_tuple)  # This will not work as tuples are immutable
    print(f"After increment_by_reference (tuple): {box_tuple[0]}")
except Exception as e:
    print(f"Error for tuple: {e}")

# Set
box_set = {30}
print(f"Before increment_by_reference (set): {box_set}")
increment_by_reference(box_set)
print(f"After increment_by_reference (set): {box_set}")

# String (immutable, behaves as pass by value)
box_string = "30"
print(f"Before increment_by_value (string): {box_string}")
increment_by_value(box_string)  # Strings are immutable
print(f"After increment_by_value (string): {box_string}")
