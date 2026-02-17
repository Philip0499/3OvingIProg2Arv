package no.philip.inheritance.replace;

/**
 * ReplaceFirstTextCommand is only replacing the first hit in a text command.
 */
public class ReplaceFirstTextCommand extends ReplaceTextCommand {

    /**
     * Is a new ReplaceFistTextCommand from the constructore
     * @param target Is for searching for a target
     * @param replacement is what the target is replaced by
     * super calls for the IllegalArgumentException used in ReplaceTextCommand
     */
    public ReplaceFirstTextCommand (String target, String replacement) {
        super(target, replacement);
    }


    /**
     * The constructor will replace the old text @target, with the new text @replacement.
     *
     * @param text The text.
     * @return the replaced text.
     */
    @Override
    public String execute(String text) {
        return text.replaceFirst(java.util.regex.Pattern.quote(target), replacement);
    }
}
