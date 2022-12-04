package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class GenericQueueTest {
    GenericQueue<String> queueTest = new GenericQueue<>();
    @Test
    void enqueue() {
        queueTest.enqueue("UNO");
        queueTest.enqueue( "DUE" );
        assertEquals(queueTest.first(),"UNO");
    }


}