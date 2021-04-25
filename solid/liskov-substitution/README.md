# Liskov Substitution Principle 

> Derived classes must be usable through the base class interface,
> without the need for the user to know the difference.

> A program that uses an interface must not be confused by an
> implementation of that interface

Imagine we have two classes:

* `Square` `Rectangle`

Where `Square` inherit from `Rectangle` and `Reactangle` has two
property:

* Height Width

Therefore, `Square` also has theses two properties. But `Square` don't
have Height and Width, he have Side. In this case, always client class
call `calculate()` the client need to check if is `Square` or
`Rectangle` in Java the keyword used for that is `instanceof`. I.e.
**`Square` is not substitution for `Rectangle`**
