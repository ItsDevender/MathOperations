package math.operation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

private class MessgaeBuilderTest {

    @Test
    private void testNameMkyong() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello Devender", obj.getMessage("Devender"));

    }
}
