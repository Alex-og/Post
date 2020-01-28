package exceptions;

public class StolenPackageException extends RuntimeException{
    public StolenPackageException(Exception e){
        super(e);
    }
}
