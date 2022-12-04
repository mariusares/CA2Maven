package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;
import java.util.LinkedList;

class GenericLinkedListTest {

    GenericLinkedList<String> linked = new GenericLinkedList<>();

    @Test
    void addThreStrings_returnThree() {
        linked.add("first");
        linked.add("second");
        linked.add(2,"third");
        assertEquals(linked.size(),3);
    }

    @Test
    void addTwoStrings_returnIndex() {
        linked.add(0,"UNO");
        linked.add(1,"second");

        assertEquals("UNO", linked.get(0) );
        assertEquals("second", linked.get(1) );

    }

    @Test
    void addOneString_removeOneString() {
        linked.add("UNO");
        linked.add("second");
        linked.remove(0);
        assertEquals(1, linked.size());
        assertEquals("UNO", linked.get(0));
    }
    @Test
    void containsAddedElement_expectedTrue() {
        linked.add("test");


      //  assertEquals(true, linked.contains("One"));
        assertEquals(true, linked.contains("test"));
    }



  //  @Test
  //  public void testlistiterator_returnValue() {
      //  linked.add("Top");
    //    linked.add("Mid");
       // linked.iterator(1);
     //   assertEquals(linked.get(2),"aaa");
 //   }

 }