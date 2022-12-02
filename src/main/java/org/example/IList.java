package org.example;

import java.util.Iterator;

public interface IList<T>{
    public void add(T elem);
    public void add (int index, T element);
    public T set(int index, T element);
    public T get(int index);
    public int size();
    public T remove(int index);
    public boolean remove(T elem);
    public boolean isEmpty();
    public boolean contains(T element);
    public Iterator<T> iterator();
}