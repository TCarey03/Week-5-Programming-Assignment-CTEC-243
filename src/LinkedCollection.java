public class LinkedCollection<T> implements CollectionInterface<T> {

    private LLNode<T> head;
    private int numElements;

    public LinkedCollection() {
        head = null;
        numElements = 0;
    }

    @Override
    public void add(T element) {
        LLNode<T> newNode = new LLNode<>(element);

        // Insert at the front of the list.
        newNode.setLink(head);
        head = newNode;

        numElements++;
    }

    private LLNode<T> find(T target) {
        LLNode<T> location = head;

        while (location != null) {
            if (location.getInfo().equals(target)) {
                return location;
            }

            location = location.getLink();
        }

        return null;
    }

    @Override
    public T get(T target) {
        LLNode<T> location = find(target);

        if (location != null) {
            return location.getInfo();
        }

        return null;
    }

    @Override
    public boolean contains(T target) {
        return find(target) != null;
    }

    @Override
    public boolean remove(T target) {

        LLNode<T> location = head;
        LLNode<T> previous = null;

        // Search for the target.
        while (location != null &&
                !location.getInfo().equals(target)) {

            previous = location;
            location = location.getLink();
        }

        // Target was not found.
        if (location == null) {
            return false;
        }

        // Removing the first node.
        if (location == head) {
            head = head.getLink();
        }
        // Removing a node somewhere after the head.
        else {
            previous.setLink(location.getLink());
        }

        numElements--;

        return true;
    }

    @Override
    public boolean isFull() {
        return false;
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