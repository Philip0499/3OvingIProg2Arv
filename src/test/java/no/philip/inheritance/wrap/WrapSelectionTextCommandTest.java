package no.philip.inheritance.wrap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapSelectionTextCommandTest {

    @Test
    void testWrapsSelection() {
        WrapSelectionTextCommand wrap = new WrapSelectionTextCommand("<p>", "</p>", "selection");
        assertEquals("text with <p>selection</p>", wrap.execute("text with selection"));
        System.out.println("text with selection");
    }
    @Test
    void testSelectionNotInText() {
        WrapSelectionTextCommand wrap = new WrapSelectionTextCommand("<p>", "</p>", "selection");
        assertEquals("text without match", wrap.execute("text without match"));
        System.out.println("text without match");
    }

}