import java.util.Scanner;
public class greatest3Numberr {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to three Greatest Number Calculatation");
    System.out.println("Please Enter your First Number : ");
    int firstnum = input.nextInt();
    System.out.println("Now, Enter Your Second Number : ");
    int secondnum = input.nextInt();
    System.out.println("Finally, Enter Your Third Number : ");
    int thirdnum = input.nextInt();
    if(firstnum>=secondnum && firstnum>=thirdnum){
        System.out.println(firstnum+" The First Greatest Number");
    }
    else if(secondnum>=thirdnum){
        System.out.println(secondnum+" The Second Greatest Number");
    }
    else{
        System.out.println(thirdnum+" The Third Geatest Number ");
    }  
}    
}
