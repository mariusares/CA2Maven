package org.example;

public interface IQueue<T> {
    public void enqueue(T elem);
    public T dequeue();
    public T first();
    public boolean empty();
}