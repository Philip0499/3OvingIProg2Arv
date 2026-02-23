package no.philip.inheritance.wrap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapTextCommandTest {

    @Test
    void testWrapsText() {
        WrapTextCommand wrap = new WrapTextCommand("<p>", "</p>");
        assertEquals("<p>text</p>", wrap.execute("text"));
        String result = wrap.execute("text");
        System.out.println(result);
    }

    @Test
    void testOpeningThrowsExpetionIfnNUll() {
        assertThrows(IllegalArgumentException.class, () -> new WrapTextCommand(null, "</p>"));
    }

    @Test
    void testEndThrowsExceptionIfNull() {
        assertThrows(IllegalArgumentException.class, () -> new WrapTextCommand("<p>", null));
    }

    @Test
    void testGetEnd() {
        WrapTextCommand end = new WrapTextCommand("<p>", "</p>");
        assertEquals("</p>", end.getEnd());
    }

}