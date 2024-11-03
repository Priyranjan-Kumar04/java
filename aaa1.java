import java.util.Scanner;
public class aaa1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to print the string, double, int \n\n");
        System.out.println ("Please Enter the String, Double, int Value : ");
        int number = input.nextInt();
        double fnumber = input.nextDouble();
        input.nextLine();
        String pr = input.nextLine();

        System.out.println("String : " + pr+"\nDouble : " + fnumber+ "\n Int : "+ number);
        

    }
}
