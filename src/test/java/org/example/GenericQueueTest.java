package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class GenericQueueTest {
    GenericQueue<String> queue = new GenericQueue<>();
    @Test
    void enqueue() {
        queue.enqueue("One");


     
    }

    @Test
    void dequeue() {
    }

    @Test
    void first() {
    }

    @Test
    void empty() {
    }
}