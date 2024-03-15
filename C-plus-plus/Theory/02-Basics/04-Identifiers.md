# Overview

In C++ programming language, `identifiers` are the **_unique names_** assigned to variables, functions, classes, structs, or other entities within the program.

&nbsp;

# Example

```cpp
int num = 11;

// here num is identifier
```

&nbsp;

&nbsp;

# Rules to Name of an Identifier in C++

- An identifier can consist of letters (A-Z or a-z), digits (0-9), and underscores (\_). Special characters and spaces are not allowed.

- An identifier can only begin with a letter or an underscore only, not with number.

- C++ has reserved keywords that cannot be used as identifiers since they have predefined meanings in the language. For example, `int` cannot be used as an identifier as it has already some predefined meaning in C++. Attempting to use these as identifiers will result in a compilation error.

- Identifier must be **_unique_** in its namespace.

&nbsp;

N.B: C++ is a **_case-sensitive_** language so the identifier such as `Num` and `num` are treated as different.

&nbsp;

# Example

```cpp
// C++ program to illustrate the identifiers
#include <iostream>
using namespace std;

// here Car_24 identifier is used to refer the below class
class Car_24 {
    string Brand;
    string model;
    int year;
};

// calculateSum identifier is used to call the below
// function
void calculateSum(int a, int b)
{
    int _sum = a + b;
    cout << "The sum is: " << _sum << endl;
}

int main()
{
    // identifiers used as variable names
    int studentAge = 20;
    double accountBalance = 1000.50;
    string student_Name = "Karan";

    calculateSum(2, 10);

    return 0;
}
```

&nbsp;
&nbsp;
&nbsp;
&nbsp;
&nbsp;
&nbsp;
