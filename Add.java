import java.util.Scanner;
public class Add {
public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    System.out.println("welcome our calculator");
    System.out.print("Enter your first Number :");
    int firstNum = input.nextInt();
    System.out.print("Now, Enter your second Number :");
    int secondNum = input.nextInt();
    int sum = firstNum + secondNum;
    System.out.print("Sum of the Number is :"+ sum);
}
    
}
