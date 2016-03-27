package poof;

/**
 * Thrown when an invalid attempt is made to use an entry.
 */
public class IsNotFileCoreException extends CoreException {
    /** Invalid entry name. */
    private final String _entryName;

    /**
     * @param entryName
     */
    public IsNotFileCoreException(String entryName) {
        _entryName = entryName;
    }

    /**
     * @return _entryName
     */
    public String getEntryName() {
        return _entryName;
    }
}
