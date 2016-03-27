package poof;

/**
 * Thrown when an attempt is made to create a duplicate entry.
 */
public class EntryExistsCoreException extends CoreException {
    /** Invalid entry name. */
    private final String _entryName;

    /**
     * @param entryName
     */
    public EntryExistsCoreException(String entryName) {
        _entryName = entryName;
    }

    /**
     * @return _entryName
     */
    public String getEntryName() {
        return _entryName;
    }

}
