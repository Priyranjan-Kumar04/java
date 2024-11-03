import java.util.Scanner;
public class Flotmultiplication {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("\"Doing the Float Multiplication\"\n");
        System.out.print("Please Enter Your First Number : ");
        double firstnum = input.nextDouble();
        System.out.print("Now, Enter Your Second Number : ");
        double secondnum = input.nextDouble();
        double multiplication = firstnum * secondnum;
        System.out.println("The result is : " + multiplication);
    }
}
