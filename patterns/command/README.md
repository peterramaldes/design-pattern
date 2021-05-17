# Command

**Command** is a behavioral design pattern that turns a request into a
stand-alone object that contains all information about the request. This
transformation lets we pass requests as a method arguments, delay or
queue a request's execution, and support undoable operations.

![Structure](./imgs/structure.png "Structure")

## Applicability

Use the Command pattern when ...

* we want to parametrize objects with
  operations
* we want to queue operations, schedule their execution, or execute them
  remotely
* we want to implement reversible operations

## Pros and Cons

### Pros

* Single Responsibility Principle. We can decouple classes that invoke
  operations from classes that perform these operations
* Open/Closed Principle. We can introduce new commands into the app
  without breaking existing client code
* We can implement undo/redo
* We can implement deferred execution of operations
* We can assemble a set of simple commands into a complex one

### Cons

* The code may become more complicated since we're introducing a whole
  new layer between senders and receivers

