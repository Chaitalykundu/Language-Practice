
list1 = [x**2 for x in range(10)]
print(list1)

list2 = [x for x in list1 if x % 2 == 0]
print(list2)

list3 = [i for i in range(10)]
print(list3)


def double(x):
    return x*2


print(double(10))


print("asdfgh")
print(r"\nwoow")


def divide(x, y):
    try:
        result = 0/1
    except ZeroDivisionError:
        print("error")
    else:
        print(result)
    finally:
        print("release")


# str = "hello"+1
# print(str)

kvps = {"user", "bill", "password", "hillary"}
print(kvps['password'])
