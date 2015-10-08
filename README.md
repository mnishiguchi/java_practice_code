# java_practice_code

## Simple timer

```java
// Record a start time
long start = System.currentTimeMillis();

// Set a end time
long end = start + 10 * 1000; // 10 seconds * 1000 ms/sec

int input;
for(;;) {
    // Check time
    if (System.currentTimeMillis() > end) {
        System.out.println("   Time to go, i'm tired...");
        break;
    }
    //...
```




