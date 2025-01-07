# For loops in Python

# Simple for loop
for i in range(1, 6):
    print(f"Number: {i}")

# For-each loop with a list
numbers = [10, 20, 30, 40, 50]
for num in numbers:
    print(f"Array Element: {num}")

# List comprehension example
squared_numbers = [x**2 for x in range(1, 6)]
print(f"Squared Numbers: {squared_numbers}")
