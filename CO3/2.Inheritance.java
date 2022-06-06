import java.util.Scanner;

class employee{
	int empid,salary;
	String name,address;
	employee(int a,String b,int c,String d){
		empid=a;
		salary=c;
		name=b;
		address=d;
	}
}
class teacher extends employee{
	String department,subject;
	teacher(int a,String b,int c,String d,String e,String f){
		super(a,b,c,d);
		department=e;
		subject=f;
	}
	void display(){
		System.out.println(" Empid: "+empid);
		System.out.println(" Name: "+name);
		System.out.println("  Salary: "+salary);
		System.out.println(" Address: "+address);
		System.out.println(" Department: "+department);
		System.out.println(" Subject: "+subject);
		
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		teacher[] obj=new teacher[10];
		System.out.println("enter no of teacher: ");
		int n=scn.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("enter Empid: ");
			int a=scn.nextInt();
			System.out.println("enter Name: ");
			String b=scn.nextLine();
			b=scn.nextLine();
			System.out.println("enter Salary: ");
			int c=scn.nextInt();
			System.out.println("enter Address: ");
			String d=scn.nextLine();
			d=scn.nextLine();
			System.out.println("enter Department: ");
			String e=scn.nextLine();
			System.out.println("enter Subject: ");
			String f=scn.nextLine();
			obj[i]=new teacher(a,b,c,d,e,f);
		}
		for(int i=0;i<n;i++){
			obj[i].display();
		}

	}

}
