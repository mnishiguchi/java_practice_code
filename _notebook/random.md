# Random

## Random numbers 
- There are several ways to generate random numbers.
- http://www.javapractices.com/topic/TopicAction.do?Id=62
- http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java

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

```java
// Generating random integers in a range (min..max)
Random random = new Random();
// Cast to long temporarily if we want to avoid overflow problems
long range = (long)MAX - (long)MIN + 1;
// 0 <= randomOffset < range
long randomOffset = (long)(random.nextDouble() * range);
int randomNumber  = (int)(MIN + randomOffset);    
```

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
int range = (MAX - MIN) + 1;
// 0 <= randomOffset < range
int randomOffset = (int)(Math.random() * range);
int randomNumber = MIN + randomOffset;
```

### ThreadLocalRandom.current()
- In Java 1.7 or later

```java
import java.util.concurrent.ThreadLocalRandom;

ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
```

==

## Random strings
```java
// concatnate characters to an empty string.
String aString = "" + (char)(random.nextInt(26) + "A") + (char)(random.nextInt(26) + "a");
```

