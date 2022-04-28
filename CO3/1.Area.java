import java.util.Scanner;
public class Area {
	void area(int a){
		System.out.println("Area of Square="+a*a);
	}
	void area(float b){
		float r=b;
		System.out.println("Area of circle="+3.14*r*r);
	}
	void area(int x,int y){
		int len=x;
		int bre=y;
		System.out.println("Area of rectangle: "+len*bre);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Area obj=new Area();
		System.out.println("Enter the side of the square");
		int a=s.nextInt();
		
		obj.area(a);
		System.out.println("Enter radius of the circle: ");
		float b=s.nextFloat();
		obj.area(b);
		
		System.out.println("Enter length of the rectangle: ");
		int x=s.nextInt();
		System.out.println("Enter breadth of the rectangle: ");
		int y=s.nextInt();
		
		obj.area(x,y);
		
		s.close();
	}

}
