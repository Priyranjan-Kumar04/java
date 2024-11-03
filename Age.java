import java.util.Scanner;
public class Age {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String Name = input.nextLine();
        System.out.println("pNamaste\t"+ Name);
        System.out.println("Also Enter Your Age:");
        int Age = input.nextInt();
        System.out.println("His Age will : " + Age);
    }
}
