# Memory management

## Memory regions
- In Java, the code and static memory regions are integrated into a region of memory called **the method area** , which also stores **information for every class type used** in the program.

### Code memory
- The region where the program instructions are stored.

### Static memory
- The region where **static fields and local variables** (variables defined inside methods starting with the keyword "static") are allocated.
- Allocated once and last for the duration of a program's execution, their **addresses staying the same**. (static means not changing)

### The stack
- The region where a method's local variables are **allocated during a method call**.
- A method call adds local variables to the stack, and **a return removes them**
- Also called **automatic memory** because this memory is automatically allocated and deallocated.

### The heap
- The region where the **"new" operator** allocates memory for objects.
- Also called **free store**.
- Because the amount of memory available to a program is finite, objects allocated to the heap must eventually be deallocated when no longer needed by the program.

==

## Garbage collection
- At various intervals, finds all unreachable allocated memory locations, and automatically frees such memory locations in order to enable memory reuse. 
- The JVM marks unreachable objects, and deallocation occurs the next time the Java virtual machine invokes the garbage collector. 
- Can present the programmer with the illusion of a nearly unlimited memory supply at the expense of runtime overhead.

### Object reference count
- The JVM keeps a count of all reference variables that are currently referring to an object.
- Used to determine which allocated objects the program is currently using at runtime
- If the reference count is zero, then the object is considered an unreachable object and is eligible for garbage collection, as no variables in the program refer to the object.

### Unreachable object
- Object that is not referenced by any valid reference variables in the program.

### Varible scope
- The JVM can automatically infer a null reference once the variable goes out of scope (i.e., the reference variable is no longer visible to the program).
    + For example, local reference variables that are defined within a method go out of scope as soon as the method returns.
