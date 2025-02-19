public class SquarePattern{
    public static void main(String args[]){
       int i, j, my_input;
       my_input = 8;
       System.out.println("The length of a side is defined as " +my_input);
       System.out.println("The square pattern : ");
       for(i = 1; i <= my_input; i++){
          for(j = 1; j <= my_input; j++){
             System.out.print("* ");
          }
          System.out.print("\n");
       }
    }
 }