package no.philip.inheritance.capitalize;
import java.util.regex.Pattern;

/**
 * I had to use some AI creating this class. It had a hard time understanding how to use it.
 *
 * CapitalizeWordsTextCommand changes the first word for each letter to a big letter.
 * F.eks: "hello how are you" can become "Hello How Are You"
 * This class innherrates from CapitalizeTheCommand
 */


public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {


    /**
     * Makes the first letter in each word big.
     *
     * @param text The text used, can not be null
     * @return each word with a big letter
     * @throws IllegalArgumentException if the text is empty
     */
    @Override
    public String execute(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text can not be null");
        }
        if (text.isEmpty())
            return text;

        String regex = "\\b(.)(.*?)\\b";           // ChatGPT
        return Pattern.compile(regex).matcher(text).replaceAll(match ->
                match.group(1).toUpperCase() + match.group(2));

    }
}
