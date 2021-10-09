package seedu.duke.commands;

import seedu.duke.ui.TextUI;

import static seedu.duke.common.Messages.UNKNOWN_MESSAGE;

public class UnknownCommand extends Command {

    /**
     * Single constructor, no parameters.
     */
    public UnknownCommand() {
    }

    /**
     * Prints unknown message.
     * Overrides method from parent class.
     * @param ui Object that handles user IO
     */
    @Override
    public void execute(TextUI ui) {
        ui.print(UNKNOWN_MESSAGE);
    }

}
