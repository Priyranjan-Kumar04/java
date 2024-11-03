import java.util.Scanner;
public class discount {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Discount Sales\n");
    System.out.print("Please enter Your age : ");
    int age = input.nextInt();    
    System.out.println("Are You a female(true/false)");
    boolean isfemale = input.nextBoolean();
    if(age<5){
        System.out.println("You Won 75% Discount! ");
    }
    else if(isfemale){
        System.out.println("You Won 50% Discount! ");
    }
    else if(age>60 && !isfemale){
        System.out.println("You Won 25% Discount! ");
    }
    else{
        System.out.println("You Discount is 0% ");
    }
}    
}
