# Abstract Factory

**Abstract Factory** is a `creational design pattern` that lets we
produce families of related objects without specifying their concrete
classes.

## Doubts

## Also Know As

## Problem

Image that we're creating a furniture shop simulator. Our code consists
of classes that represent:

1. A family of related products, say: `Chair` + `Sofa` + `CoffeTable`
1. Several variants of this family. For example, products `Chair` +
   `Sofa` + `CoffeTable` are available in these variants: `Modern`,
   `Victorian`, `ArtDeco`

![Problem](./imgs/problem.png "Problem")

*Product families and their variants.* 

We need a way to create individual furniture objects so that they match
other objects of the same family. Customers get quite mad when they
receive non matching furniture.

Also, we don't want to change existing code when adding new products or
families of products to the program. Furniture vendors update their
catalogs very often, and we wouldn't want to change the core code each
time it happens.

# Solution

## Applicability

We need to use the *Abstract Factory* when our code needs to work with
various families of related products, but we don't want it to depend on
the concrete classes of those products - they might be unknown
beforehand or we simply want to allow for future extensibility.

* We need to consider implementing the Abstract Factory when we have a
  class with a set of [Factory Methods](../factory-method/) that blur
  its primary responsibility
* In a well designed program each class is responsible only for one
  thing. When a class deals with multiple product types, it may be worth
  extracting its factory methods into a standalone factory class or a
  full blown Abstract Factory implementation.

## Structure

![Structure](./imgs/structure.png "Structure")

## Pros and Cons

### Pros

* We can be sure that products we're getting from a factory are
  compatible with each other
* We avoid tight coupling between concrete products and client code
* *Single Responsibility Principle*. We can extract the product creation
  code into one place, making the code easier to support
* *Open/Closed Principle*. We can introduce new variants of products
  without breaking existing client code

### Cons

* The code may become more complicated than it should be, since a lot of
  new interfaces and classes introduced along with the pattern

