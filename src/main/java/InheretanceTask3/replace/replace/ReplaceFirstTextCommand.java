package InheretanceTask3.replace.replace;

/**
 * The ReplaceFirstTextCommand  is representing a comand that changes the first given command
 * that was used.
 * This class is inheriting from @ReplacetextCommand to reuse code that
 * will save both time and memmory
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
     * Will perform the change in the text, but only the first change in the text is changed.
     * @param text The text.
     * @return Will return the orginal text or new text depending on the target.
     */
    @Override
    public String execute(String text) {
      //  System.out.println(text.replaceFirst(target, replacement)); Min (funket ikke)
        return text.replaceFirst(java.util.regex.Pattern.quote(target), replacement); //ChatGPT litt usikker hvorfor
                                                                                        // Den er sånn...
    }
}
