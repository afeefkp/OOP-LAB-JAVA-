import java.util.Scanner;

public class ArrayTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of rows; ");
        int m = sc.nextInt();
        System.out.println("enter the no of columns; ");
        int n = sc.nextInt();
        int a[][] = new int[m][n];

        System.out.println("enter elements of array; ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("elements of array; ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}