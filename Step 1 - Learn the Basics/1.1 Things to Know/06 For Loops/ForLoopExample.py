# For loops in Python

# Simple for loop
for i in range(1, 6):
    print(f"Number: {i}")  # Output: Number: 1, Number: 2, Number: 3, Number: 4, Number: 5

# For-each loop with a list
numbers = [10, 20, 30, 40, 50]
for num in numbers:
    print(f"Array Element: {num}")  # Output: Array Element: 10, Array Element: 20, Array Element: 30, Array Element: 40, Array Element: 50

# List comprehension example
squared_numbers = [x**2 for x in range(1, 6)]
print(f"Squared Numbers: {squared_numbers}")  # Output: Squared Numbers: [1, 4, 9, 16, 25]
