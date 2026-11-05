public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(11);
        stack.push(22);
        stack.push(33);

        System.out.println("Stack: " + stack);
        System.out.println("Count: " + stack.count());
        System.out.println("Size: " + stack.size());

        System.out.println("Peek: " + stack.peek());

        System.out.println("Delete: " + stack.pop());

        System.out.println("Stack: " + stack);

        stack.clear();

        System.out.println("Stack after clear: " + stack);
        System.out.println("Count after clear: "
                + stack.count());
    }
}
