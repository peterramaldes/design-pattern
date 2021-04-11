# Singleton

Singleton is a `creational design pattern` that lets us ensure that a
class has only one instance, while providing a global access point to
this instance.

## Doubts

* Every Bean in Java projects is a Singleton? Because we don't need to
  instance anyone
* **Cons**: The Singleton pattern can mask bad design, for instance, when the
  components of the program know too much about each other
* **Cons:** Explore more about that: "The pattern requires special
  treatment in a multi threaded environment
  so that multiple threads won't create a singleton object several
  times"

## Also Know As

I think that all people call Singleton.

## Motivation

The Singleton Pattern solves two problems at the same time, violating
the Single Responsibility Principle:

**Nowadays, the Singleton pattern has become so popular that people may
call something a singleton even if it solves just one of the listed
problems.**

### 1. Ensure that a class has just a single instance

Why would anyone want to control how many instances a class has? The
most common reason for this is to control access to some shared
resource, for example, a database or a file.

Imagine that we created an object, but after a while decided to create a
new one. Instead of receiving a fresh object, we get the one you already
created.

Note that this behavior is impossible to implement with a regular
constructor since a constructor call must always return a new object by
design.

### 2. Provide a global access point to that instance

Remember those global variable that we used to store some essential
objects? While they're very handy, they're also very unsafe since any
code can potentially overwrite that contents of those variables and
crash the app.

Just like a global variable, the Singleton pattern lets you access some
object from anywhere in the program. However, it also protects that
instance from being overwritten by other code.

There's another side to this problem: we don't want the code solves
problem #1 to be scattered all over us program. It's much better to have
it within one class, especially if the rest of us code already depends
on it.

## Solution

All implementations of the Singleton have these two steps in common:

* Make the default constructor private, to prevent other objects from
  using the `new` operator with the Singleton class.
* Create a static creation method that acts as a constructor. Under the
  hood, this method calls the private constructor to create an object
  and saves it in a static field. All following calls to this method
  return the cached object.

If the code has access to the Singleton class, then it's able to call
the Singleton's static method. So whenever that method is called, the
same object is always returned.

## Applicability

**Use the Singleton pattern when a class in us program should have just
a single instance available to all clients; for example, a single
database object shared by different parts of the program**

The singleton pattern disables all other means of creating objects for a
class except for the special creation method. This method either creates
a new object or returns an existing one if it has already been created.

**Use the Singleton pattern when we need stricter control over global
variables**

Unlike global variables, the Singleton pattern guarantees that there's
just one instance of a class. Nothing, except for the Singleton class
itself, can replace the cached instance.

```
Note that we can always adjust this limitation and allow creating any
number of Singleton instances. The only piece of code that needs
changing is the body of the `getInstance` method.
```

## Structure

![Structure](./imgs/structure.png "Structure")

The `Singleton` class declares the static method `getInstance` that
returns the same instance of its own class.

The Singleton's constructor should be hidden from the client code.
Calling the `getInstance` method should be the only way of getting the
`Singleton` object.

## Pros and Cons

### Pros

* We can be sure that a class has only a single instance
* We gain a global access point to that instance
* The singleton object is initialized only when it's requested for the
  first time

### Cons

* Violates the *Single Responsibility Principle*. The pattern solves
  two problems at the time
* The Singleton pattern can mask bad design, for instance, when the
  components of the program know too much about each other
* The pattern requires special treatment in a multi threaded environment
  so that multiple threads won't create a singleton object several
  times.
* It may be difficult to unit test the client code of the Singleton
  because many test frameworks rely on inheritance when producing mock
  objects. Since the constructor of the singleton class is private and
  overriding static methods is impossible in most languages, we will
  need to think of a creative way to mock the singleton. Or just don't
  write the tests. Or don't use the Singleton pattern.
