package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenericStackTest {
    GenericStack<String> stack = new GenericStack<>();

    @Test
    void pushOneStringToTheSTack_returnTheStringOnTheStack() {
        stack.push( "first" );
        assertEquals( "first", stack.peek() );
        stack.pop();
    }
}