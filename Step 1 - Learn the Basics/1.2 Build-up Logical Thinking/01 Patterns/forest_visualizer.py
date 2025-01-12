# https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
# Python Script to generate N-dimensional forest pattern
def print_forest(N):
    for _ in range(N):
        print('* ' * N)

# Get the input
N = int(input())

# Print the forest pattern
print_forest(N)
