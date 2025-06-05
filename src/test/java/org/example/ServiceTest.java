package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ServiceTest {

    private final Service service = new Service();

    @Test
    void isEven_shouldReturnTrue_whenInputIsEven() {
        assertThat(service.isEven(2)).isTrue();
        assertThat(service.isEven(0)).isTrue();
        assertThat(service.isEven(-2)).isTrue();
    }

    @Test
    void isEven_shouldReturnFalse_whenInputIsOdd() {
        assertThat(service.isEven(1)).isFalse();
        assertThat(service.isEven(-1)).isFalse();
        assertThat(service.isEven(3)).isFalse();
    }

    @Test
    void highComplexityMethod_shouldPrintCorrectMessages_whenAIsZero() {
        service.highComplexityMethod(0, 1, 1);
        service.highComplexityMethod(0, 1, -1);
        service.highComplexityMethod(0, -1, 1);
        service.highComplexityMethod(0, -1, -1);
    }

    @Test
    void highComplexityMethod_shouldPrintCorrectMessages_whenAIsNegative() {
        service.highComplexityMethod(-1, 1, 1);
        service.highComplexityMethod(-1, 1, -1);
        service.highComplexityMethod(-1, -1, 1);
        service.highComplexityMethod(-1, -1, -1);
    }

    @Test
    void highComplexityMethod_shouldPrintCorrectMessages_whenAIsPositive() {
        service.highComplexityMethod(1, 1, 1);
        service.highComplexityMethod(1, 1, -1);
        service.highComplexityMethod(1, -1, 1);
        service.highComplexityMethod(1, -1, -1);
    }
}
