# Comments

Comments are meant to explain the code as well as to make it more readable.

Comments can be used to explain C++ code to make it more readable. It can also be used to prevent execution when testing alternative code.

&nbsp;

&nbsp;

# Why Comments are used in C++?

Comments in C++ are used to summarize an algorithm, identify a variable’s purpose, or clarify a code segment that appears unclear. Comments are also used for:

- Comments are used for easier debugging.

- It makes a program more readable and gives an overall description of the code.
- Comments are helpful in skipping the execution of some parts of the code.
- Every time a program or code is reused after long periods of time, the comment recaps all the information of the code quickly.

&nbsp;

&nbsp;

# Types of comments

There are two ways to add comments.

- Single line comment
- Multi line comment

&nbsp;

## Single line comment

Single-line comments start with two `forward slashes (//)`.

```cpp
// This is a comment
cout << "Hello World!";

cout << "Hello World!"; // This is a comment

```

&nbsp;

&nbsp;

# Multi line comment

Multi-line comments start with `/*` and ends with `*/`.

```cpp
 /*
     Multiline Comment
     .
     .
     .
 */
```

&nbsp;

&nbsp;

# How does the compiler process C++ Comments?

As a part of the compiler, the `Lexical Analyzer` scans the characters and transforms them into tokens with no passing of the commented text to the parser. Since Comments do not contribute to the functionality of the program they are simply omitted at the time of compilation. Accordingly, we can understand that comments are just text in programs that are ignored by the compiler.

&nbsp;
&nbsp;
