x = 4

match x:
    case 0:
        print("x is 0")
    case 1:
        print("x is 1")
    case _:  # _ means default
        print("x is more than 1")
