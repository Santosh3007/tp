package swift.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.HashMap;

import swift.logic.parser.Prefix;
import swift.model.AddressBook;
import swift.model.Model;

/**
 * Clears the address book.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final HashMap<Prefix, String> ARGUMENT_PROMPTS = new HashMap<>();

    public static final String MESSAGE_SUCCESS = "Address book has been cleared!";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.setAddressBook(new AddressBook());
        return new CommandResult(MESSAGE_SUCCESS, CommandType.CLEAR);
    }
}
