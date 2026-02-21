package no.philip.inheritance.capitalize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTextCommandTest {

    @Test
    void testCapitalizeFirstLetter() {
        CapitalizeTextCommand text = new CapitalizeTextCommand();
        assertEquals("I like to eat tacos", text.execute("i like to eat tacos"));
        String result = text.execute("i like to eat tacos");
        System.out.println(result);
    }
    @Test
    void testIfLetterIsCapitalized() {
        CapitalizeTextCommand text = new CapitalizeTextCommand();
        assertEquals("But not sushi", text.execute("But not sushi"));
        String result = text.execute("But not sushi");
        System.out.println(result);
    }
    @Test
    void testEmptyString() {
        CapitalizeTextCommand text = new CapitalizeTextCommand();
        assertEquals("", text.execute(""));
    }

}