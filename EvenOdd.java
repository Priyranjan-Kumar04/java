import java.util.Scanner;
public class EvenOdd{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("Welcome to Even and Odd Calculatation\n");
System.out.print("Please Enter Your Number : ");
int number = input.nextInt();
if(number%2==0){
System.out.print("Your Number is Even : ");
}
else{
System.out.println("Your Number is Odd : ");
}
}
}
  