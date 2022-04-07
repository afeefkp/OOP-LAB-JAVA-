import java.util.*;

public class MatrixSym{
	public static void main(String args[]){
		int i,j,a,flag;
		int x[][]=new int[50][50];
		int y[][]=new int[50][50];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows/columns of the symmetric matrix: ");
		a=sc.nextInt();
		System.out.println("enter the elements of the matrix: \n");
		for(i=0;i<a;i++){
			for(j=0;j<a;j++){
				x[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix: ");
		for(i=0;i<a;i++){
			for(j=0;j<a;j++){
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("The transpose matrix is: ");
		for(i=0;i<a;i++){
			for(j=0;j<a;j++){
				y[i][j]=x[j][i];
			}
			
		}
		for(i=0;i<a;i++){
			for(j=0;j<a;j++){
				System.out.print(y[i][j]+" ");
			}
			System.out.println();
			
		}
		flag=1;
		for(i=0;i<a;i++){
			for(j=0;j<a;j++){
				if(x[i][j]!=y[i][j]){
					flag=0;
					break;
				}
			}
			
		}
		if(flag==1){
			System.out.println("Matrix is symmetric");
		}
		else{
			System.out.println("Matrix is not symmetric");
		}
	}
}