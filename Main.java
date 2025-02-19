import java.util.Scanner;
public class Main 
{
	int real, imag;  
	public Main(int r, int i) {
        this.real = r;
        this.imag = i;
    }
    public void print() { 
        System.out.print("(" + this.real + " + " + this.imag + "i" + ")");
    }
    public static void main(String arg[]) {

        Scanner code = new Scanner(System.in);  
        System.out.print("Enter First Real Part: "); 
        int num1 = code.nextInt(); 
        System.out.print("Enter First Imaginary Part: ");
        int num2 = code.nextInt(); 
        Main c1 = new Main(num1, num2);  

        System.out.print("Enter Second Real Part: ");
        int num3 = code.nextInt(); 
        System.out.print("Enter Second Imaginary Part: ");
        int num4 = code.nextInt(); 

        Main c2 = new Main(num3, num4); 

        System.out.print("First Complex Number: ");
        c1.print();  
        System.out.print("\nSecond Complex Number: ");
        c2.print();  
    }
}