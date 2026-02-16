package InheretanceTask3.replace.wrap;

import InheretanceTask3.replace.TextCommand;

public class WrapTextCommand implements TextCommand {

    protected String opening;
    protected String end;

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

    public String getOpening() {
        return opening;
    }

    public String getEnd() {
        return end;
    }

    @Override
    public String execute(String text){
        return opening + text + end; // ChatGPT
    }

}
