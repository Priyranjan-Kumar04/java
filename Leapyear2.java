import java.util.Scanner;
public class Leapyear2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\"elcome to Leap Year calculator\"\n\n");
        System.out.print("Please Enter your year to find the Leap Year : ");
        double year = input.nextDouble();
        if(year %4 == 0 || year %400 == 0 && year %100 != 0){
            System.out.print(year+ " is Leap year ");
        }
        else{
            System.out.print(year +" is not Leap Year ");
        }
    }
}
