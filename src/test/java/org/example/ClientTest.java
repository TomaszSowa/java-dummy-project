package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    @Test
    void greeting_returnsUppercaseIfNameLengthEven() {
        Service service = new Service();
        Client client = new Client(service);
        String result = client.greeting("John"); // length 4, even
        assertEquals("HELLO, JOHN", result);
    }

    @Test
    void greeting_returnsNormalIfNameLengthOdd() {
        Service service = new Service();
        Client client = new Client(service);
        String result = client.greeting("Tom"); // length 3, odd
        assertEquals("Hello, Tom", result);
    }

    @Test
    void greeting_throwsExceptionIfNameNull() {
        Service service = new Service();
        Client client = new Client(service);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(null));
        assertTrue(exception.getMessage().contains("must not be null or empty"));
    }

    @Test
    void greeting_throwsExceptionIfNameBlank() {
        Service service = new Service();
        Client client = new Client(service);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> client.greeting("   "));
        assertTrue(exception.getMessage().contains("must not be null or empty"));
    }
}

