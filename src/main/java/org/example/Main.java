package org.example;
import java.lang.Iterable;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GenericArrayList<String> list = new GenericArrayList<>();
        list.add( 0, "Marius" );
        list.add( 1, "Java" );
        list.remove( 1 );

        System.out.println( list.get( 0 ) );
        list.add( 0, "Nistor" );
        System.out.println( list.size() );
        System.out.println( list );

        GenericLinkedList<String> linked = new GenericLinkedList<>();

        linked.add( 0, "ZERO" );

        linked.add( 1, "ONE" );
        linked.add( 2, "TWO" );
        linked.printlist();
        System.out.println( linked.size() );

        linked.addToStart( "START" );
        String str1 = linked.set( 1, "UNO" );
        linked.printlist();

        System.out.println( "GET :" + linked.get( 1 ) );

        String removeLinked = linked.remove( 2 );
        //linked.remove( 1 );
        System.out.println( "Removed Element: " + removeLinked );
        System.out.println( linked.size() );

//testing the GenericQueue
        GenericQueue<String> queueTest = new GenericQueue<>();
        queueTest.enqueue( "testQueue1" );
        queueTest.enqueue( "testQueue2" );
        queueTest.enqueue( "testQueue3" );
        queueTest.first();

        System.out.println( queueTest.first() );

//testing the Stack
        GenericStack<String> stackTest = new GenericStack<>();
        stackTest.push( "ZERO" );
        stackTest.push( "UNO" );
        stackTest.pop();
       System.out.println(stackTest.peek());
    }
}
