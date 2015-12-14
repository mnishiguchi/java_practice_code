# arrays
- https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
- For a parameter of an array type, the value of the parameter contains a reference to an array; this reference is passed to the method. Any changes to the array that occur inside the method body will affect the original array that was passed as the argument. 

## indexed variable
- TODO

==

## Re-assigning a different array to an array variable

```java
// The code can compile and run fine. The second line assigns a new array to list.
int[] list = new int[5];
list       = new int[6];
```

==

## Declaring arrays
- http://stackoverflow.com/questions/1200621/declare-array-in-java

### One-dimensional
**For primitive types**
```java
int[] myIntArray = new int[3];
int[] myIntArray = {1,2,3};
int[] myIntArray = new int[] {1,2,3};
```

**For classes**
```java
String[] myStringArray = new String[3];
String[] myStringArray = { "a","b","c" };
String[] myStringArray = new String[] { "a","b","c" };
```

### Two-dimensional
- http://stackoverflow.com/questions/12231453/syntax-for-creating-a-two-dimensional-array
- http://www.willamette.edu/~gorr/classes/cs231/lectures/chapter9/arrays2d.htm

```java
// Note: when we initially declare a 2D array:

// Must always specify the first dimension
nums = new int[][];   // ILLEGAL - NEEDS 1ST DIMENSION

// Need NOT specify the second dimension
nums = new int[5][];  // OK
nums = new int[5][4]; // OK

// Bad example.
nums = new int[][]; // NG - Requires the first index to be specified.
```

**Ragged Arrays**
- Each row in a two-dimensional array is itself an array. Thus, the rows can have different lengths.

```java
int[][] triangleArray = {
    { 1, 2, 3, 4, 5 },
    { 2, 3, 4, 5 },
    { 3, 4, 5 },
    { 4, 5 },
    { 5 }
};
```

```java
int[][] triangleArray = new int[5][];

triangleArray[0] = new int[5];
triangleArray[1] = new int[4];
triangleArray[2] = new int[3];
triangleArray[3] = new int[2];
triangleArray[4] = new int[1];
```

==

## Copying arrays
- The individual elements of the array must be copied into the other array.

```java
// Bad example.
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
- http://docs.oracle.com/javase/7/docs/api/java/lang/System.html#arraycopy(java.lang.Object,%20int,%20java.lang.Object,%20int,%20int)

```java
System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
```


### By the clone method to copy arrays
- TODO


==

## Passing Arrays to Methods

```java
// Invoke the method with an array variable.
int[] list = { 3, 1, 2, 6, 4, 2 };
printArray( list );
```

```java
// Invoke the method with an anonymous array
printArray( new int[] { 3, 1, 2, 6, 4, 2 } );
```

==

## The str.lengh() method
- A String’s length is a method.
- NOTE: An array’s length is a field.

```java 
for (int i = 0; i < names.length; i++) {     // arr.length   - field
    System.out.println( names[i].length() ); // str.length() - method
}

```
