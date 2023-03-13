# Explicit type casting
# string to int

a = "43"
b = "57"
ans = int(a) + int(b)
print(ans)
print(type(ans))

# int to string
c = 43
d = "57"
ans1 = str(c) + d
print(ans1)
print(type(ans1))

e = 76
print(float(e))


# Implicit type casting
# a to int
a = 7
print(type(a))
# >> int

# Python automatically converts b to float
b = 3.0
print(type(b))
# >> float

# Python automatically converts c to float as it is a float addition
c = a + b
print(type(c))
# >> float
