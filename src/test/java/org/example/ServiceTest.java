package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {
    @Test
    void isEven_returnsTrueForEvenNumbers() {
        Service service = new Service();
        assertTrue(service.isEven(2));
        assertTrue(service.isEven(0));
        assertTrue(service.isEven(-4));
    }

    @Test
    void isEven_returnsFalseForOddNumbers() {
        Service service = new Service();
        assertFalse(service.isEven(1));
        assertFalse(service.isEven(-3));
    }

    @Test
    void highComplexityMethod_coversAllBranches() {
        Service service = new Service();
        // a == 0, b > 0, c > 0
        service.highComplexityMethod(0, 1, 1);
        // a == 0, b > 0, c <= 0
        service.highComplexityMethod(0, 1, 0);
        // a == 0, b <= 0, c > 0
        service.highComplexityMethod(0, 0, 1);
        // a == 0, b <= 0, c <= 0
        service.highComplexityMethod(0, 0, 0);
        // a < 0, b > 0, c > 0
        service.highComplexityMethod(-1, 1, 1);
        // a < 0, b > 0, c <= 0
        service.highComplexityMethod(-1, 1, 0);
        // a < 0, b <= 0, c > 0
        service.highComplexityMethod(-1, 0, 1);
        // a < 0, b <= 0, c <= 0
        service.highComplexityMethod(-1, 0, 0);
        // a > 0, b > 0, c > 0
        service.highComplexityMethod(1, 1, 1);
        // a > 0, b > 0, c <= 0
        service.highComplexityMethod(1, 1, 0);
        // a > 0, b <= 0, c > 0
        service.highComplexityMethod(1, 0, 1);
        // a > 0, b <= 0, c <= 0
        service.highComplexityMethod(1, 0, 0);
        // No assertions since method only prints, but all branches are covered.
    }
}
