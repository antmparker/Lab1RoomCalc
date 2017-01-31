import java.util.Scanner;

/**
 * Created by anthonymparker on 1/30/17.
 */
public class RoomCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to the Room Detail Generator!");
        System.out.print("Enter Room Length: ");
        double length = input.nextDouble();
        System.out.print("Enter Room Width: ");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println("Area of Room: " + area);
        double perimeter = (2 * length) + (2 * width);
        System.out.println("Perimeter of Room: " + perimeter);
        System.out.println();
        System.out.println();

        input.close();}
    }



