import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\"Welcome to Leap Year calculator\"\n");
        System.out.print("Please Enter Your Year to determin the Leap Year :" );
        int year = input.nextInt();
        if (year % 4 == 0 ||year % 400 == 0 && year % 100 != 0 ){
System.out.println(year + " is Leap year");
        }
        else{
            System.out.println(year+" is Not Leap year");
        }
    }
}
