package no.philip.inheritance.replace;

import no.philip.inheritance.wrap.WrapTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceTextCommandTest {

    @Test
    void textThatExecuteWorksRight() {
        ReplaceTextCommand command = new ReplaceTextCommand("Yeet", "Skeet");
        String result = command.execute("The cool new word is Yeet and that beqause Yeet is cool.");
        System.out.println("Result from test: " + result);
        assertEquals("The cool new word is Skeet and that beqause Skeet is cool.", result);
    }

    @Test
    void testConstructorThrowsExceptionIfTargetIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ReplaceTextCommand(null, "Replacement");
        });
    }

    @Test
    void testConstructorThrowsExceptionIfReplacementIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ReplaceTextCommand("Target", null);
        });
    }

    @Test
    void testConstructorThrowsExceptionIfTargetIsBlank() {
        assertThrows(IllegalArgumentException.class, () ->{
            new ReplaceTextCommand("", "Replacement");
        });
    }
    @Test
    void testConstructorThrowsExceptionIfReplacementIsBlank() {
        assertThrows(IllegalArgumentException.class, () ->{
            new ReplaceTextCommand("Target", "");
        });
    }
}
