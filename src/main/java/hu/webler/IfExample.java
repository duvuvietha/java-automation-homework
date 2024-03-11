package hu.webler;

import javax.swing.*;

public class IfExample {

    public static void main(String[] args) {

        checkAction('+', 10, 7);
        checkAction('-', 3,9);
        checkAction('*', 4,3);
        checkAction('/',5,8);
    }
    private static void checkAction(char muvelet, int a, int b) {
        int eredmeny;

        if (muvelet == '+' ) {
            System.out.println(eredmeny = a + b);
        } else if (muvelet == '-' ) {
            System.out.println(eredmeny = a - b);
        } else if (muvelet == '*' ) {
            System.out.println(eredmeny =  a * b);
        } else if (muvelet == '/') {
            System.out.println(eredmeny = a / b);
        }
    }
}
