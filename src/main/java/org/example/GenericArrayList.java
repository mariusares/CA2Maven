package org.example;

import java.util.Iterator;

public class GenericArrayList<T> implements IList<T> {
    private T[] buffer;
    private int nextFreeLoc;
    private int currentCapacity;
    private static final int INITIAL_CAPACITY = 3;

    public GenericArrayList(){
        currentCapacity = INITIAL_CAPACITY;
        nextFreeLoc = 0;
        buffer = (T[]) new Object[currentCapacity];
    }
@Override
    public void add(T elem)
    {
          buffer[nextFreeLoc++] = elem;
    }
    @Override
    public void add(int index, T element)
    {
        if (index <= nextFreeLoc)
        {
                for (int i = nextFreeLoc; i > index; i--) {
                buffer[i] = buffer[i - 1];
            }
            buffer[index] = element;
            nextFreeLoc++;
        }
    }
    @Override
    public T set(int index, T element) {
        buffer[index] = element;
        return element;
    }


    @Override
    public T get(int index)
    {
        if(index >= nextFreeLoc)
        {
            return null;
        }
        return buffer[index];
    }
    @Override
    public int size(){

        return buffer.length;
    }

    @Override
    public T remove(int index) {
        if (index <= nextFreeLoc) {
            for (int i = index; i < nextFreeLoc; i++) {
                buffer[i] = buffer[i + 1];
             }
            nextFreeLoc--;
        }
        T nextLocation = buffer[nextFreeLoc];
        return nextLocation;

    }

    @Override
    public boolean remove(T elem) {
        boolean matchFound = false;
        for (int index = 0; index < nextFreeLoc && !matchFound; index++) {
            if (buffer[index].equals( elem )) {
                matchFound = true;

                for (int i = index; i < nextFreeLoc; i++) {
                    buffer[i] = buffer[i + 1];
                }
                nextFreeLoc--;
                buffer[index] = elem;
            }
        }
        return matchFound;
    }

    @Override
    public boolean isEmpty()
    {

        return (nextFreeLoc < 1);
    }

    @Override
    public boolean contains(T elem)
    {
        boolean matchFound = false;
        for (int index = 0; index < nextFreeLoc && !matchFound; index++){
            if(buffer[index].equals(elem)){
                matchFound = true;
            }
        }
        return matchFound;
    }
         @Override
    public Iterator<T> iterator() {
        return null;
    }




    @Override
    public String toString()
    {
        String data = "";
        for(int i = 0; i < nextFreeLoc; i++)
        {
            data += " " +buffer[i] + ",";
        }

        return "MyStringArrayList[" + data + " ]";
    }
}
