package no.philip.inheritance;

import no.philip.inheritance.capitalize.CapitalizeTextCommand;
import no.philip.inheritance.replace.ReplaceTextCommand;
import no.philip.inheritance.wrap.WrapTextCommand;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ScriptTest {

    @Test
    void testSingleCommand() {
        Script script = new Script(List.of(new CapitalizeTextCommand()));
        assertEquals("Hello there", script.execute("hello there"));
        System.out.println(script.execute("hello there"));
    }

    @Test
    void testMultipleCommandsInOder() {
        Script script = new Script(List.of(new CapitalizeTextCommand(), new WrapTextCommand("<p>", "</p>")));
        assertEquals("<p>Hello there</p>", script.execute("hello there"));
        System.out.println(script.execute("hello there"));
    }

    @Test
    void testEmptyCommandList() {
        Script script = new Script(List.of());
        assertEquals("hello there", script.execute("hello there"));
        System.out.printf(script.execute("hello there"));
    }
    
}