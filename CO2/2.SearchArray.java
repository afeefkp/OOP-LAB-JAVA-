import java.util.Scanner;
public class SearchArray {

	public static void main(String[] args) {
		int flag=0;
		System.out.println("the given array is: ");
		int[] arr= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("enter the element to be search: ");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(a==arr[i]) {
				flag=1;
			}
			
			
		}
		if(flag==1) {
			System.out.println("element found in the array!!!");
		}
		else {
			System.out.println("element not found!!!");
		}

	}

}
