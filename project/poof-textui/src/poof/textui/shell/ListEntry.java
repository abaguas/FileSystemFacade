package poof.textui.shell;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.Command;
import ist.po.ui.DialogException;
import ist.po.ui.ValidityPredicate;

import java.io.IOException;

import poof.EntryUnknownCoreException;
import poof.FileManager;
import poof.textui.EntryUnknownException;

/**
 * §2.2.2.
 */
public class ListEntry extends Command<FileManager> {
    /**
     * @param fileManager
     *          the command receiver.
     */
    public ListEntry(FileManager fileManager) {
        super(MenuEntry.LS_ENTRY, fileManager);
    }

    /** @see ist.po.ui.Command#execute() */
    @Override
    public final void execute() throws DialogException, IOException {
        String entryName = IO.readString(Message.nameRequest());
        try {
            IO.println(_receiver.listEntry(entryName));
        }
        catch (EntryUnknownCoreException euce) {
            throw new EntryUnknownException(euce.getEntryName());
        }
    }

}
