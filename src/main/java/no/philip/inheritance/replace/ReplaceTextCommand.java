package no.philip.inheritance.replace;

import no.philip.inheritance.TextCommand;

/**
 *  ReplaceTextCommand class is replacing all text that shares the attributes
 *  searched for by the user.
 *
 */

public class ReplaceTextCommand implements TextCommand {

    // protected makes it possible for other subclasses to retrieve them.
    protected String target;
    protected String replacement;


    /**
     *
     * @return target will search for target to change
     * @return replacement will input a new change
     */
    public String getTarget() {
        return target;
    }
    public String getReplacement() {
        return replacement;
    }


    /**
     * Valdates ReplaceTextCommand
     * @param target can not be null or blank
     * @param replacement can not be null or blank
     */
    public ReplaceTextCommand(String target, String replacement) {
        if (target == null) {
            throw new IllegalArgumentException("Target can not be null");
        }
        if (replacement == null) {
            throw new IllegalArgumentException("Replacement can not be null");
        }
        if (target.isBlank()){
            throw new IllegalArgumentException("Target can not be blank");
        }
        if (replacement.isBlank()){
            throw new IllegalArgumentException("Replacement can not be blank");
        }
        this.target = target;
        this.replacement = replacement;

    }
    /**
     * Will perform the change in the text, but only the first change in the text is changed.
     * @param text The text.
     * @return Will return the original text or new text depending on the target.
     */
    @Override
    public String execute(String text) {
        return text.replace(target, replacement);
    }
}
