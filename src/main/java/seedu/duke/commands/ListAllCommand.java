package seedu.duke.commands;

import seedu.duke.data.Catalogue;
import seedu.duke.data.Item;
import seedu.duke.ui.TextUI;

import static seedu.duke.common.Messages.DIVIDER;
import static seedu.duke.common.Messages.LIST_ALL_MESSAGE;

/**
 * Command that lists out all items.
 */
public class ListAllCommand extends Command {
    public static final String COMMAND_WORD = "list";

    /**
     * Single constructor, no parameters.
     */
    public ListAllCommand() {
    }

    /**
     * Prints out all items in the list.
     * Overrides method from parent class.
     * @param ui Object that handles user IO
     * @param catalogue Object that stores the list of all items
     */
    @Override
    public void execute(TextUI ui, Catalogue catalogue) {
        ui.print(LIST_ALL_MESSAGE);
        ui.print(DIVIDER);
        for (Item temp : catalogue.getAllItems()) {
            ui.print(temp);
        }
        ui.print(DIVIDER);
    }
}