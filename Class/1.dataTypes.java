Java Data Types:
    In java, there are several built-it data types that we can use to declear variables.
    1> Primitive Data Types:

        >byte - Represents a signed 8-bit integer (-128 to 127)
        >short Represents a signed 16-bit integer (-32,768 to 32,767)
        >int Represents a signed 32-bit integer (-2147483648 to 2147483647)
        >long - Represents a signed 64-bit integer (-9223372036854775808 to 9223372036854775807)
        >float Represents a 32-bit floating-point number.
        >double - Represents a 64-bit floating-point number.
        >boolean Represents a boolean value(true or false`)
        >char - Represents a single character (16-bit Unicode value)

    examples: 
        byte myByte = 44;
        short myShort = 1254;
        int myInt - 54646;
        long my Long = 999999999999L; // "L" suffix to indicate it is a Long value
        float myFloat= 35.456f; // "f"suffix to indicate it is a float value
        double myDouble = 358.456878;
        boolean myBoolean = true;
        char myChar = 'B';

    2> Non-primitive data type: Such as string, Array and Classes
        >String - Represents a sequence of characte.
        >Array - Represents a collection of elements of the same datatyple.

var datatype : var myName = "";

Java Type Casting:
    In java, type casting is the process of converting a value of one data type into another data type.
    In java, there are two types of casting:
        1> Implicit casting/ Widening Casting (Automatically): Implicit casting occurs when we convert a smaller data type to a larger data type.
            byte -> short -> char -> int -> long -> float -> double
        2> Explicit Casting/ Narrowing casting (Manually): Explicit casting is required when we convert a larger data type to a smaller data type.
            double -> float -> long -> int -> char -> short -> byte

            
Java Operators:
    In Java, operators are symbols used to perform operations on variable and values. They allow us to manipulate data, perform mathematical calculations, and make logical
    decisions in the program.
    
    1> Arithemetic Operators:
        > '+': Addition.
        > '-': Subtraction.
        > '*': Multiplication.
        > '/': Division.
        > '%': Modulus (remainder after division).

    2> Assignment Operators:
        > '='  : Assigns a value to a veriable.
        > '+=' : Adds a value to the variable and assign the result back to the variable
        > '-=' : Subtract a value from the variable and assigns the result back to the variable
        > '*=' : Multiplies the variable by a value and assigns the result back to the variable.
        > '/=' : Divides the variable by the value and assigns the result back to the variable.
        > '%=' : Computes the modulus of the variable and a value, then assigns the result back to the variable.    

    3> Increment / Decrement Operators:
        > ++: Increment the value of a variable by 1.
        > -- : Decrements the value of the variable by 1.

    4> Comparison (Relational) Operators:
        > == (x==y) : Checks if the two value are equal.
        > != (x!-y) : Checks if two values are not equal.
        > >  (x>y)  : Checks if the value on the left is greater than the value on the right.
        > <  (x<y)  : Checks if the value on the left is lesser than the value on the right.
        > >= (x>=y) : Checks if the value on the left is greater than or equal to the value on the right.
        > <= (x<=y) : Checks if the value on the left is lesser than or equal to the value on the right.

    5> Logical Operators:
        > && Logical AND (Returns true if both conditions are true) Example: x<5 && x<10
        > || Logical OR(Returns true if at least one of the conditions is true) Example: x<5 || x<10
        > !  Logical NOT (Reverse the result, returns false if the reuslt is true) Example: ! (x<5 && x<10)     

    6> Bitwise Operators:
        >  '&' : Bitwise AND
        >  '|' : Bitwise OR
        >  '^' : Bitwise XOR
        >  '~' : Bitwise NOT
        > '<<' : Left Shift (shift the bits to the left)
        > '>>' : Right Shift (shift the bits to the right)
        > '>>>': Unsigned right shift (shift the bits to the right, filling the left side with zeros)

    7> Conditional Operators:
        `condition ? value_if_true value_if_false`: Evaluates a condition and returns one of two values based on wether the condition is true or false.
        
    Java String:
        In java, 'String' class represents al sequence of characters. It is a part of the `java.lang` package and is one of the most commonly used classes in java for working with text and strings.String in java are immutable, meaning their values cannot be changed after they are created.
        