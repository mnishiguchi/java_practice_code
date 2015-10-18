# Timer

## Loop with a timer

```java
// Obtain a start time
long start = System.currentTimeMillis();

// Set an end time
long end = start + 10 * 1000; // 10 seconds * 1000 ms/sec

// Loop with a timer
for(;;) {
    if (System.currentTimeMillis() > end) {
        System.out.println("   Time to go, i'm tired...");
        break;
    }

    // Do something
}
```
