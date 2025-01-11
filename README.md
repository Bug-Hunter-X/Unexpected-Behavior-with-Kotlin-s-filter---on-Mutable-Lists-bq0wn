# Kotlin filter() Gotcha: Modifying Mutable Collections During Iteration

This repository demonstrates a common error when using the `filter()` function in Kotlin with mutable collections.  Modifying the collection within the lambda passed to `filter()` can lead to unexpected results or `ConcurrentModificationException`s.

The `bug.kt` file shows an example of this problematic code.  The `bugSolution.kt` file presents a corrected approach using an alternative strategy (like creating a new list) to avoid the issue.

## How to reproduce
1. Clone this repository.
2. Run `bug.kt`. Observe that the output may be inconsistent or throw an exception.
3. Run `bugSolution.kt`. Note that this version produces the expected and consistent results.

## Key takeaway
Always avoid modifying a mutable collection while iterating over it using functions like `filter()`, `map()`, or `forEach()`.