import java.util.Scanner;
public class driving {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int age;
    String name;
    System.out.println("Enter Your name:");
    name = input.nextLine();
    System.out.println("Enter Your gender(Male/female):");
    String gender = input.nextLine();
    System.out.println("Enter Your age:");
    age = input.nextInt();
    
    if(age>=18){
      switch (gender) {
        case "Male":
            System.out.println("Congrats! Mr."+name+" You are eligible for driving");
            break;
        case "Female":
            System.out.println("Congrats! Mrs."+name+" You are eligible for driving");
        default:
            System.out.println("Congrats! "+name+" You are eligible for driving");
            break;
      }
        
    }
    else{
        System.out.println("Sorry"+name+" you are not eligible for driving");
    }

   } 
}
