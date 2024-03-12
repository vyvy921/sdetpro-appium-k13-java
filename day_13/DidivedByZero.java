package day_13;

public class DidivedByZero extends RuntimeException{
    /*Usage:
    * override super constructor
    * */
    public DidivedByZero() {
    }

    public DidivedByZero(String message) {
        super(message);
    }
}
