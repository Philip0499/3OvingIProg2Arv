package InheretanceTask3.replace.replace;

import InheretanceTask3.replace.TextCommand;

/**
 * Oppsett: Husk å fjern og spørre om det er sånn det skal være
 *
 * private String....
 * konstruktør som sjekker litt ting og tang.
 *
 * Gettere for morror skyld
 *
 * execute?
 *
 *
 */

public class ReplaceTextCommand implements TextCommand {
    protected String target;
    protected String replacement;

    public String getTarget() {
        return target;
    }

    public String getReplacement() {
        return replacement;
    }

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
        this.target = target;
        this.replacement = replacement;

    }
    @Override
    public String execute(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text can not be null");
        }
        return text.replace(target, replacement);
    }
}
