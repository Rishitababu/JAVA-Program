import java.util.Scanner;
public class DownwardTriangle{
   public static void main(String args[]){
      int i, j, k, my_input;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.print("Enter the number of my_input : ");
      my_input = my_scanner.nextInt();
      System.out.println("The downward triangle star pattern : ");
      for ( i= 0; i<= my_input-1; i++){
         for ( j=0; j<=i; j++){
            System.out.print(" ");
         }
         for ( k=0; k<=my_input-1-i; k++){
            System.out.print("*" + " ");
         }
         System.out.println();
      }
   }
}