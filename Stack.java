public class Stack {
    private Node top;
    private int count;

    public Stack() {
        top = null;
        count = 0;
    }

    public void push(int value) {
        Node newNode = new Node(value, top);
        top = newNode;
        count++;
    }

    public int peek() {
        if (top == null) {
            throw new IllegalStateException("Стек порожній!");
        }

        return top.data;
    }

    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Стек порожній!");
        }

        int value = top.data;
        top = top.next;
        count--;

        return value;
    }

    public void clear() {
        top = null;
        count = 0;
    }

    public int count() {
        return count;
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = top;

        while (current != null) {
            result.append(current.data).append(" ");
            current = current.next;
        }

        return result.toString();
    }
}
