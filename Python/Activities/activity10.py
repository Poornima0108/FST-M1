# Tuple number checker
num_list = input("Enter numbers with comma separated: ").split(",")
# Typecast list to tuple
str_tuple = tuple(num_list)
# Converting tuple of strings to integers
int_tuple = tuple(int(x) for x in str_tuple) 
print(f"Tuple of numbers: {int_tuple}")

print("Numbers divisible by 5:")
for num in int_tuple:
    if (num % 5 == 0):
        print(num)