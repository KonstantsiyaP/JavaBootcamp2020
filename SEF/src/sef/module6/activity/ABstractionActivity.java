package sef.module6.activity;

public class ABstractionActivity {

    public static void main(String[] args) {

     Rectangle a = new Rectangle();
        a.setColor("c");
        a.length = 5;
		a.breadth = 6;

System.out.println("Color is   : " + a.getColor());
		System.out.println("Area is    : " + a.calculateArea());
		System.out.println("Perimeter is : " + a.calculatePerimeter());}


    }
