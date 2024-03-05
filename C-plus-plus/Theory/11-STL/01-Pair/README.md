# Pair

- pair is a part of **utility library**

* A pair is a container for two values (like a tuple). The datatype of these values might or might not be the same

* It provides a way to store two heterogeneous objects as a single unit.

* It is basically used if we want to store **tuples**

* The first element is referenced as ‘first’ and the second element as ‘second’ and the order is fixed (first, second).

* To access the elements, we use variable name followed by **dot** operator followed by the keyword first or second.

&nbsp;

&nbsp;

# Initializing a Pair

## Syntax :

```cpp
// defining a pair
pair <data_type1, data_type2> Pair_name;

// initializing the value
Pair_name.first = value;
Pair_name.second = value;
```

&nbsp;

## Syntax :

```cpp
pair (data_type1, data_type2) Pair_name (value1, value2) ;
```

&nbsp;

### Example

```cpp
pair  g1;         //default
pair  g2(1, 'a');  //initialized,  different data type
pair  g3(1, 10);   //initialized,  same data type
pair  g4(g3);    //copy of g3
```

&nbsp;

## Syntax :

```cpp
pair (data_type1, data_type2) Pair_name = {value1, value2} ;
```

- If the value is not initialized, the first value of the pair gets automatically initialized to 0.

&nbsp;

&nbsp;

&nbsp;

# Member Functions

Member functions are :

1. make_pair()
2. swap
3. tie()

&nbsp;

&nbsp;

# make_pair():

- This template function allows to create a value pair without writing the types explicitly.

&nbsp;

## Syntax:

```cpp
// defining a pair
pair<data_type1, data_type2> Pair_name;

// initializing the values
Pair_name = make_pair(value1,value2);


/// another syntax
pair<char, int> pair1 = make_pair('A', 1);
```

&nbsp;

## Example :

```cpp
// CPP Program to demonstrate make_pair()
// function in pair
#include <iostream>
#include <utility>
using namespace std;

// Driver Code
int main()
{
	pair<int, char> PAIR1;
	pair<string, double> PAIR2("GeeksForGeeks", 1.23);
	pair<string, double> PAIR3;

	PAIR1.first = 100;
	PAIR1.second = 'G';

	PAIR3 = make_pair("GeeksForGeeks is Best", 4.56);

	cout << PAIR1.first << " ";
	cout << PAIR1.second << endl;

	cout << PAIR2.first << " ";
	cout << PAIR2.second << endl;

	cout << PAIR3.first << " ";
	cout << PAIR3.second << endl;

	return 0;
}

```

&nbsp;

&nbsp;

# swap:

This function swaps the contents of one pair object with the contents of another pair object.

The pairs must be of the same type.

&nbsp;

## Syntax:

```cpp
pair1.swap(pair2) ;
```

## Example

```cpp
// CPP Program to demonstrate swap()
// function in pair
#include <iostream>
#include <utility>

using namespace std;

// Driver Code
int main()
{
	pair<char, int> pair1 = make_pair('A', 1);
	pair<char, int> pair2 = make_pair('B', 2);

	cout << "Before swapping:\n ";
	cout << "Contents of pair1 = " << pair1.first << " "
		<< pair1.second;
	cout << "Contents of pair2 = " << pair2.first << " "
		<< pair2.second;
	pair1.swap(pair2);

	cout << "\nAfter swapping:\n ";
	cout << "Contents of pair1 = " << pair1.first << " "
		<< pair1.second;
	cout << "Contents of pair2 = " << pair2.first << " "
		<< pair2.second;

	return 0;
}

```

&nbsp;

&nbsp;

# tie()

This function works the same as in **tuples**.

It creates a tuple of `lvalue` references to its arguments i.e., to unpack the tuple (or here pair) values into separate variables.

&nbsp;

## Syntax

```cpp
tie(int &, int &) = pair1;
```

## Example

```cpp
// CPP code to illustrate tie() in Pair
#include <bits/stdc++.h>
using namespace std;

// Driver Code
int main()
{
	pair<int, int> pair1 = { 1, 2 };
	int a, b;
	tie(a, b) = pair1;
	cout << a << " " << b << "\n";

	pair<int, int> pair2 = { 3, 4 };
	tie(a, ignore) = pair2;

	// prints old value of b
	cout << a << " " << b << "\n";

	// Illustrating pair of pairs
	pair<int, pair<int, char> > pair3 = { 3, { 4, 'a' } };
	int x, y;
	char z;

	// tie(x,y,z) = pair3; Gives compilation error
	// tie(x, tie(y,z)) = pair3; Gives compilation error
	// Each pair needs to be explicitly handled
	tie(x,ignore) = pair3;
	tie(y, z) = pair3.second;
	cout << x << " " << y << " " << z << "\n";
}


```

&nbsp;

&nbsp;

# Types of Operators Used in Pair

operators(=, ==, !=, >=, <=) in Pair

&nbsp;

| Operator   | Symbol | Description                                              | Syntax                                                               |
| ---------- | ------ | -------------------------------------------------------- | -------------------------------------------------------------------- |
| equal      | =      | It assigns a new object for a pair object.               | `pair& operator= (const pair& pr);`                                  |
| Comparison | ==     | The comparison operator compares the values of two pairs | `if ( (pari1.first ==pair2.first) && (pair1.second==pair2.second) )` |
| Not equal  | !=     | The comparison operator compares the values of two pairs | `if ( (pari1.first !=pair2.first) && (pair1.second!=pair2.second) )` |
| Logical    | >=, <= | The comparison operator compares the values of two pairs | `if ( (pari1.first >=pair2.first) && (pair1.second<=pair2.second) )` |

&nbsp;

&nbsp;
