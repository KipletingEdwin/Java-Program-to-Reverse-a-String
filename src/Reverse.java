import java.util.Scanner;
public class Reverse {
     public void stringReverse(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the string to Reverse");
         String myInput = scanner.next();
         String reversedOutput = "";

         for(int i = myInput.length() -1; i >=0; i--){
             reversedOutput = reversedOutput +myInput.charAt(i);
         }
         System.out.println(reversedOutput);

    }
}
