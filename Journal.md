Phase 1

Why is it critical that we override equals in the Artifact class?

It is important to override equals because the museum needs to find artifacts based on their ID rather than whether two variables reference the exact same object. The default equals behavior from Object uses reference equality, which would mean two separate Artifact objects with the same ID would not be considered equal.

For example, a search key such as new Artifact("B205", "", "") should be able to find an existing artifact with ID "B205" even though it is a different object. By overriding equals to compare the IDs, the collection can perform content-based searches.

How does swap-with-last improve removal performance?

Because the collection is unordered, the elements do not need to remain in their original order after a removal. Instead of shifting every element after the removed item one position to the left, the last element can simply replace the removed element.

This avoids potentially shifting many elements and makes the removal operation more efficient in practice. The trade-off is that the collection's ordering is not preserved, but ordering is not required for this phase.

---------------------

Phase 2

LinkedCollection Trade-offs

In the LinkedCollection, inserting a new item at the head is an O(1) operation because the program only needs to create a new node and update the head reference. The collection does not need to shift existing elements or resize an array.

However, linked collections use more memory per item than an array-based collection because every node needs to store both the actual item and a reference to the next node. An ArrayCollection stores its elements in contiguous array positions, while a linked collection stores nodes in separate locations in memory.

Another trade-off is cache locality. Arrays generally have better cache locality because their elements are stored next to each other in memory. Linked-list nodes may be located in different areas of memory, which can make traversing the list less cache-friendly.

The advantage of the linked collection is that it can grow dynamically without needing to allocate a larger array and copy the existing elements.
