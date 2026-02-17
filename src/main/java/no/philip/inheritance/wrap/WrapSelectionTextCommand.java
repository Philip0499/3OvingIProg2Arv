package no.philip.inheritance.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand {

    protected String selection;

    public WrapSelectionTextCommand(String opening, String end, String selection) {
        super(opening, end);

        if (selection == null) {
            throw new IllegalArgumentException("Selection can not be null");
        }
        if (selection.isBlank()) {
            throw new IllegalArgumentException("Selection can not be blank");
        }
        this.selection = selection;

    }
    public String getSelection() {
        return selection;
    }

    @Override
    public String execute(String text) {
        String result = opening + selection + end;
        return text.replace(selection, result);
    }
}
