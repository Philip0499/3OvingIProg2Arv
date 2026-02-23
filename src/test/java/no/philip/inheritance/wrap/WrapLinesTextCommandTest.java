package no.philip.inheritance.wrap;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WrapLinesTextCommandTest {

    @Test
    void testWrapsEachLine() {
        WrapLinesTextCommand cool = new WrapLinesTextCommand("<p>", "</p>");
        assertEquals("<p>first line</p>\n<p>second line</p>", cool.execute("first line\nsecond line"));
        System.out.println(cool.execute("first line\nsecond line"));
    }

    @Test
    void testWrapsSingleLine() {
        WrapLinesTextCommand wrap = new WrapLinesTextCommand("<p>", "</p>");
        assertEquals("<p>single line</p>", wrap.execute("single line"));
        System.out.println(wrap.execute("single line"));
    }
    @Test
    void testIfNullTextThrowsException() {
        WrapLinesTextCommand wrap = new WrapLinesTextCommand("<p>", "</p>");
        assertThrows(IllegalArgumentException.class, () -> wrap.execute(null));
    }

    @Test
    void testIfBLankTextWillThrowEcxeption() {
        WrapLinesTextCommand wrap = new WrapLinesTextCommand("<p>", "</p>");
        assertThrows(IllegalArgumentException.class, () -> wrap.execute(" "));
    }
}



