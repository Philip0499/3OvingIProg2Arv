package Replace;

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

public class ReplaceTextCommand implements TextCommand{

    private String target;
    private String replacement;

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
}
