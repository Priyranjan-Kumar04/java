import java.util.Scanner;
public class as{
    public static void main(String[]args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Name:");
        String Name = input.nextLine();
        System.out.println("My friend" + Name);
        System.out.println("Tell also your Age ");
        int Age = input.nextInt();
        System.out.println("his Age is  " + Age);
    }
} 