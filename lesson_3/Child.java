package lesson_3;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Child extends Parent implements Club{

    public void showInfo(int a){
        System.out.println("This is child + " + a);
    }

    public void showChild(){
        System.out.println("show only Child ");
    }

    public static void main(String[] args) {

        Child cl = new Child();
        cl.showInfo(5);
        cl.showInfo();

        //Child c2 = new Parent();
        Parent p2 = new Parent();
        p2.showInfo();

        Parent p = new Child();
        p.showInfo();

        Club anonymous = new Club() {
            @Override
            public void showInfo() {
                System.out.println("This is anonymous");
            }
        };

        anonymous.showInfo();

    }

    @Override
    public void showInfo() {
        System.out.println("This is Childd !!!");
    }
}
