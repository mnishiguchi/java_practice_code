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

## Generating random numbers 
- There are several ways to generate random numbers. 

### System.currentTimeMillis and modulus operator
```java
// Generate two numbers
int number1 = (int)(System.currentTimeMillis() % 10);
int number2 = (int)(System.currentTimeMillis() / 7 % 10);
```

### java.util.Random
- `Random random = new Random();`
- [doc](http://docs.oracle.com/javase/7/docs/api/java/util/Random.html)

#### nextInt()
- All 232 possible int values are produced with (approximately) equal probability.

#### nextInt(int n)
 - int value between 0 (inclusive) and the specified value (exclusive)

### Math.random
- Returns a random double value between 0.0 and 1.0, excluding 1.0.
- [doc](http://docs.oracle.com/javase/7/docs/api/java/lang/Math.html#random())

```java
// Generating two random single-digit integers (0..9)
int number1 = (int)(Math.random() * 10);
int number2 = (int)(Math.random() * 10);
```

```java
// Generating random integers in a range (min..max)
MIN + (int)(Math.random() * ((MAX - MIN) + 1))
```

### ThreadLocalRandom.current()
- In Java 1.7 or later
- http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java

```java
import java.util.concurrent.ThreadLocalRandom;

// Generating random integers in a range (min..max)
// nextInt is normally exclusive of the top value,
// so add 1 to make it inclusive
ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
```

==

## Generating random strings
```java
// concatnate characters to an empty string.
String aString = "" + (char)(random.nextInt(26) + "A")  + (char)(random.nextInt(26) + "a");
```

