name = "Chaitaly"

for i in name:
    print(i)
    if (i == "i"):
        print("half path")


#  iterating over a list

colors = ["red", "blue", "green", "pink", "black"]

for color in colors:
    print(color)
    for i in color:
        print("alphabets in color ", i)


# sequence of number

for i in range(5):
    print("one value", i)  # 0-4
for i in range(4, 9):
    print("two value", i)  # 4-8

for i in range(2, 10, 2):
    print("three value", i)

# for i in range(9, 4, 1):
#     print("two value", i)  # 4-8
