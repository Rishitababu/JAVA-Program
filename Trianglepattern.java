import java.io.*;
public class Trianglepattern {
	public static void StarRightTriangle(int n)
	{
		int a, b;
		for (a = 0; a < n; a++) {
			for (b = 0; b <= a; b++) {
				// printing stars
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String args[])
	{
		int k = 5;
		StarRightTriangle(k);
	}
}
