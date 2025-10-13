# Function - Adding list of numbers
def sum(num_list):
    s = 0
    for num in num_list:       
        s = s + int(num)
    return s    

num_list = [10,5,20,35]
print(f"List: {num_list}")
sum_of_numbers = sum(num_list)
print(f"Sum of numbers in list: {sum_of_numbers}")
