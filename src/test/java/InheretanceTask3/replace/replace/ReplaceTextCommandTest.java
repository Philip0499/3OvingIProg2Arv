package InheretanceTask3.replace.replace;

import InheretanceTask3.replace.wrap.WrapTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceTextCommandTest {

    @Test
    void textThatExecuteWorksRight() {
        ReplaceTextCommand command = new ReplaceTextCommand("Yeet", "Skeet");
        String result = command.execute("What are you Yeet today.");
        System.out.println("Result from test: " + result);
        assertEquals("What are you Skeet today.", result);
    }

    @Test
    void testGetOpeningAndEndMethodes() {
        WrapTextCommand textCommand = new WrapTextCommand("start", "end");
        assertEquals("start", textCommand.getOpening());
        assertEquals("end", textCommand.getEnd());
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
