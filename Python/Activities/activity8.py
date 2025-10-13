# List Checker
num_list = input("Enter list of numbers with comma separated: ").split(",")
print(f"num_list: {num_list}")

result = False
if num_list[0] == num_list[-1]:
    result = True
else:
    result = False

print(f"Result is: {result}")