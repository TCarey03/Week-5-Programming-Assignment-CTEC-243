public class ArrayCollection<T> implements CollectionInterface<T> {

    private T[] elements;
    private int numElements;

    private static final int DEFAULT_CAPACITY = 100;

    @SuppressWarnings("unchecked")
    public ArrayCollection() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        numElements = 0;
    }

    @Override
    public void add(T element) {
        if (isFull()) {
            throw new RuntimeException("Collection is full.");
        }

        elements[numElements] = element;
        numElements++;
    }

    private int find(T target) {
        int location = 0;

        while (location < numElements) {
            if (elements[location].equals(target)) {
                return location;
            }

            location++;
        }

        return -1;
    }

    @Override
    public T get(T target) {
        int location = find(target);

        if (location != -1) {
            return elements[location];
        }

        return null;
    }

    @Override
    public boolean contains(T target) {
        return find(target) != -1;
    }

    @Override
    public boolean remove(T target) {
        int location = find(target);

        if (location == -1) {
            return false;
        }

        // Swap the target with the last element.
        elements[location] = elements[numElements - 1];

        // Clear the old last position.
        elements[numElements - 1] = null;

        numElements--;

        return true;
    }

    @Override
    public boolean isFull() {
        return numElements == elements.length;
    }

    @Override
    public boolean isEmpty() {
        return numElements == 0;
    }

    @Override
    public int size() {
        return numElements;
    }
}