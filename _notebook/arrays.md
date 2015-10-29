# arrays

## Copying arrays
- The individual elements of the array must be copied into the other array.

```java
list2 = list1  // NG
```

### By a loop to copy individual elements one by one
```java
int[] sourceArray = {2, 3, 1, 5, 10};
int[] targetArray = new int[sourceArray.length];
for (int i = 0; i < sourceArray.length; i++) {
    targetArray[i] = sourceArray[i];
}
```

### By the static arraycopy method in the java.lang.System class
- arraycopy(sourceArray, srcPos, targetArray, tarPos, length);

```java
System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
```

### By the clone method to copy arrays
