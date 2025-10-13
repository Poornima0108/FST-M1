# List Sum Calculator
num_list = input("Enter list of numbers with comma separated: ").split(",")
print(f"num_list: {num_list}")

sum = 0
for num in num_list:
    sum = sum + int(num)

print(f"Sum of numbers: {sum}")

