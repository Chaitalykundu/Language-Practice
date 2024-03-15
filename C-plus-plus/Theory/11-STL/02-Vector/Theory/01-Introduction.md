# What is vector

Vectors are the same as dynamic arrays with the ability to resize themselves automatically when an element is inserted or deleted, with their storage being handled automatically by the container.

Vectors are used to store elements of similar data types

The size of a vector can grow dynamically.

Vector elements are placed in **contiguous storage** so that they can be accessed and traversed using iterators.

In vectors, data is inserted at the end. Inserting at the end takes differential time, as sometimes the array may need to be extended. Removing the last element takes only constant time because no resizing happens. Inserting and erasing at the beginning or in the middle is linear in time.

&nbsp;

&nbsp;

# What is `std::vector` in C++?

* `std::vector` in C++ is the class template that contains the vector container and its member functions.

* It is defined inside the `<vector>` header file.

    ```cpp
    #include <vector>
    ```

* The member functions of the `std::vector` class provide various functionalities to vector containers.
