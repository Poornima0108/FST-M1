# Combining Lists
list1 = [10,53,30,67,11]
list2 = [20,30,51,70,97]
list3 = []

for num in list1:
    if (num % 2 != 0):
        list3.append(num)

for num in list2:
    if (num % 2 == 0):
        list3.append(num)

print(f"List3: {list3}")        