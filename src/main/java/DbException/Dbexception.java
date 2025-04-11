package DbException;

public class Dbexception extends RuntimeException {

    
    public Dbexception(String message) {
        super(message);
    }

    
    public Dbexception(Throwable cause) {
        super(cause);
    }

    
    public Dbexception(String message, Throwable cause) {
        super(message, cause);
    }
}

