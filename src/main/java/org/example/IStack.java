package org.example;

public interface IStack <T>{
    public void push(T elem);
    public T pop();
    public T peek();
    public boolean empty();
}