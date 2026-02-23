package no.philip.inheritance.wrap;

/**
 * WrapSelectionTextCommand is about wrapping a chosen text.
 * This means that it will not take the whole text and replace it,
 *
 * inherates from WrapTextCommand
 */

public class WrapSelectionTextCommand extends WrapTextCommand {

    protected String selection;

    /**
     * Creates a new WrapSelectionTextCommand with an opening, closing, and selection String
     * validates via super.
     * @param opening
     * @param end
     * @param selection
     */

    public WrapSelectionTextCommand(String opening, String end, String selection) {
        super(opening, end);

        if (selection == null) {
            throw new IllegalArgumentException("Selection can not be null");
        }
        if (selection.isBlank()) {
            throw new IllegalArgumentException("Selection can not be blank");
        }
        this.selection = selection;

    }
    public String getSelection() {
        return selection;
    }

    /**
     * Wraps all instances of selection in the text with opening and end
     * @param text is the text that is surrounded.
     * @return the text where it is surrounded by opening or end.
     */
    @Override
    public String execute(String text) {
        String result = opening + selection + end;
        return text.replace(selection, result);
    }
}
