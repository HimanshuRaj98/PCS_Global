    Java OOPs Concept: 
        Java is an object-oriented programming(00P) language, which means it follows the principles of object-oriented programming.
        Object-oriented programming is a programming paradign that revolves around the concept of "object"- self- contained units that encaptulate data and behavior, These objects interact with each other to accomplish tasks and represent real-world entities in a program.

    There are some key concept:
        1> Classes and Objects
        2> Encaptulation
        3> Abstruction
        4> Inheritance
        5> Polymorphism

    Java classes/Objects: Everything in java is associated with classes and objects, along with its attributes and methods.
    
    classes:- 
        1 > A class is a user-defined data type that serves as a blueprint for creating objects.
        2 > A class is defined using the class keyword, followed by the class name and the class body within a curly braces.
        3 > The data members represent the state or characteristics of the object, and the methods define their behavior or action.
        
    Objects:- 
        1> Am objects is en instance if class. It represents a specific entity that can be created based on the classes blueprint.
        2> Objects have states (value of data members) and behaviour (methods defined in the class).
        3> Te create a object we use the пом keyword followed by the class name and parentheses(constructor)
        
    Java method: methods are decleared within a class but outside the main method, and that they are used to perform certain action.
    
    Declaration of method: A method must be declared within a class. It is defined with the name of the method, followed by parentheses ().
    
    Constructor: In Java, a constructor is a special method used to initialize the state (data members) of an object when it is created. It is called
    automatically when we create a new instance of a class using the new keyword. The primary purpose of a constructor is to ensure that the newly
    created object is in a valid and consistent state.
    
    Java Modifiers: In java, modifiers are keywords that are used to specify the scope, access, and behavior of class, variable, methods and other
    elements in a java program. Java provides several types of modifiers that we can use to control the visibility and behaviour of various elements.
    We divide modifiers into two groups:
        1> Access Modifiers: Controls the access level.
        2> Non-Access Modifiers: Do not control access level, but provides other functionality.
    Access Modifiers -> `public":
    "public":
    public:
        
    Access Modifiers ->     public      The element is accessible from any other class or package.
                            protected   The element is accessible within the same package or subclasses in other package.
                            default     The element is accessible only within the same package.
                            private     The code is only accessible within the decleared class.
    Non-Access Modifiers -> static      Indicates that a variable or method belongs to the class, not to instance of the class.
                            final       Indicates that a variable's value cannot be changed or a method cannot be overridden.
                            abstruct    Can only be used in an abstruct class, and can olny be used on methods. the method does not have a body. The body is provided by the subclass.
    Packages: A package in Java is used to group related classes. We use packages to avoid name conflicts, and to write a better maintainable code.
                        
        Packages are devided into two catagories:

            1> Built-in Package (Package fron the java API)
            2> User-defined Package (Created by the user)
            To use a class or package from library, we need to use the import keyword.
            Syntax: import packagename.class; // Import a single class
            import packagename.*; // Import the whole package.
            
    Encapsulation: The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
        To achive this, we must 
                1> Declear class variables/attributes as private.
                2> provide public get and set methods to access and update the value of a private variable.

    Get and Set Method:
        The get method returns the variable value, and the set method sets the value.
        Why Encapsulation?
            > Better control of class attributes and method.
            > Class attributes can be made read-only(if we only use the get method), or write-only(we use the set method).
            > Flexible: The programmer can clange one part on code without affecting other parts.
            > Increase the security of data.
        Java Inheritance: 
        
        In java, Inheritance is a mechanish in java that allows a class (sub-class or derived class) to inherit the properties and
        behaviours of another class (super-class or base class). the sub-class can extend the super-class, meaning it can reuse and extend the
        functionalities defined in the super-class.
        To inharit from a class, we use the extends keywords.

        Syntax: class SuperClass{
                    //
                }
                class SubClass extends SuperClass{
                    //
                }

        Example : public class Vehicle {

                    String brand = "Ford";
                    public void honk() {
                        System.out.println("Honk! Honk!");
                    }
                }
                public class Car extends Vehicle{
                    String modelName = "Mustang"; // Car attribute
                    public static void main(String [] args) {
                        Car y = new Car();
                        y.honk();
                        System.out.println(y.brand + + y.modelName);
                    }
                }

        Java Polymorphism: 
        Polymorphish means "many forms". It is another fundamental concept in the java that allows objects of different classes to be
        treated as objects of a common super-class.

        Inheritance let us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to
        perform a single action in different ways.

        Java Inner Class: 
        In java, an inner class (also known as a nested class) is a class defined inside another class. Inner classes have access to the
        members of the outter class and can be used to encapsulate related functionality within the outer class.
        
        Java Abstruction: 
        Data abstruction is the process of hiding certain details and showing only essential information to the user. Abstruction can be
        achieve with either abstruct classes or interface.
        
        The abstruct keyword is a non-access modifiers, used for classes and methods.
            > Abstruct class: It is restricted class that cannot be used to create object.
            > Abstruct method: can only be used in an abstruct class, and it does nont have any body. The body is provided by the sub-class.
        
        Java Interface: 
        In java, an interface is a programming construct that defines a contract for classes to follow. It serves as a blueprint for a class, specifying a set of method that must be implemented by any class that claims to implement the interface.

        Enums (Enumeration): A enum is a special class that represents a group of constants (unchangeable variable, like final variables).
        Java User Input: In java, we can read user input from console using java.util.Scanner class. The Scanner class is more user friendly and is commonly
        used for reading user input.

        Input Types: Method Description
            >nextBoolean()  Reads the boolean value from the user
            >nextByte()     Reads the byte value from the user
            >nextDouble()   Reads the double value from the user
            >nextFloat()    Reads the float value from the user
            >nextInt ()     Reads the integer value from the user
            >nextLine()     Reads the String value from the user
            >nextLong()     Reads the long value from the user
            >nextShort ()   Reads the short value from the user

        Java Date and Time: In java, the handling of dates and times is done through the java.time package. The package includes many date and time classes
        like: LocalDate`, `LocalTime`, `Duration`,`Period', etc.
        Java Wrapper Classes: Wrapper classes provide a way to use primitive data types (int, boolean, etc) as object.
            -> Privitive data type and the equavalent wrapper class:
            -> Primitive dataType Wrapper Class
            -> byte     > Byte
            -> short    > Short
            -> int      > Integer
            -> long     > Long
            -> float    > Float
            -> double   > Double
            -> boolean  > Boolean
            -> char     > Character


