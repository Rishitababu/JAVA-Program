import java.util.*;
class GetUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        System.out.println("enter third number:");
        int c=sc.nextInt();
        int d=a+b+c;
        System.out.println("Total=" +d);
    }
}