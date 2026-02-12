package Replace;

public class ReplaceTextCommand implements TextCommand{

    private String target;
    private String replacement;

    public ReplaceTextCommand(String target, String replacement) {
        this.target = target;
        this.replacement = replacement;
    }

}
