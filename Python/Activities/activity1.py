name = input("Enter name:")

#typecast age
age = int(input("Enter age:"))

year_when_100 = (100 - age) + 2025

#print("Year is: " + year_when_100) -> will give type error as print method can concatenate only strings
#use format string
print(f"Year when person turns 100: {year_when_100}")