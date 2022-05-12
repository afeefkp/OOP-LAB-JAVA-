import java.util.Scanner;
class Person{
	String name,gender,address;
	int age;
	Scanner scn=new Scanner(System.in);
	Person(){
		System.out.println("Enter name: ");
		name=scn.nextLine();
		System.out.println("Enter gender: ");
		gender=scn.nextLine();
		System.out.println("Enter address:");
		address=scn.nextLine();
		System.out.println("Enter age:");
		age=scn.nextInt();
		scn.nextLine();
		
	}
}

class Employee extends Person{
	String empid,cname,qual;
	int salary;
	Employee(){
		System.out.println("Enter empid: ");
		empid=scn.nextLine();
		System.out.println("Enter company name: ");
		cname=scn.nextLine();
		System.out.println("Enter qualification: ");
		qual=scn.nextLine();
	}
}
class Teacher extends Employee{
	String sub,dept,tid;
	Teacher(){
		System.out.println("Enter techer id: ");
		tid=scn.nextLine();
		System.out.println("Enter Subject name: ");
		sub=scn.nextLine();
		System.out.println("Enter department name: ");
		dept=scn.nextLine();
		
		
		
	}
	void display(){
		System.out.println("name: "+name);
		System.out.println("gender: "+gender);
		System.out.println("address:"+address);
		System.out.println("age:");
		System.out.println("Enter empid: "+empid);
		System.out.println("Enter company name: "+cname);
		System.out.println("Enter qualification: "+qual);
		System.out.println("Enter techer id: "+tid);
		System.out.println("Enter Subject name: "+sub);
		System.out.println("Enter department name: "+dept);
		
		
		
	}
}

public class Inheritence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of teachers: ");
		int N=s.nextInt();
		Teacher obj[]=new Teacher[N];
	
		for(int i=0;i<N;i++){
			obj[i]=new Teacher();
		}
		for(int i=0;i<N;i++){
			obj[i].display();
		}
		


	}

}
