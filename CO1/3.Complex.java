import java.util.*;
public class Complex {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the real part of the first complex number: ");
		int a=scn.nextInt();
		
		System.out.println("enter the imaginary part of the first complex number: ");
		int b=scn.nextInt();
		
		System.out.println("enter the real part of the second complex number: ");
		int c=scn.nextInt();
		
		System.out.println("enter the imaginary part of the second complex number: ");
		int d=scn.nextInt();
		
		System.out.println("First complex no is: "+a+"+"+b+"i");
		System.out.println("Second complex no is: "+c+"+"+d+"i");
		
		
		int x=a+c;
		int y=b+d;
		System.out.println("Sum of both complex no is: "+x+"+"+y+"i");
		

	}

}
