number = int(input("Enter a number : "))

if (number == 0):
    print("Value is 0")
elif (number > 0):
    if (number >= 1 and number <= 25):
        print("Value is between 1 to 25")
    elif (number >= 26 and number <= 50):
        print("Value is between 26 to 50")
    elif (number >= 51 and number <= 75):
        print("Value is between 51 to 75")
    elif (number >= 76 and number <= 100):
        print("Value is between 76 to 100")
    else:
        print("Value is more than 100")
else:
    print("Value if negative")
