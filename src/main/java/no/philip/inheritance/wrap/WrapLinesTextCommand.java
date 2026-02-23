package no.philip.inheritance.wrap;

/**
 * WrapLinesTextCommand wraps each line iin a text with an opening or closing string
 * F.eks: can "that is god/bad depending on" become .....<p>god</p>\n<p>bad</p>...
 * Integrates from WrapTextCommand.
 */
public class WrapLinesTextCommand extends WrapTextCommand {


    /**
     * Creates a new WrapLinesTectCommand with an opening and ending string
     * @param opening String, can not be null or blank
     * @param end String, can not be null or blank
     */
    public WrapLinesTextCommand(String opening, String end) {
        super(opening, end);
    }

    /**
     *
     * @param text that is worked on, can not be null or blank
     * @return the text for each line, wraped with an opening or end.
     * @throws IllegalArgumentException if text is null or blank.
     */

    @Override
    public String execute(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Text can not be null");
        }

        if (text.isBlank()) {
            throw new IllegalArgumentException("Text can not be blank");
        }
        return text.lines()
                .map(line -> opening + line + end)
                .collect(java.util.stream.Collectors.joining("\n"));
    }
}
