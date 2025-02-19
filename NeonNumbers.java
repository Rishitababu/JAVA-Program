public class NeonNumbers{
    public static void main(String[] args){
       int my_input, input_square, sum = 0;
       my_input = 9;
       System.out.print("The number is: " + my_input);
       input_square = my_input*my_input;
       for (; input_square != 0; input_square /= 10) {
          sum += input_square % 10;
       }
       if(sum != my_input)
          System.out.println("\nThe given input is not a Neon number.");
       else
          System.out.println("\nThe given input is Neon number.");
    }
 }