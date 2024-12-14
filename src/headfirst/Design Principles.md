## 1. Identify the aspects of your application that changes and separate them from what stays the same.
In other words, take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don't.

## 2. Program to an interface (or any supertype), not an implementation. The point is to make use of polymorphism.

## 3. Favor composition over inheritance.

## 4. Strive for loosely coupled designs between objects that interact.

## 5. Classes should be open for extension, but closed for modifications.

## 6. Dependency Inversion - Depend upon abstraction. Do not depend on concrete classes.
- High-level modules should not depend on low-level modules. Both should depend on abstraction.
```
class PizzaShop
	Pizza pizza 
	
interface Pizza

class NYPizza implements Pizza
class DCPizza implements Pizza
```
- In the example, PizzaShop depends on abstraction, not on concrete pizza classes
- The concrete pizza classes depend on the Pizza abstraction too.
- The "Dependency Inversion" means that the relationship is reversed in terms of control. The high-level does not depend on the concrete low-level, but the low-level concrete depends on abstraction. Both high-level and low-level now depends on the same abstraction.

## 7. Principle of Least Knowledge - talk only to your immediate friends.

