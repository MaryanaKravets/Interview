package main.java;

public class MyStack<T> {

    private Node<T> top;

    public MyStack() {

        top = null;
    }

    private static class Node<T> {
        public T value;
        public Node<T> reference;

        public Node(T value) {
            this.value = value;
            reference = null;
        }

        public T getValue() {
            return value;
        }

        public Node<T> getReference() {
            return reference;
        }

        public void setReference(Node<T> reference) {
            this.reference = reference;
        }
    }

    // adds new element into the stack

    public void push(T e) {
        Node<T> node = new Node<>(e);
        node.setReference(top);
        top = node;
        System.out.println(e.toString() + " added to the stack");
    }


    // removes element from the stack (if stack is empty then method returns null)

    public T pop() {
        if (top==null) {
            System.out.println("Queue is empty!! Can not dequeue element");
            return null;
        }
        T data = top.getValue();
        top = top.getReference();
        System.out.println("element removed from the stack " + data);
        return data;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.pop();
        stack.push(1);
        stack.pop();
        stack.pop();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.push(5);
        stack.pop();
        stack.push(6);
        stack.push(7);
        stack.pop();
        stack.push(8);
        stack.push(9);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}

