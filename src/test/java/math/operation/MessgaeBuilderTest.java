package math.operation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessgaeBuilderTest {

    @Test
    void testNameMkyong() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello Devender", obj.getMessage("Devender"));

    }
}
