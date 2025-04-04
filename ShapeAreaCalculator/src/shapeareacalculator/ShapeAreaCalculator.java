/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapeareacalculator;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class ShapeAreaCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the length of each side of the square");
        double slength=scanner.nextDouble();
        System.out.println("Please enter the length of each side of the rectangle");
        double rlength=scanner.nextDouble();
        System.out.println("Please enter the width of the reactangle");
        double width=scanner.nextDouble();
        System.out.println("Please enter the radius of the circle");
        double radius=scanner.nextDouble();
        
        System.out.println("Area of square with length : " +slength+"m"+ " = " + squareArea(slength)+"m");
        System.out.println("Area of rectangle with length : " +rlength+"m"+ " and width : "+ width+"m" + " = " + rectangleArea(width,rlength)+"m");
        System.out.println("Area of circle with radius : " +radius+"m"+ " = " + circleArea(radius)+"m");
    }
    public static double squareArea(double length)
    {
        double area=(4*length);
        return area;
    }
    public static double rectangleArea(double width, double length)
    {
        double area=width*length;
        return area;
    }
    public static double circleArea(double radius)
    {
        double area=Math.PI*(radius*radius);
        return area;
    }
}
