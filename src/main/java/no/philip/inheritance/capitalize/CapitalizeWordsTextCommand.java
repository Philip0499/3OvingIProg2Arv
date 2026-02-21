package no.philip.inheritance.capitalize;

import java.util.regex.Pattern;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

    @Override
    public String execute(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text can not be null");
        }
        if (text.isEmpty())
            return text;

        String regex = "\\b(.)(.*?)\\b";
        return Pattern.compile(regex).matcher(text).replaceAll(match ->
                match.group(1).toUpperCase() + match.group(2));

    }
}
