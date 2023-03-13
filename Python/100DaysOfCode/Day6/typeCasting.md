- The conversion of one data type into the other data type is known as type casting in python or type conversion in python.

* Python supports a wide variety of functions or methods like: int(), float(), str(), ord(), hex(), oct(), tuple(), set(), list(), dict(), etc. for the type casting in python.

&nbsp;

&nbsp;

## Two Types of Typecasting:

- Explicit Conversion (Explicit type casting in python)
- Implicit Conversion (Implicit type casting in python).

&nbsp;

### Explicit type casting:

The conversion of one data type into another data type, done via developer or programmer's intervention or manually as per the requirement, is known as explicit type conversion.

It can be achieved with the help of Python’s built-in type conversion functions such as int(), float(), hex(), oct(), str(), etc .

```
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
```

&nbsp;

### Implicit type casting:

Python converts a smaller data type to a higher data type to prevent data loss.

Ex :

```
# a to int
a = 7
print(type(a))
>> int

# Python automatically converts b to float
b = 3.0
print(type(b))
>> float

# Python automatically converts c to float as it is a float addition
c = a + b
print(type(c))
>> float
```
