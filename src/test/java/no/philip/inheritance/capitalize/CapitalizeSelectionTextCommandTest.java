package no.philip.inheritance.capitalize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeSelectionTextCommandTest {

    @Test
    void testCapitalizedAllSelections() {
        CapitalizeSelectionTextCommand abc = new CapitalizeSelectionTextCommand("word");
        assertEquals("Word is a good platform to find Word s you want to use",
                abc.execute("word is a good platform to find word s you want to use"));
    }

    @Test
    void testSelectionIsNotInText() {
        CapitalizeSelectionTextCommand not = new CapitalizeSelectionTextCommand("not");
        assertEquals("test without any match", not.execute("test without any match"));
    }

    @Test
    void testBlankSelectionThrowsExeption() {
        assertThrows(IllegalArgumentException.class, () -> new CapitalizeSelectionTextCommand(" "));
    }

    @Test
    void testGetSelection() {
        CapitalizeSelectionTextCommand get = new CapitalizeSelectionTextCommand("get");
        assertEquals("get", get.getSelection());
    }

}
