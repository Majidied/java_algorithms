# Inheritance in Java

## Overview

Inheritance is a fundamental concept in object-oriented programming (OOP) languages like Java. It allows a class to inherit properties and behaviors (methods) from another class, known as the superclass or base class. The class that inherits from the superclass is called the subclass or derived class. Inheritance promotes code reusability and establishes a hierarchical relationship among classes.

## Syntax

In Java, the `extends` keyword is used to create a subclass that inherits from a superclass. The basic syntax is as follows:

```java
class Superclass {
    // Superclass members
}

class Subclass extends Superclass {
    // Subclass members
}
```

## Example

```java
// Superclass
class Animal {
    String species;
    
    public Animal(String species) {
        this.species = species;
    }
    
    public void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass
class Dog extends Animal {
    String breed;
    
    public Dog(String breed) {
        super("Canine"); // Call superclass constructor
        this.breed = breed;
    }
    
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Labrador");
        myDog.eat(); // Inherited method from Animal class
        myDog.bark(); // Method specific to Dog class
    }
}
```

## Key Points

- **Single Inheritance**: Java supports single inheritance, meaning a subclass can inherit from only one superclass. However, Java allows multilevel inheritance, where a subclass can become a superclass for another subclass.
- **Access Modifiers**: Inherited members can have different access modifiers in the subclass depending on the relationship between the superclass and the subclass. `private` members are not inherited.
- **Constructor Chaining**: Constructors are not inherited, but they can be invoked using `super()` to call the superclass constructor explicitly.
- **Method Overriding**: Subclasses can override methods from the superclass to provide their own implementation. This allows for polymorphic behavior.
- **`super` Keyword**: It is used to access members of the superclass within the subclass.

Inheritance is a powerful mechanism in Java that facilitates code organization, reuse, and polymorphism. However, it should be used judiciously to maintain a clear and understandable class hierarchy.