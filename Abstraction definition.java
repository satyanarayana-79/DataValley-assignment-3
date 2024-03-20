Abstraction:

Abstraction in java is a fundamental concept in object-oriented programming(OOP) that allows you to hide the complex implementation details and show only the essential features of an object.
It helps in managing complexity by focusing on what an object does rather than how it achieves it.In java ,abstraction is achieved using abstract classes and interfaces.

There are two primary ways to implement abstraction in java:
1.Abstract Classes:
        An abstract class is like a blueprint for other classes.It contains abstract methods that must be implemented by its subclasses.It can also have concrete methods with an implementation.You cannot create an instance of an abstract class directly,but you can create objects of its subclasses.

2.Interfaces:
        It is like a contract that defines a set of methods that a class must implement.It contains method signatures but no method bodies.Classes implement interfaces by providing concrete implementations for all the  methods declared in the interface.Unlike abstract classes,a class can implement multiple interfaces.Interfaces are used to achieve abstraction and provide a way to achieve multiple inheritances in java.
