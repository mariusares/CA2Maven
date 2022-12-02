package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class GenericLinkedListTest {
    GenericLinkedList<String> linked = new GenericLinkedList<>();

    @Test
    void addThreStrings_returnThree() {
        linked.add("first");
        linked.add("second");
        linked.add("third");
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

}