# Single Responsibility Principle

> Gather together the things that change for the same reasons. Separe
things that change for different reasons.

* We do not mix business rules with GUI code
* We do not mix SQL queries with communications protocols
* We keep code that is changed for different reasons separate so that
  change to one part to not break other parts
* We make sure that modules that change for different reasons do not
  have dependencies that tangle them

Microservices do not solve this problem. We can create a tangled
microservice, or a tangled set of microservices if we mix code that
changes for different reasons.

* What are the different reasons?
* What are the same reasons?

For example, if we have this class:

```java
public class Employee {
  public Money calculatePay() ...
  public String reportHours() ...
  public void save() ...
}
```

The problem is that the three functions changes for entirely different
reasons. The `calculatePay` function will change whenever the business
rules for calculating pay do. The `reportHours` function will change
whenever someone wants a different format for the report. The `save`
function will change whenever the DBAs change the database schema. These
three reasons to change combine to make `Employee` very volatile. It
will change for any of those reasons.
