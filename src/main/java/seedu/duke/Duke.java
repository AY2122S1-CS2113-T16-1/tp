package seedu.duke;

import seedu.duke.commands.Command;
import seedu.duke.commands.Parser;
import seedu.duke.ui.TextUI;

/**
 * Main class of the application
 */
public class Duke {
    private static TextUI ui;

    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {
        ui = new TextUI();

        // Continue to read, parse and execute commands until exit command is issused by user
        while (true) {
            // Gets one line of user input
            String userInput = ui.read();
            // Parse line to create relevant command object
            Command userCommand = Parser.parse(userInput);
            // Executes logic of command
            userCommand.execute(ui);
            // Check whether to exit program
            if (userCommand.isExit()) {
                break;
            }
        }
    }
}
