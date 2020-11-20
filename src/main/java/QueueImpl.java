package main.java;

public class QueueImpl<T> {
    private final static int INITIAL_CAPACITY = 0;
    Object[] queueArr = new Object[INITIAL_CAPACITY];
    private int size;

    public QueueImpl() {
        this.size = 0;
    }

    public void enqueue(T data) {
        if (size == queueArr.length) {
            Object[] newArray = new Object[(queueArr.length * 2) + 1];
            for (int i = 0; i < queueArr.length; i++) {
                newArray[i] = queueArr[i];
            }
            queueArr = newArray;
            System.out.println("Increased capacity of the Queue!");
        }
        queueArr[size] = data;
        size++;
        System.out.println(data + " added to the queue");
    }

    public T dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!! Can not dequeue element");
            return null;
        }
        T data = (T) queueArr[0];
        for (int i = 0; i < size - 1; i++) {
            queueArr[i] = queueArr[i + 1];
        }
        size--;
        System.out.println("Element removed from the queue " + data);
        return data;
    }


    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String a[]) {
        QueueImpl queue = new QueueImpl();
        queue.dequeue();
        queue.enqueue(1);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(5);
        queue.dequeue();
        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue();
        queue.enqueue(8);
        queue.enqueue(9);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}

