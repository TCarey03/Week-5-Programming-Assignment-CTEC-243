Phase 1

Why is it critical that we override equals in the Artifact class?

It is important to override equals because the museum needs to find artifacts based on their ID rather than whether two variables reference the exact same object. The default equals behavior from Object uses reference equality, which would mean two separate Artifact objects with the same ID would not be considered equal.

For example, a search key such as new Artifact("B205", "", "") should be able to find an existing artifact with ID "B205" even though it is a different object. By overriding equals to compare the IDs, the collection can perform content-based searches.

## How does swap-with-last improve removal performance?

Because the collection is unordered, the elements do not need to remain in their original order after a removal. Instead of shifting every element after the removed item one position to the left, the last element can simply replace the removed element.

This avoids potentially shifting many elements and makes the removal operation more efficient in practice. The trade-off is that the collection's ordering is not preserved, but ordering is not required for this phase.
