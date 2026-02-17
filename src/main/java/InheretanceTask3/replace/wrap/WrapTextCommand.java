package InheretanceTask3.replace.wrap;
import InheretanceTask3.replace.TextCommand;

/**
 * WrapTextCommand implements the interface TextCommand and makes it
 * possible to warp a given text with other texts
 */

public class WrapTextCommand implements TextCommand {
    protected String opening;
    protected String end;

    /**
     * Validates WrapTextCommand by doing a command without text, if
     * @param opening or @param end is null will the program throw a new
     * aception and stop the program
     */

    public WrapTextCommand(String opening, String end) {
        if (opening == null) {
            throw new IllegalArgumentException("The opening can not be NULL");
        }
        if (end == null) {
            throw new IllegalArgumentException("The end can not be null");
        }
        this.opening = opening;
        this.end = end;

    }

    /**
     * The getters does not have alot of use now, but can be used for testing.
     * @return opening and end
     */
    public String getOpening() {
        return opening;
    }
    public String getEnd() {
        return end;
    }

    /**
     * Override will tell java that the code is pmplementing the Textcommand metode
     * from the TextCommand class
     *
     * @param text the text that is supposed to be added
     * @return a new opening and end part for the text
     */

    @Override
    public String execute(String text){
        return opening + text + end; // ChatGPT
    }

}
