package no.philip.inheritance.replace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceFirstTextCommandTest {

    @Test
    void testIfExecuteOnlyReplacesTheFirstWord() {
        ReplaceFirstTextCommand textCommand = new ReplaceFirstTextCommand("Warwick", "Lillia");
        String result = textCommand.execute("Warwick is the best champ for Jungle");
        System.out.println("Result from test: " + result);
        assertEquals("Lillia is the best champ for Jungle", result);
    }
}