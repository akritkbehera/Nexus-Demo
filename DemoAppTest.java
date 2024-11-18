package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoAppTest {
    @Test
    public void testGetMessage() {
        DemoApp app = new DemoApp();
        assertEquals("Hello from Demo App!", app.getMessage());
    }
}
