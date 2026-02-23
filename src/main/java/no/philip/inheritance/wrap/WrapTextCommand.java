package no.philip.inheritance.wrap;
import no.philip.inheritance.TextCommand;

/**
 * WrapTextCommand ends a given text with an opening String and
 * ends it with an closing String
 *
 * F.eks: The text can give the word hello to be "<p>hello</p>.
 */

public class WrapTextCommand implements TextCommand {

    protected String opening;
    protected String end;

    /**
     * Creates a new WrapTxtCommand with an opening and closing String
     *
     * @param opening The opening String can be put in front of the text and can not be null or blank
     * @param end The closing String can be put behind the text and can nopt be null or blank.
     * @throws IllegalArgumentException If the opening ot end is null or blank
     */

    public WrapTextCommand(String opening, String end) {
        if (opening == null) {
            throw new IllegalArgumentException("The opening can't be Null."); // (opening == null || end = null) is not as accurate
        }
        if (end == null) {
            throw new IllegalArgumentException("The end can't be Null");
        }
        if (opening.isBlank()) {
            throw new IllegalArgumentException("Opening can't be blank");
        }
        if (end.isBlank())
            throw new IllegalArgumentException("End can't be blank");

        this.opening = opening;
        this.end = end;

    }

    /**
     * Returns the opening and the end
     *
     * @return opening and end
     */
    public String getOpening() {
        return opening;
    }
    public String getEnd() {
        return end;
    }

    /**
     * creates the open and end around the text
     *
     * @param text is the text that is surrounded.
     * @return is the text that is closed in by the opening and end.
     */

    @Override
    public String execute(String text) {
        return opening + text + end;
    }
}
