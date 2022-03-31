import java.util.Scanner;

public class MATRIXADD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows of array:");
        int m = sc.nextInt();
        System.out.println("enter the no of columns of array:");
        int n = sc.nextInt();

        int array1[][] = new int[m][n];
        int array2[][] = new int[m][n];

        System.out.println("enter the elements of first array:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the elements of second array:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array2[i][j] = sc.nextInt();
            }
        }

        System.out.println("elements of first array:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("elements of second array:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        int array3[][] = new int[m][n];

        System.out.println("The resultant matrix after the addition of two matrices: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((array3[i][j] = array1[i][j] + array2[i][j]) + " ");
            }
            System.out.println();
        }

    }

}
