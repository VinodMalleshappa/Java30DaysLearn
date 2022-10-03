/*Area and Perimeter of a Rectangle
 * Challenge Activity 1
 * This program should take two integer inputs:
 *  length and width of a rectangle.
 *  using those inputs it should calculate and display
 *  the area and perimeter of the rectangle.
 *
 *  Area = Length x Width
 *  Perimeter=  2 x (Length + Width)
 *
 * SAMPLE RUN:
 *  Enter Length: 7
 *  Enter Width: 5
 *  Perimeter : 24
 *  Area : 35
 */


import java.util.Scanner;

public class Day1_AreaParimeterOfRectangle {
    public static void main(String[] args) {
        //variables
        int length,width,Area,Parimeter;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the length");
        length = sc.nextInt();
        System.out.println("Please enter the width");
        width =sc.nextInt();

        //area of the Rectangle is
        Area = length * width;
        System.out.println("The Area of the rectangle is :"+ Area);

        //Parimeter of the Rectangle is
        Parimeter = 2* (length+width);
        System.out.println("The Parimeter of the rectangle is :"+ Parimeter);

    }

}
