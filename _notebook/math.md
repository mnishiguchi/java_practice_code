# Math

- [doc](http://docs.oracle.com/javase/7/docs/api/java/lang/Math.html)

## Floating-point comparison

- should not be compared using `==`
- set a threshould(e.g. 0.0001)
- `Math.abs()` computes floating-point absolute value

```java
// Determine if double variable x is 98.6.
Math.abs(x - 98.6) < 0.0001;
```

```java
// Determine if double variables x and y are equal. Threshold is 0.0001.
// (If difference is less than 0.0001, values are close enough.)
Math.abs(x - y) < 0.0001;
```

==

