package no.philip.inheritance.capitalize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeWordsTextCommandTest {

    @Test
    void testCapitalizeAllWorlds() {
        CapitalizeWordsTextCommand all = new CapitalizeWordsTextCommand();
        assertEquals("Er Dette I Store Bokstaver?", all.execute("er dette i store bokstaver?"));
        String result = all.execute("er dette i store bokstaver?");
        System.out.println(result);
    }

    @Test
    void testIFAlreadyCapitalized() {
        CapitalizeWordsTextCommand yeet = new CapitalizeWordsTextCommand();
        assertEquals("Nei De Er Ikke Store", yeet.execute("Nei De Er Ikke Store"));
        yeet.execute("Nei De Er Ikke Store");
        String notResult = yeet.execute("Nei De Er Ikke Store");
        System.out.println(notResult);
    }
    @Test
    void testEmptyString() {
        CapitalizeWordsTextCommand hello = new CapitalizeWordsTextCommand();
        assertEquals("", hello.execute(""));
    }

    @Test
    void testIfNullThrowExpectation() {
        CapitalizeWordsTextCommand cText = new CapitalizeWordsTextCommand();
        assertThrows(IllegalArgumentException.class, () -> cText.execute(null));

    }

}