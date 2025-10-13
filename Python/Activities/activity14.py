# Recursion - Fibonacci numbers
def fibonacci(n):
    if (n <= 1):
        return n
    else:
        return (fibonacci(n-1) + fibonacci(n-2))     

num = int(input("How many fibonacci numbers to generate? "))

for i in range(num):
    print(fibonacci(i))