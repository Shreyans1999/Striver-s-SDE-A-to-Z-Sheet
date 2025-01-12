# https://www.geeksforgeeks.org/problems/count-digits5716/1

n = int(input("Enter a number: "))
temp = n
count = 0

while n > 0:
    rem = n % 10
    if rem != 0 and temp % rem == 0:
        count += 1
    n //= 10

print(f"The count of digits that evenly divide {temp} is: {count}")
