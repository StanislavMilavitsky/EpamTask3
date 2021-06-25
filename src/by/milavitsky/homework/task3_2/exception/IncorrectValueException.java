package by.milavitsky.homework.task3_2.exception;

public class IncorrectValueException extends Exception {
    public IncorrectValueException(){
    super();
}
    public IncorrectValueException(String message){
        super(message);
    }
    public IncorrectValueException(String message, Throwable cause){
        super(message, cause);
    }
    public IncorrectValueException(Throwable cause){
        super(cause);
    }

}
