package no.philip.inheritance.wrap;
import no.philip.inheritance.TextCommand;



public class WrapTextCommand implements TextCommand {

    protected String opening;
    protected String end;

    public WrapTextCommand(String opening, String end) {
        if (opening == null) {
            throw new IllegalArgumentException("The opening can't be Null."); // (opening == null || end = null) is not as accurate
        }
        if (end == null) {
            throw new IllegalArgumentException("The end can't be Null");
        }
        if (opening.isBlank()) {
            throw new IllegalArgumentException("Opening can't be blank");
        }
        if (end.isBlank())
            throw new IllegalArgumentException("End can't be blank");

        this.opening = opening;
        this.end = end;

    }

    @Override
    public String execute(String text) {
        return opening + text + end;
    }
}
