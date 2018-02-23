import java.util.Scanner;

public class Studentstatement
{
   public static void main(String[] args)
   
   {
      String message;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter Your Name");
      
      message = scan.nextLine();
      
      name = message;
      
      System.out.println("Enter Your Age");
      
      age = scan.nextLine();
      
      System.out.println("What college do you attend?");
      
      college = scan.nextLine();
      
      System.out.println("What is your pet's name?");
      
      petname = scan.nextLine();
      
      System.out.println("Hello, my name is \"" + name + "\"and I am \"" + age + "\"years old. I'm enjoying my time at \"" + college + "\", though I miss my \"" + petname + "very much!");
                          
      }
}
