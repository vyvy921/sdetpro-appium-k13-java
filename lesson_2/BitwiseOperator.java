package lesson_2;

public class BitwiseOperator {
    public static void main(String[] args) {
        // &: bitwise operator
        // &: false & true -> false
        // &&: false && -> false
        //if (thatCollection !=null && !thatCollection.isEmpty())
        if(getFirstNum() !=0 && getSecondNumber() !=0)
            System.out.println("Doing sth....");
    }

    private static int getFirstNum(){
        System.out.println("Calling method 01");
        return 0;
    }
    private static int getSecondNumber(){
        System.out.println("Calling method 02");
        return 0;
    }


}
