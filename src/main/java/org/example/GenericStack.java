package org.example;

public class GenericStack<T> implements IStack<T> {
    //LIFO
    private IList<T> arrayStack = new GenericArrayList<>();

    @Override
    public void push(T element) {
        arrayStack.add(element);
    }

    @Override
    public T pop() {

        return arrayStack.remove(arrayStack.size() - 1);
    }

    @Override
    public T peek() {
        return arrayStack.get(0);
    }

    @Override
    public boolean empty() {
        return (arrayStack.size() == 0);
    }
}