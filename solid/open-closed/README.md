# The Open-Closed Principle

> A Module should be **open** for extension but **closed** for
modification

If we wave two classes, `Rectangle` and `Square` and theses classes has
a property called `enum ShapeType itsType`, in the main when we need
draw theses objects we test if `itsType` is a Square or Shape, and then
draw right? When we think about that only for one place, is not too
dangerous, because if we need create a new object, for example, `Circle`
we just added one more if statement right? But if we have another
modules uses this logic, i.e. always we need to added new object we add
more if's in all places. This hurts *The Open-Closed Principle* because
it's not open to extended, we always change the functions adding more
if's.

But, if we have one interface called `Shape` and his have one function
called `draw()`, and two classes called `Rectangle` and `Square` that
implements `Shape`. In main class, que just need `s.draw()` right? And
if we need add more objects we just created another classes for example
call `Circle` that implements `Shape` and done.

One another way to think is about compiler, in the first case, if we
create `Circle` we need to compile the main and another modules right?
Because we add more if statements, and the second case not.



