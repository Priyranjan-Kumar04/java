import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome the Triangle calculator...");
        System.out.print("Please Enter the base of triangle in cms : ");
        double base = input.nextDouble();
        System.out.println("Now, Enter the perpendicualr Height in cms:");
        double height = input.nextDouble();
        double area = (base * height)/2;
        System.out.println("The Area of Triangle : "+area+"cms");
    }
} 
