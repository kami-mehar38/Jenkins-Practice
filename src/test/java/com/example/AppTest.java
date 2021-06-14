package com.example;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    final List<String> list = new ArrayList<>();

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertEquals(0, list.size());
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithFalse() {
        assertEquals(10, list.size());
    }
}
