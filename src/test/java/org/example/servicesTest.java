package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class servicesTest {

    @Test
    @Tag("A")
    void getNameTestForNegativeNumber() {
        services service = new services();
        String result = service.getName(-1);  // Test with a negative number
        Assertions.assertEquals("a", result);  // Expected "a" for negative input
    }

    @Test
    @Tag("A")
    @Tag("B")
    void getNameTestForZero() {
        services service = new services();
        String result = service.getName(0);  // Test with 0
        Assertions.assertEquals("b", result);  // Expected "b" for zero
    }

    @Test
    @Tag("B")
    void getNameTestForPositiveNumber() {
        services service = new services();
        String result = service.getName(1);  // Test with a positive number
        Assertions.assertEquals("b", result);  // Expected "b" for positive number
    }

    @Test
    @Tag("B")
    void getNameTestForLargeNumber() {
        services service = new services();
        String result = service.getName(100);  // Test with a large positive number
        Assertions.assertEquals("b", result);  // Expected "b" for large number
    }
}
