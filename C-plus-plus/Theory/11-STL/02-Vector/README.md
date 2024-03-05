# Definition & Usage

Vectors are used to store elements of similar data types

The size of a vector can grow dynamically.

&nbsp;

`vector` is the class template that contains the vector container and its member functions.

&nbsp;

# Note

In vectors, data is inserted at the end.

To use vectors, we need to include the `vector` header file in our program.

```cpp
#include <vector>
```

&nbsp;

&nbsp;

# Vector Declaration

## Syntax

```cpp
vector <T> vector_name;
```

The type parameter `<T>` specifies the type of the vector. It can be any primitive data type such as **_int, char, float_**, etc.

&nbsp;

## Example

```cpp
vector<int> num;
```

&nbsp;

&nbsp;

# Vector Initialization

There are different ways to initialize a vector in C++.

&nbsp;

## Method 1:

```cpp
// Initializer list
vector<int> vector1 = {1, 2, 3, 4, 5};

// Uniform initialization
vector<int> vector2 {1, 2, 3, 4, 5};
```

&nbsp;

## Method 2:

```cpp
vector<int> vector3(5, 12);
```

this is equivalent to

```cpp
vector<int> vector3 = {12, 12, 12, 12, 12};
```

Here, 5 is the size of the vector and 12 is the value.

&nbsp;

# Example

```cpp
#include <iostream>
#include <vector>
using namespace std;

int main() {

  // initializer list
  vector<int> vector1 = {1, 2, 3, 4, 5};

  // uniform initialization
  vector<int> vector2{6, 7, 8, 9, 10};

  // method 3
  vector<int> vector3(5, 12);

  cout << "vector1 = ";

  // ranged loop
  for (const int& i : vector1) {
    cout << i << "  ";
  }

  cout << "\nvector2 = ";

  // ranged loop
  for (const int& i : vector2) {
    cout << i << "  ";
  }

  cout << "\nvector3 = ";

  // ranged loop
  for (int i : vector3) {
    cout << i << "  ";
  }

  return 0;
}
```

### output

```md
vector1 = 1 2 3 4 5  
vector2 = 6 7 8 9 10  
vector3 = 12 12 12 12 12
```

&nbsp;

&nbsp;

# Basic Vector Operations

- Add elements
- Access elements
- Change elements
- Remove elements

&nbsp;

## 1. Add Elements to a Vector

To add a single element into a vector, we use the `push_back()` function.

It inserts an element into the end of the vector.

&nbsp;

&nbsp;

Some commonly used member functions are written below:

| Iterator  | Description                                                                                                                                   |
| --------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| begin()   | Returns an iterator pointing to the first element in the vector                                                                               |
| end()     | Returns an iterator pointing to the theoretical element that follows the last element in the vector                                           |
| rbegin()  | Returns a reverse iterator pointing to the last element in the vector (reverse beginning). It moves from last to first element                |
| rend()    | Returns a reverse iterator pointing to the theoretical element preceding the first element in the vector (considered as reverse end)          |
| cbegin()  | Returns a constant iterator pointing to the first element in the vector.                                                                      |
| cend()    | Returns a constant iterator pointing to the theoretical element that follows the last element in the vector.                                  |
| crbegin() | Returns a constant reverse iterator pointing to the last element in the vector (reverse beginning). It moves from last to first element       |
| crend()   | Returns a constant reverse iterator pointing to the theoretical element preceding the first element in the vector (considered as reverse end) |

&nbsp;

&nbsp;

&nbsp;

&nbsp;

&nbsp;

&nbsp;
