public class UpperStarTriangle{
    public static void main(String args[]){
       int i, j, my_input;
       my_input = 8;
       System.out.println("The number of rows is defined as " +my_input);
       System.out.println("The upper star triangle star pattern: ");
       for (i=0; i<my_input; i++){
          for (j=2*(my_input-i); j>=0; j--){
             System.out.print(" ");
          }
          for (j=0; j<=i; j++ ){
              System.out.print("* ");
         }
         System.out.println();
       }
    }
 }