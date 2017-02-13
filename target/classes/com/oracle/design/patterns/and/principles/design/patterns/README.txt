the creational pattern is a level of indirection for example the factory pattern
level of indirection is a general term for solving a software design problem by conceptually separating the task into multiple levels

4 creational design patterns
- singleton pattern (single shared instance of an object) > ocp
- immutable object pattern (are read-only, can't be modified and are thread-safe) > ocp
- builder pattern (tightly couple to target class, is in the same package or is shipped as a static inner class)
- factory pattern (supports polymorphism)

1. singleton pattern:
- private constructor
- 1. declare and initialize a public static final variable
- 2. declare a public static final variable and initialize it in a static initializer block
- 3. applying lazy instantiation

- there are times when you only want one instance of a particular type of object in memory
- this way data is centralized
- examples: application configuration data, reusable data caches, coordinate access to shared resources (coordinating write access to a file)

2. immutable pattern:
- use a constructor to set all properties
- all fields should be private final
- no setters
- NEVER SHARE REFERENCES to a mutable field (always make a defensive copy) <==
- prevent methods from being overridden (class final or methods should be final)

READ-ONLY OBJECTS that can be share and used by multiple classes
for security reasons we don't want their value to be modified
the state of an immutable object never changes so they are THREAD-SAFE

3. builder pattern:
- it's anti pattern is a telescoping constructor
- ie the constructor is growing to large
- how do we create an object that requires numerous values to be set at the time the object is instantiated > constructor immutable object
- the builder pattern is often used together with immutable classes

4. factory pattern:
- using a factory class to produce instances of object based on a set of input parameters
- it is focused on supporting class polymorphism
- aka factory method pattern