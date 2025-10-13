# Recursive Adder function
def sum(num):
    if num <= 1:
        return num
    else:
        return num + sum(num-1)
    
sum_of_numbers = sum(10)
print(sum_of_numbers)   