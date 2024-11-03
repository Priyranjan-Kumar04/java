import java.util.*;

/**
 * marksSubject
 */
public class marksSubject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the all marks");
        int math = input.nextInt();
        int phy = input.nextInt();
        int  eng = input.nextInt();
        int hindi = input.nextInt();
        int chemis = input.nextInt();
        int total = math+eng+phy+chemis+hindi;
        int per = (total/5);
        if (per>=90){
            System.out.println("Excellent! You got A Grade " + per+"%");
        }
        else if(per>=75){
            System.out.println("Very Good! You got B Grade " +per+"%");
        }
        else if (per>=60){
            System.out.println("Good! You got C Grade " + per+"%");
        }
        else if(per>=35){
            System.out.println("You got D , you need hard work Grade " + per+"%");
        }
        else{
            System.out.println("You got E , You need much hard work on Study " + per +"%");
        }
        }

}
