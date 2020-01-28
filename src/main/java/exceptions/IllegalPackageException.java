package exceptions;

public class IllegalPackageException extends RuntimeException{
    public IllegalPackageException(Exception e){
        super(e);
    }
}
