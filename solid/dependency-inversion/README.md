# Dependency Inversion Principle

> Depend in the direction of abstraction. High level modules should not
depend upon low level details.

If we have IO devices for example (android and IOS systems) and both of
this systems should be open and closed a file. When we need a write in
file (high level detail) the class should be call open and close don't
know about details for `open` and `closed` methods inside the systems,
it only knows both have two methods (`open` and `closed`). This allow we
added more systems (for example, windows) without break or need to
compile all types of system.
