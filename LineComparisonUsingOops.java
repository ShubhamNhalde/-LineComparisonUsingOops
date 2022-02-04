package com.bridgelabz.linecomparison;

import java.util.Scanner;  

public class LineComparisonUsingOops {
	
    public static Scanner sc =new Scanner(System.in);
    public static double x1,y1;
    public static double x2,y2;
    public static double a1,b1;
    public static double a2,b2;



    public void lengthOfLine() {
        System.out.println("The coordinates are:");
        System.out.print("x1 = ");x1=sc.nextInt();
        System.out.print("y1 = ");y1=sc.nextInt();
        System.out.print("x2 = ");x2=sc.nextInt();
        System.out.print("y2 = ");y2=sc.nextInt();

        double length = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        System.out.println("The length of the line is = "+length);

    }

    public static void points() {
        System.out.println("The coordinates of 1st line are:");
        System.out.print("x1 = ");x1=sc.nextInt();
        System.out.print("y1 = ");y1=sc.nextInt();
        System.out.print("x2 = ");x2=sc.nextInt();
        System.out.print("y2 = ");y2=sc.nextInt();


        System.out.println("The coordinates of 2nd line are:");
        System.out.print("a1 = ");a1=sc.nextInt();
        System.out.print("b1 = ");b1=sc.nextInt();
        System.out.print("a2 = ");a2=sc.nextInt();
        System.out.print("b2 = ");b2=sc.nextInt();

    }

    public void equality() {

        Double length1 = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        System.out.println("The length of the 1st line is = "+length1);

        Double length2 = Math.sqrt(Math.pow(a2-a1, 2)+Math.pow(b2-b1, 2));
        System.out.println("The length of the 2nd line is = "+length2);

        if(length1.equals(length2))
            System.out.println("The lines are equal");
        else
            System.out.println("The lines are not equal");
    }

    public void comparison() {

        Double length1 = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        System.out.println("The length of the 1st line is = "+length1);

        Double length2 = Math.sqrt(Math.pow(a2-a1, 2)+Math.pow(b2-b1, 2));
        System.out.println("The length of the 2nd line is = "+length2);

        double res = length1.compareTo(length2);

        if(res>0) {
            System.out.println("The line1 is longer than line2");
        }else if(res<0) {
            System.out.println("The line2 is longer than line1");
        }else
            System.out.println("Both lines equal");
    }
    
    public static void main(String[] args) {
		
    	System.out.println("Welcome To Line Comparison Computation Program");
    	LineComparisonUsingOops length = new LineComparisonUsingOops();
    	length.lengthOfLine();
    	length.points();
    	length.equality();
    	length.comparison();
	}

}
