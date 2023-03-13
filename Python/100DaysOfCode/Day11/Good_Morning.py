# Create a python program capable of greeting you with Good Morning, Good Afternoon and Good Evening. Your program should use time module to get the current hour. Here is a sample program and documentation link for you:

import time
currentTime = time.strftime('%H: %M: %S')
print(currentTime)
currentTime = time.localtime()
print("fgh", currentTime)

currentHour = time.strftime("%H")
print(currentHour)

currentMinute = time.strftime("%M")
print(currentMinute)

currentSecond = time.strftime("%S")
print(currentSecond)

if (currentHour >= '0' and currentHour <= '11'):
    print("Good Morning")
elif (currentHour >= '12' and currentHour <= '16'):
    print("Good Afternoon")
else:
    print("Good Evening")
