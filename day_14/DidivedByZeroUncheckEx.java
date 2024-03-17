package day_14;

public class DidivedByZeroUncheckEx extends RuntimeException{
    /*Usage:
    * override super constructor
    * */
    public DidivedByZeroUncheckEx() {
    }

    public DidivedByZeroUncheckEx(String message) {
        super(message);
    }
}
