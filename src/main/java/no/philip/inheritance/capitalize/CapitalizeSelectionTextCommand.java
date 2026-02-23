package no.philip.inheritance.capitalize;


/**
 * CapitalizeSelectionTextCommand changes each letter to a big letter
 * in all instances where the text is marked.
 *
 * F.eks: "you are you" can become "You are You" if selection "you" are chosen,
 * inherits from CapitalizeTextCommand
 */
public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {

    protected String selection;

    /**
     * @param selection the word that is going to be capitalized, can npt be null or blank.
     * @throws IllegalArgumentException if selection is null or blank.
     */

    public CapitalizeSelectionTextCommand(String selection) {
        if (selection == null) {
            throw new IllegalArgumentException("Selection can not be null");
        }
        if (selection.isBlank()) {
            throw new IllegalArgumentException("Selection can no be blank");
        }
        this.selection = selection;
    }

    /**
     * Return the word that is going to be capitalized
     * @return selection
     */
    public String getSelection() {
        return selection;
    }

    /**
     * Capitalize all selections in the text
     * @return the text as capitalized where the selection tells it to.
     */
    @Override
    public String execute(String text) {
        String capitalized = super.execute(selection);
        return text.replace(selection, capitalized);
    }
}