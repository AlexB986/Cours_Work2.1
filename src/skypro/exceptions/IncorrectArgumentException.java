package skypro.exceptions;

public class IncorrectArgumentException extends Exception {

    public IncorrectArgumentException(String message) {
        System.out.println("IncorrectArgument: "+ message);
    }
}

