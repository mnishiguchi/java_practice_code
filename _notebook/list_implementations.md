# List implementations
 - http://docs.oracle.com/javase/tutorial/collections/implementations/list.html

## ArrayList

- stores a list of items in contiguous memory locations
- Advantages:
    + Supports quick access to i'th element via the set() and get() methods
- Disadvantage:
    + may be slow for inserts or removes on large ArrayLists due to necessary shifting of elements.

### ArrayList add/remove performance problem
- inserting an item at locations other than the end of the ArrayList requires making room by shifting higher-indexed items
- removing (via the remove(i) method) an item requires shifting higher-indexed items to fill the gap
- The shifting of elements done by add() and remove() requires several processor instructions per element. Doing many insertions/removes on large ArrayLists can take a significantly long time.
- Note: The appends are fast because they do not involve any shifting of elements

== 

## LinkedList
- Stores each item anywhere in memory, with each item referring to the next item in the list
- Advantages:
    + Supports fast inserts or removes
- Disadvantages:
    + access to i'th element may be slow as the list must be traversed from the first item to the i'th item.
    + uses more memory due to storing a link for each item.
