package no.philip.inheritance.replace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceFirstTextCommandTest {

    @Test
    void testIfExecuteOnlyReplacesTheFirstWord() {
        ReplaceFirstTextCommand textCommand = new ReplaceFirstTextCommand("Warwick", "Lillia");
        String result = textCommand.execute("Warwick is the best champ for jungle in lol, that is beqause Warwick is cool.");
        System.out.println("Result from test: " + result);
        assertEquals("Lillia is the best champ for jungle in lol, that is beqause Warwick is cool.", result);
    }

    @Test // If there is no new target
    void testIfReplaceWhenTheTargetIsNotInText() {
        ReplaceFirstTextCommand text = new ReplaceFirstTextCommand("target", "replacement");
        assertEquals("This text here", text.execute("This text here"));
    }

    /**
     * IllegalArgumentException Tests are almost the same ass in testReplaceTextCommand
     */
    @Test
    void testGetTarget() {
        ReplaceFirstTextCommand text = new ReplaceFirstTextCommand("target", "replacement");
        assertEquals("replacement", text.getReplacement());
    }

}