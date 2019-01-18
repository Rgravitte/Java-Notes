# Java-Notes
<!-- Java notes

Every line of code that runs in Java must be inside a class.
The name of the java file must match the class name.
The main() method is required and you will see it in every Java program: public static void main(String[] args)

In Java, there are different types of variables, for example:

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false
To create a variable, you must specify the type and assign it a value: type variable = value;

To declare more than one variable of the same type, use a comma-separated list:
int x = 5, y = 6, z = 50;
System.out.println(x + y + z);

All Java variables must be identified with unique names.
Names can contain letters, digits, underscores, and dollar signs
Names should begin with a letter
Names can also begin with $ and _ (but we will not use it in this tutorial)
Names are case sensitive ("myVar" and "myvar" are different variables)
Names should start with a lowercase letter and it cannot contain whitespace
Reserved words (like Java keywords, such as int or String) cannot be used as names

Data types are divided into two groups:

Primitive data types - includes byte, short, int, long, float, double, boolean and char
Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)

Primitive Data Types

A primitive data type specifies the size and type of variable values, and it has no additional methods.

There are eight primitive data types in Java:

The byte data type can store whole numbers from -128 and 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:

You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
The float data type can store fractional numbers from 3.4e−038 to 3.4e+038. Note that you should end the value with an "f”: float myNum = 5.75f;

The char data type is used to store a single character. A char value must be surrounded by single quotes, like 'A' or 'c’: char myGrade = 'B';
System.out.println(myGrade);
Non-Primitive Data Types
Non-primitive data types are called reference types because they refer to objects.

Operators are used to perform operations on variables and values.

The value is called an operand, while the operation (to be performed between the two operands) is defined by an operator



Java divides the operators into the following groups:

Arithmetic operators
Assignment operators
Comparison operators
Logical operators
Bitwise operators

The Math.max(x,y) method can be used to find the highest value of x and y:
The Math.min(x,y) method can be used to find the lowest value of of x and y:
The Math.sqrt(x) method returns the square root of x:
The Math.abs(x) method returns the absolute (positive) value of x:
Math.random() returns a random number between 0 (inclusive), and 1 (exclusive):


Boolean example
int x = 10;
int y = 9;
System.out.println(x > y); // returns true, because 10 is higher than 9

Java has the following conditional statements:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed

Ternary operator: 
variable = (condition) ? expressionTrue : expressionFalse;

Switch statement:
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}

The break statement can also be used to jump out of a loop.
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
} 

The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
} 

Array examples:
String[] cars = {"Volvo", "BMW", "Ford", "Mazda”};
System.out.println(cars[0]);

To change the value of a specific element, refer to the index number:

cars[0] = "Opel”;
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
// Now outputs Opel instead of Volvo

Looping through an array
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (int i = 0; i < cars.length; i++) {
  System.out.println(cars[i]);
}

Multi-dimensional array
int[ ][ ] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
int x = myNumbers[1][2];
System.out.println(x); // Outputs 7

Looping through multi-dimensional array
public class MyClass {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}

When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error).
The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

Try and Catch example:
public class MyClass {
  public static void main(String[ ] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}



The throw statement allows you to create a custom error.
The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.

Example of throw:
public class MyClass {
  static void checkAge(int age) { 
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
    }
    else {
      System.out.println("Access granted - You are old enough!"); 
    }
  } 

  public static void main(String[] args) { 
    checkAge(15); // Set age to 15 (which is below 18...)
  } 
}

Objects and Classes
To create a class, use the keyword class and an uppercase letter
public class MyClass {
  int x = 5;
}
To create an object of MyClass, specify the class name, followed by the object name, and use the keyword new:
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
  }
}

Multiple Classes
You can also create an object of a class and access it in another class. This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).

You can modify attribute values or override existing ones
If you don't want the ability to override existing values, declare the attribute as final:
The final keyword is useful when you want a variable to always store the same value.

If you create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other:
Example: 
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj1 = new MyClass();  // Object 1
    MyClass myObj2 = new MyClass();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}
You will often see Java programs that have either static or public attributes and methods.

In the example above, we created a static method, which means that it can be accessed without creating an object of the class, unlike public -->

