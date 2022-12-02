package org.example;

public class GenericQueue<T> implements IQueue<T> {
    //FIFO
    private IList<T> arrayQueue = new GenericArrayList<>();

    @Override
    public void enqueue(T element) {
        arrayQueue.add(element);
    }

    @Override
    public T dequeue() {
        return arrayQueue.remove(0);
    }

    @Override
    public T first() {
        return arrayQueue.get(0);
    }

    @Override
    public boolean empty() {
        return (arrayQueue.size() == 0);
    }
}