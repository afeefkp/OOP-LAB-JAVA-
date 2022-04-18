import java.util.Scanner;
public class StringSort {

	public static void main(String[] args) {
		String str="this is the first java program";
		System.out.print("The given string is: "+str);
		String[] s=str.split(" ");
		int sl=s.length;
		
		for(int i=0;i<sl-1;i++) {
			for(int j=i+1;j<sl;j++) {
				if(s[i].compareTo(s[j])>0) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					
				}
			}
		}
		System.out.println();
		System.out.print("The sorted string is: ");
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		

	}

}
