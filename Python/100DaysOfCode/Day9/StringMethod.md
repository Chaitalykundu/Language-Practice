## upper()

- The upper() method converts a string to upper case.

* Syntax:

  > print(var_name.upper())

&nbsp;

## isupper()

- The isupper() method returns True if all the characters in the string are upper case, else it returns False.

- Syntax:

  > print(var_name.isupper())

&nbsp;

## lower()

- The lower() method converts a string to lower case.

* Syntax

  > print(var_name.lower())

&nbsp;

## islower()

- The islower() method returns True if all the characters in the string are lower case, else it returns False.

* Syntax :

  > print(var_name.islower())

&nbsp;

## strip()

- The strip() method removes any white spaces before and after the string.

* Syntax

  > print(var_name.strip())

&nbsp;

## rstrip()

- the rstrip() removes any trailing/ending characters.

* Syntax

  > print(var_name.rstrip())

&nbsp;

## replace()

- The replace() method replaces all occurences of a string with another string

* Syntax

> print(var_name.replace("word_have_to_replace", "replace_with"))

&nbsp;

## split()

- The split() method splits the given string at the specified instance and returns the separated strings as list items.

* Syntax

  > print(var_name.split(" "))

&nbsp;

## capitalize()

- The capitalize() method turns only the first character of the string to uppercase and the rest other characters of the string are turned to lowercase.

* The string has no effect if the first character is already uppercase.

* Syntax
  > print(var_name.capitalize())

&nbsp;

## center()

- The center() method aligns the string to the center as per the parameters given by the user.

* Syntax

  > print(var_name.center(no of spaces))

* Example
  > str1 = "Welcome to the Console!!!"
  > print(str1.center(50, ".")) <br>
  > O/P: ............Welcome to the Console!!!.............

&nbsp;

## count()

- The count() method returns the number of times the given value has occurred within the given string.

- Syntax

  > print(var_name.count("word/alphabet have to be counted"))

&nbsp;

## endswith()

- The endswith() method checks if the string ends with a given value.

* If yes then return True, else return False.

* We can even also check for a value in-between the string by providing start and end index positions

&nbsp;

## startswith()

- The endswith() method checks if the string starts with a given value.

* If yes then return True, else return False.

&nbsp;

## find()

- The find() method searches for the first occurrence of the given value and returns the index where it is present.

* If given value is absent from the string then return -1.

* Syntax :
  > print(var_name.find("word/alphabet have to fine"))

&nbsp;

## index()

- The index() method searches for the first occurrence of the given value and returns the index where it is present.

- If given value is absent from the string then raise an exception.

* Syntax :

  > print(var_name.index("value which have to check"))

&nbsp;

## isalnum()

- The isalnum() method returns True only if the entire string only consists of A-Z, a-z, 0-9.

- If any other characters or punctuations are present, then it returns False.

* Syntax :
  > print(var_name.isalnum())

&nbsp;

## isalpha()

- The isalnum() method returns True only if the entire string only consists of A-Z, a-z.

* If any other characters or punctuations or numbers(0-9) are present, then it returns False.

* Syntax :
  > print(var_name.isalpha())

&nbsp;

## isprintable()

- The isprintable() method returns True if all the values within the given string are printable, if not, then return False.

* Syntax :

  > print(var_name.isprintable())

&nbsp;

## isspace()

- The isspace() method returns True only and only if the string contains white spaces, else returns False.

- Syntax :

  > print(var_name.isspace())

&nbsp;

## title() :

- The title() method capitalizes each letter of the word within the string.

- Syntax :

  > print(var_name.title())

&nbsp;

## istitle()

- The istitle() returns True only if the first letter of each word of the string is capitalized, else it returns False.

- Syntax :

  > print(var_name.istitle())

&nbsp;

## swapcase()

- The swapcase() method changes the character casing of the string.
- Upper case are converted to lower case and lower case to upper case.

- Syntax :

  > print(var_name.swapcase())

&nbsp;
&nbsp;
