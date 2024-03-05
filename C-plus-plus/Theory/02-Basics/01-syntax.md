# Syntax

`Syntax` refers to the rules and regulations for writing statements in a programming language. They can also be viewed as the grammatical rules defining the structure of a programming language.

&nbsp;

```cpp
#include <iostream>
using namespace std;

int main() {
cout << "Hello World!";
return 0;
}

```

&nbsp;

&nbsp;

# Header

C++ code begins with the inclusion of header files. There are many header files available in the C++ programming language.

&nbsp;

Header files allow us to put declarations in one location and then import them wherever we need them. This saves a lot of typing in multi-file programs.

To declare a header file, we use `#include` directive in every `.cpp` file. This `#include` is used to ensure that they are not inserted multiple times into a single .cpp file.

&nbsp;

```cpp
#include <iostream>
using namespace std;
```

`iostream` stands for **Input/Output stream**, meaning this header file is necessary to take input through the user or print output to the screen.

This header file contains the definitions for the functions:

- `cin`: used to take input
- `cout`: used to print output

&nbsp;

&nbsp;

# namespace

A namespace in C++ is used to provide a scope or a region where we define identifiers. It is used to avoid name conflicts between two identifiers as only unique names can be used as identifiers.

`namespace` defines which input/output form is to be used. You will understand these better as you progress in the course.

&nbsp;

# Note:

`semicolon (;)` is used for terminating a C++ statement. i.e., different statements in a C++ program are separated by a semicolon.

&nbsp;

&nbsp;

# #include

This is a preprocessor directive. The `#include` directive tells the compiler to include the content of a file in the source code.

For example, `#include<iostream>` tells the compiler to include the standard iostream file which contains declarations of all the standard input/output library functions.

&nbsp;

&nbsp;

# main() function

```cpp
int main() {
     Statement 1;
     Statement 2;
      ...
}
```

&nbsp;

- **_int:_**
  This is the return type of the function. You will get this thing clear once you reach the Functions topic.

- **_main():_** This is the portion of any C++ code inside which all the commands are written and executed.

  - This is the line at which the program will begin executing. This statement is similar to the start block of flowcharts.

  - As you will move further in the course, you will get a clear glimpse of this function. Till then, just note that you will have to write all the programs inside this block.

- **_{}:_** all the code written inside the curly braces is said to be in one block, also known as a particular function scope. Again, these things will be clear when you will study functions.

&nbsp;

&nbsp;

# return 0

This statement is used to return a value from a function and indicates the finishing of a function. This statement is basically used in functions to return the results of the operations performed by a function.

&nbsp;

&nbsp;

# Important Points

- Always include the necessary header files for the smooth execution of functions. For example, `<iostream>` must be included to use `std::cin` and `std::cout`.

- The execution of code begins from the `main()` function.

- It is a good practice to use Indentation and comments in programs for easy understanding.

- cout is used to print statements and cin is used to take inputs.

&nbsp;
