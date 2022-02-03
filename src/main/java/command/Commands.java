package command;

import ui.Ui;
import tasklist.TaskList;
import storage.Storage;

// Enums of command
// public enum Commands123 {
//     bye, list, mark, unmark, delete, todo, deadline, event;
// } 

public class Commands {

    public static final String COMMAND_WORDS = "";
    private static boolean IS_EXIT = false;

    public boolean isExit() {
        return IS_EXIT;
    }

    public CommandResult execute(TaskList tasks, Ui ui, Storage storage) {
        throw new UnsupportedOperationException("    This method is to be implemented by child classes");
    }
}