import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no of elements of array: ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0; i < n; i++) {

            a[i] = s.nextInt();
        }
        System.out.println("elements of array:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

}
