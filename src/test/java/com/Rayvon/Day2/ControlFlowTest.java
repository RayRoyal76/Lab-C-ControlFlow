package com.Rayvon.Day2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlFlowTest {

    ControlFlow instance;
    @BeforeEach
    void setUp(){
        instance = new ControlFlow();
    }

    @Test
    void myMethodTest() {
        ControlFlow instance = new ControlFlow();
        String expected = "true";

        //             instance      method
        String actual = instance.myMethod(2);
// "." means its call any properties of control flow
        assertEquals(expected, actual);
    }
    @Test
    void switchMethodTest(){
        ControlFlow instance = new ControlFlow();
        String actual = instance.switchMethod(3);
        assertEquals("that's four", actual);

    }
    @Test
    void forMethodTest(){
        String actual = instance.forMethod();

    }

}