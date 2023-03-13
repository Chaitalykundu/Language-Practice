string = "ChaiTAly KUndu"

# upper
print(string.upper())

# isupper
str1 = "WORLD HEALTH ORGANIZATION"
print(str1.isupper())
print(string.isupper())

# lower
print(string.lower())

# islower
str1 = "welcome"
print(str1.isalpha())
str1 = "Welcome"
print(str1.islower())


# strip
str2 = " Silver   Spoon "
print(str2.strip())

# rstrip
str3 = "!! Sil!ver ! Spoon !!!!!!!!!!!!!!"
print(str3.rstrip("!"))

# replace
print(string.replace("ChaiTAly", "Monisha"))


# split
str2 = "Silver Spoon"
print(str2.split(" "))

# capitalize
string1 = "hello WoRlD"
print("capitalize", string1.capitalize())


# center
str1 = "Welcome to the Console!!!"
print(str1.center(50, "."))


# count
string2 = "hello ! How are you? are you in office? "
print("count", string2.count("e"))
print("count", string2.count("are"))


# endswith
str1 = "Welcome to the Console!"
print("endswith", str1.endswith("e!"))  # O/P : True
print("endswith", str1.endswith("Con"))  # O/P : False


str1 = "Welcome to the Console !!!"
print("endswith", str1.endswith("to", 4, 10))  # O/P : True
print("endswith", str1.endswith("to", 4, 8))  # O/P : False


# startswith
str1 = "Python is a Interpreted Language"
print("startswith", str1.startswith("Python"))


# find
str1 = "His name is D. He is an honest man."
print(str1.find("an"))
print(str1.find("honesty"))


# index
str1 = "He's name is Dan. Dan is an honest man."
print(str1.index("Dan"))
# print(str1.index("Daniel"))


# isalnum
str1 = "WelcomeToTheConsole01"
print(str1.isalnum())

str2 = "WelcomeToThe$%^Console01$#%^"
print(str2.isalnum())


# isalpha
str1 = "Welcome"
print(str1.isalpha())

str1 = "Welcome01"
print(str1.isalpha())


# isprintable
str1 = "We wish you a Merry Christmas!"
print(str1.isprintable())

sd = "We wish you a Merry Christmas \n"
print(sd.isprintable())

# isspace
sd = "        "
print("isspace", sd.isspace())

sd = "              "
print("isspace", sd.isspace())

sd = "We wish you a          Merry Christmas"
print("isspace", sd.isspace())

# istitle
str1 = "World Health Organization"
print("title", str1.istitle())

str2 = "World health Organization"
print("title", str2.istitle())

# title
str1 = "He's name is Dan. Dan is an honest man."
print("title", str1.title())

# swapcase
str1 = "Python is a Interpreted Language"
print("swapcase", str1.swapcase())
