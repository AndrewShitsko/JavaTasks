import java.util.LinkedList;

public class Queue {
    private LinkedList<Integer> list = new LinkedList();

    public void enqueue(int value) {
        list.addLast(value);
    }

    public int dequeue() {
        return list.poll();
    }

    public boolean hasItems() {
        return !list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void addItems(Queue queue) {
        while (queue.hasItems()) {
            list.addLast(queue.dequeue());
        }
    }
}
