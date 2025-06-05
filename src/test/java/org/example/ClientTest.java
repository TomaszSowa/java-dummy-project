package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ClientTest {

    @Mock
    private Service service;

    @InjectMocks
    private Client client;

    @Test
    void greeting_shouldReturnUpperCase_whenNameLengthIsEven() {
        when(service.isEven(4)).thenReturn(true);

        String result = client.greeting("John");

        assertThat(result).isEqualTo("HELLO, JOHN");
    }

    @Test
    void greeting_shouldReturnNormalCase_whenNameLengthIsOdd() {
        when(service.isEven(3)).thenReturn(false);

        String result = client.greeting("Bob");

        assertThat(result).isEqualTo("Hello, Bob");
    }

    @Test
    void greeting_shouldThrowException_whenNameIsNull() {
        assertThatThrownBy(() -> client.greeting(null))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("'name' must not be null or empty");
    }

    @Test
    void greeting_shouldThrowException_whenNameIsEmpty() {
        assertThatThrownBy(() -> client.greeting(""))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("'name' must not be null or empty");
    }

    @Test
    void greeting_shouldThrowException_whenNameIsBlank() {
        assertThatThrownBy(() -> client.greeting("   "))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("'name' must not be null or empty");
    }
}
