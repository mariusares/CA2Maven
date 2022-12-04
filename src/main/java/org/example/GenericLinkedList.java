package org.example;
import java.util.*;
import java.util.Iterator;


public class GenericLinkedList<T> implements IList<T> {
    class Node{
        T val;
        Node next;
        private T t;
        Node(T val){
            this.val = val;
        }

    }

    Node head;
    Node tail;
    private int nrOfElements = 0;


    public void printlist(){
        Node current = head;
        while (current !=null){
            System.out.println(current.val +" ->");
            current = current.next;
        }

    }

       public void addToStart(T val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        nrOfElements++;
    }

      public void addLast(T val){
        if (isEmpty()){
            head = new Node( val );
            tail = head;

        }
        Node newNode = new Node( val );
        tail.next = newNode;
        tail = newNode;
        nrOfElements++;
    }

    @Override
    public void add(T elem) {
        Node newNode = new Node(elem);
        if (head == null){
            head = newNode;
            tail = newNode;
            nrOfElements++;
        }
        else{
            tail.next = newNode;
            head = newNode;
            nrOfElements++;
        }
    }
    @Override
    public void add(int index, T element) {
        Node newNode = new Node(element);
        if (index < 0 || index > size()) {
           System.out.println( size() );
           throw new IndexOutOfBoundsException( "Index out of bounds" );
        }
        if (index == 0 ){
            addToStart( element );
            return;

        }
        Node current = head;
        int count = 1;
        while (count < index-1){
            count++;
            current = current.next;
           // nrOfElements++;
        }
      //  Node newNode = new Node(element);
        newNode.next = current.next;
        current.next = newNode;
        nrOfElements++;
    }
    @Override
    public int size(){
        return nrOfElements;
    }
    @Override
    public T set(int index, T element) {
        if (index < 0 || index > nrOfElements) {
            throw new IndexOutOfBoundsException( "Index Set Error" );
        }
       Node target = getNode( index );
        T oldData = target.val;
        target.val = element;
        return oldData;
    }

    private Node getNode(int index){
        Node current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        return current;
}
    @Override
    public T get(int index) {
        if (index < 0 || index > nrOfElements ){
           throw new IndexOutOfBoundsException("Linked ist Index not exist") ;
        }
        return getNode(index).val;
          }

    @Override
    public T remove(int index) {
        if(index < 0 || index >= nrOfElements){
            throw new IndexOutOfBoundsException("Item cannot be removed");
        }
        T toReturn = null;
        if(index == 0){
            toReturn = head.val;
            head = head.next;
        }else {
            Node before = getNode( index -1 );
            toReturn = before.next.val;
            before.next = before.next.next;


            //System.out.println( "Remove index " + toReturn );
            return toReturn;
        }

        nrOfElements--;
        return toReturn;
    }

    @Override
    public boolean remove(T elem) {
        Node current = head;
        if (current == elem) {
            head = head.next;
            nrOfElements--;
            return true;
        }
        if (head.next != null) {
            head.next = head.next.next;
            if (head.next == null) {
                tail = current;
                nrOfElements--;
                return true;
            }
            head = current;
        }
        return false;
    }



      @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(T element) {
        Node current = head;
        if (current != null) {
            if (head.val == element)
                return true;
                current = head.next;
                   }
            return false;
    }
    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {

            Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    T newVal = current.val;
                    current = current.next;
                    return newVal;
                }
                return null;
            }
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Remove not implemented.");
            }

        };

    }

     /*
    public Iterator<T> iterator(){
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T>{
        Node curr = head;

        public boolean hasNext(){
            return curr != null;
        }
        public T next(){
            T element = curr.t;
            curr = curr.next;
            return element;
        }
    }

     */
}

