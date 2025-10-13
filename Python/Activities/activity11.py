# Fruit shop program
fruit_shop = {
    "apple" : 80,
    "banana" : 40,
    "grapes" : 70,
    "orange" : 60
}

fruit = input("Which fruit are you looking for? ").lower()
if (fruit in fruit_shop):
    print(f"{fruit} is available")
else:
    print(f"{fruit} is not available")
