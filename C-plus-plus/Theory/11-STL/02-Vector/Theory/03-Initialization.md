# Initialization of Vector in C++

# 1. Initialization Using List

This initialization is done with a declaration. Here, we pass the list of elements to the vector constructor to create a vector with the specified elements.

&nbsp;

### Syntax
```cpp
vector<dataType> vector_name = { value1, value2, value3 ....}; 

// or

vector<dataType> vector_name { value1, value2, value3 ....}
```

&nbsp;

### Example

```cpp
// Initializer list
vector<int> vector1 = {1, 2, 3, 4, 5};

// Uniform initialization
vector<int> vector2 {1, 2, 3, 4, 5};
```

&nbsp;

&nbsp;

# 2. Initialization With a Single Value

This initialization is also done with declaration. Here, we specify the size of the vector and then initialize every element of the vector with the value.

&nbsp;

### Syntax

```cpp
vector<dataType> (size, value); 
```

&nbsp;

### Example

```cpp
vector<int> vector3(5, 12); // 5 is the size of the vector and 12 is the value.
```

this is equivalent to

```cpp
vector<int> vector3 = {12, 12, 12, 12, 12};
```

&nbsp;

&nbsp;

# 3. Initialization From Another Vector

This initialization is used to create a vector that is an exact copy of other_vec.

```cpp
vector<dataType> (other_vec);
```

&nbsp;

&nbsp;
&nbsp;

&nbsp;
&nbsp;

&nbsp;
