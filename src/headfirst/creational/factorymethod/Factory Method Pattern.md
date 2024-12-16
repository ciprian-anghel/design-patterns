# Factory Method pattern
### The `Factory Method` pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to sublcasses.
- Encapsulates the instantiations of concrete types.
- Factory Method lets subclasses decide which class to instantiate.

# The Factory Method vs Abstract Factory
- The Factory Method Pattern provides an interface for creating objects, but allows subclasses to alter the type of objects that will be created. It delegates the instantiation of objects to a method in the subclass.
- The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. It is essentially a factory of factories.