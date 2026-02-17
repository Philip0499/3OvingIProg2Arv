package no.philip.inheritance.capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand{

    public CapitalizeSelectionTextCommand(String selection) {
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
        return text;
    }

    String capitalize = super.execute(this.selection);

    return text.replace(this.selection, capitalize) {
        return selection;
    }


}