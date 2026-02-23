package no.philip.inheritance;
import java.util.List;

/**Script is a class that have a list of TextCommands
 * The commands will go in order, where the result from on command wil pass
 * to the next.
 *
 * F.eks: The text cna first be capitalized, and then wrapped in tags.
 */
public class Script {
    private List<TextCommand> textCommands;

    /**
     * Creates a new Script with a list of commands
     *
     * @param textCommands list of commands that can be used, can not be null.
     * @throws IllegalArgumentException if textCommands is null
     */
    public Script(List<TextCommand> textCommands) {
        if (textCommands == null) {
            throw new IllegalArgumentException("textCommand can not be null");
        }
        this.textCommands = textCommands;
    }

    /**
     * Runs all commands in the list.
     * The result from each command becomes the input to the next one.
     *
     * @param text that is used.
     * @return The final command after all is run.
     */
    public String execute(String text) {
        String result = text;
        for (TextCommand command : textCommands) {
            result = command.execute(result);
        }
        return result;
    }
}
