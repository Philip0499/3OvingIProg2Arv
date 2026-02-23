package no.philip.inheritance.capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {

    protected String selection;

    public CapitalizeSelectionTextCommand(String selection) {
        if (selection == null) {
            throw new IllegalArgumentException("Selection can not be null");
        }
        if (selection.isBlank()) {
            throw new IllegalArgumentException("Selection can no be blank");
        }
        this.selection = selection;
    }
    public String getSelection() {
        return selection;
    }
    @Override
    public String execute(String text) {
        String capitalized = super.execute(selection);
        return text.replace(selection, capitalized);
    }
}