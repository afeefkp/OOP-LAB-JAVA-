import java.util.Scanner;

public class Product {
    int pcode;
    String pname;
    int price;

    public static void main(String[] args) {

        Product obj1 = new Product();
        Product obj2 = new Product();
        Product obj3 = new Product();

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the details of the first product");
        System.out.println("Enter the first product code: ");
        obj1.pcode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the first product name: ");
        obj1.pname = scan.nextLine();
        System.out.println("Enter the first product price: ");
        obj1.price = scan.nextInt();

        System.out.println("enter the details of the second product");
        System.out.println("Enter the second product code: ");
        obj2.pcode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the second product name: ");
        obj2.pname = scan.nextLine();
        System.out.println("Enter the second product price: ");
        obj2.price = scan.nextInt();

        System.out.println("enter the details of the third product");
        System.out.println("Enter the third product code: ");
        obj3.pcode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the third product name: ");
        obj3.pname = scan.nextLine();
        System.out.println("Enter the third product price: ");
        obj3.price = scan.nextInt();

        System.out.println("Product Code: " + obj1.pcode);
        System.out.println("Product Name: " + obj1.pname);
        System.out.println("Product Price: " + obj1.price + "\n");

        System.out.println("Product Code: " + obj2.pcode);
        System.out.println("Product Name: " + obj2.pname);
        System.out.println("Product Price: " + obj2.price + "\n");

        System.out.println("Product Code: " + obj3.pcode);
        System.out.println("Product Name: " + obj3.pname);
        System.out.println("Product Price: " + obj3.price + "\n");

        if (obj1.price < obj2.price && obj1.price < obj3.price) {
            System.out.println(obj1.pname + " have less price");
        } else if (obj2.price < obj1.price && obj2.price < obj3.price) {
            System.out.println(obj2.pname + " have less price");
        } else {
            System.out.println(obj3.pname + " have less price");
        }

    }

}