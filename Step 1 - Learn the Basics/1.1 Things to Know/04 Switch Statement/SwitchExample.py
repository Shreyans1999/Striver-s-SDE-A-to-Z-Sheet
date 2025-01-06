# Simulating switch statement using a dictionary
def switch_day(day):
    switch = {
        1: "Monday",
        2: "Tuesday",
        3: "Wednesday",
        4: "Thursday",
        5: "Friday",
        6: "Saturday",
        7: "Sunday"
    }
    return switch.get(day, "Invalid day")  # Default case

# Example usage
day = 3
print(switch_day(day))
