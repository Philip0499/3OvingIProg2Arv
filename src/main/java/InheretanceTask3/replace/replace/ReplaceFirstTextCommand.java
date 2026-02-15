package InheretanceTask3.replace.replace;


/**
 * ReplaceFirstTextCommand should only replace the first text command being given.
 *
 * This class extends ReplaceTextCommand for bether cohision and coupleing
 */

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

    /**
     *
     * @param target
     * @param replacement
     */

    public ReplaceFirstTextCommand (String target, String replacement) {
        super(target, replacement);
    }

    @Override
    public String execute(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text can not be null");
        }
      //  System.out.println(text.replaceFirst(target, replacement)); Min (funket ikke)
        return text.replaceFirst(java.util.regex.Pattern.quote(target), replacement); //ChatGPT
    }
}
