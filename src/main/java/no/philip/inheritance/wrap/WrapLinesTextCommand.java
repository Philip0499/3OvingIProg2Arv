package no.philip.inheritance.wrap;

/**
 * The WrapLinesTextCommand class inherits from WrapTextCommand and
 * wrapes each line of the given text
 *
 * This class hva e constructor that takes in both the opening and closing lines
 */

public class WrapLinesTextCommand extends WrapTextCommand {

    public WrapLinesTextCommand(String opening, String end) {
        super(opening, end);
    }


    @Override
    public String execute(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Text can not be null");
        }

        if (text.isBlank()) {
            throw new IllegalArgumentException("Text can not be blank");
        }
        return text.lines()
                .map(line -> opening + line + end)
                .collect(java.util.stream.Collectors.joining("\n"));
    }
}
