package exercises;
import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        Integer lengthRect = input.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        Integer widthRect = input.nextInt();
        Integer areaRect = widthRect * lengthRect;
        System.out.println("The area of your rectangle is " + areaRect);
        //input.skip("\n"); skips the enter
        input.close();
    }
}
