package chapter6.exceptions_and_assertions.custom_exception;

/**
 * Created by dan on 11/22/16.
 */
public class CustomException extends Exception {
    public CustomException(){
        super();
    }
    public CustomException(String message){
        super(message);
    }
}

class UseCustomException {
    public void login(String user) throws CustomException {
        if(true){
            throw new CustomException();
        }
    }
}

class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(){
        super();
    }
    public CustomUncheckedException(String message){
        super(message);
    }
}

class UseCustomUncheckedException {
    // Don't need to include throws clause as CustomUncheckedException is a RuntimeException
    public void tryExc() {
        throw new CustomUncheckedException();
    }
}