fruit_prices = {
    "apple": 240,
    "banana": 50,
    "mango": 180,
    "grapes": 160,
    "orange": 150,
    "pineapple": 90
}

fruit_name = input("Enter the name of the fruit to check availability: ").lower()

if fruit_name in fruit_prices:
    print(f"Yes, {fruit_name} is available at ₹{fruit_prices[fruit_name]} per kg.")
else:
    print(f"Sorry, {fruit_name} is not available.")