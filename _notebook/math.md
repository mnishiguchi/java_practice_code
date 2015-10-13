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

## Getting the separate digits of an int number
- http://stackoverflow.com/questions/3389264/how-to-get-the-separate-digits-of-an-int-number

```java
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        input = sc.nextInt();

        // Split the number into digits
        nums[8] = input / 1 % 10;
        nums[7] = input / 10 % 10;
        nums[6] = input / 100 % 10;
        nums[5] = input / 1000 % 10;
        nums[4] = input / 10000 % 10;
        nums[3] = input / 100000 % 10;
        nums[2] = input / 1000000 % 10;
        nums[1] = input / 10000000 % 10;
        nums[0] = input / 100000000 % 10;
```

```java
    static int[] splitNumber(int number) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        
        // Add the digit to the list
        while (number > 0) {
            stack.push( number % 10 );
            number = number / 10;
        }

        int[] nums = new int[stack.size()];
        
        // Convert the stack to an array
        for (int i = 0; !stack.isEmpty(); i++) {
            nums[i] = (int) stack.pop();
            
            System.out.println(nums[i]);
        }
        
        return nums;
    }
```

==

## The Rounding Methods

ceil(x)
- x is **rounded up** to its nearest integer. This integer is returned as a double value.

floor(x)
- x is **rounded down** to its nearest integer. This integer is returned as a double value.

rint(x)
- x is **rounded up to its nearest integer**.
- Note: If x is equally close to two integers, the even one is returned as a double value.

round(x)
- Returns (int)Math.floor(x + 0.5) if x is a float.
- Returns (long)Math.floor(x + 0.5) if x is a double.

==

## The Trig methods
sin(radians)
- Returns the trigonometric sine of an angle in radians.

cos(radians)
- Returns the trigonometric cosine of an angle in radians.

tan(radians)
- Returns the trigonometric tangent of an angle in radians.

toRadians(degree)
- Returns the angle in radians for the angle in degree.

toDegree(radians)
- Returns the angle in degrees for the angle in radians.

asin(a)
- Returns the arc sine of a value
- Returns the angle in radians for the inverse of sine.

acos(a)
- Returns the arc cosine of a value
- Returns the angle in radians for the inverse of cosine.

atan(a)
- Returns the arc tangent of a value
- Returns the angle in radians for the inverse of tangent.


