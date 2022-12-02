package org.example;
import java.lang.Iterable;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GenericArrayList<String> list = new GenericArrayList<>();
        list.add("Marius");
        list.add("Java");

       list.add(0,"Nistor");
              System.out.println(list);
        GenericLinkedList<String> linked = new GenericLinkedList<>();
        linked.add("ONE");
        linked.add("TWO");
        linked.add(1,"ONE1");
        linked.add(2,"TWO");
       linked.add(3,"THREE");
        linked.addToStart("START");
        String str1 = linked.set(1,"UNO");
        linked.printlist();
        System.out.println(linked.size());

        String removeLinked = linked.remove(1);
        //linked.remove( 1 );
        System.out.println("Removed Element: " + removeLinked);



    }
}