package no.philip.inheritance.capitalize;
import no.philip.inheritance.TextCommand;

/**
 * The class CapitalizeText is about caitalizing the
 * first letter in a text string.
 *
 */

public class CapitalizeTextCommand implements TextCommand {

    /**
     *
     * @param text Is the text that will be capitalized.
     * @return Will take the first letter of the word and change it to a capitalized one.
     * After that it will shift the spot of the rest of the text one step behind and move the "new"
     * capitalized lether in front of it.
     */
    @Override
    public String execute(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text can not be null");
        }
        if (text.isEmpty()) {
            return text;
        }
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }



}
