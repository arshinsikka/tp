package seedu.address.logic.commands;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

/**
 * Represents a command that allows users to add or update remarks for a contact.
 */

public class RemarkCommand extends Command {
    public static final String COMMAND_WORD = "remark";
    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Edits the remark of the person identified "
            + "by the index number used in the last person listing. "
            + "Existing remark will be overwritten by the input.\n"
            + "Parameters: INDEX (must be a positive integer) "
            + "r/ [REMARK]\n"
            + "Example: " + COMMAND_WORD + " 1 r/ Likes to swim.";

    private final Index index;
    private final String remark;

    /**
     * Creates a RemarkCommand with the specified {@code index} and {@code remark}.
     *
     * @param index  The index of the person to whom the remark is to be added.
     * @param remark The remark to be added.
     * @throws NullPointerException if any of the parameters are null.
     */

    public RemarkCommand(Index index, String remark) {
        requireAllNonNull(index, remark);
        this.index = index;
        this.remark = remark;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        throw new CommandException(
                String.format("Index: %d, Remark: %s", index.getOneBased(), remark));
    }
}
