import java.util.Scanner;
public class driverelational{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("*****Welcome to Driving Licence portal*****");
    System.out.print("Please Enter Your Name : ");
    String name = input.nextLine();
    System.out.print("Enter Your Gender(male/female) : ");
    String gender = input.nextLine();
    System.out.print("Now, Enter Your Age : ");
    double age = input.nextDouble();
    if(age>=18){
        System.out.println("Construlatation! "+name +" You are eligible for driving");
       }
        else{
        System.out.println("Sorry! "+name +" you are not eligible for driving***NIBA***");
       }
    }
}
