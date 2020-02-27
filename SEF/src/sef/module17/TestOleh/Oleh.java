package sef.module8;

public class Oleh {
    public static void main(String arg[]) {
        sef.module8.sample.Oleh oleh = new sef.module8.sample.Oleh();
        oleh.add(3, 5);
        System.out.println("Hello" + oleh.add(3, 5));
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
