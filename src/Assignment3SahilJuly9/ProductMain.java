package Assignment3SahilJuly9;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) throws ProductNotFoundException {

        ProductManager productManager = new ProductManager();

        boolean exit = false;
        Scanner scan = new Scanner(System.in);

        while(!exit) {

            System.out.println("\nWelcome to the Inventory Management System");
            System.out.println("1. Add products: ");
            System.out.println("2. Remove products: ");
            System.out.println("3. Update products: ");
            System.out.println("4. Show all products: ");
            System.out.println("5. Find product by 'ID': ");
            System.out.println("6. Exit the system: ");

            int input = scan.nextInt();
            scan.nextLine();

            switch (input) {
                case 1:
                    String cont = "y";
                    while (cont.equalsIgnoreCase("Y")) {
                        System.out.println("Enter the product ID:");
                        String id = scan.nextLine();
                        System.out.println("Enter the product name:");
                        String name = scan.nextLine();
                        System.out.println("Enter the product price:");
                        double price = scan.nextDouble();
                        System.out.println("Enter the product quantity:");
                        int quantity = scan.nextInt();
                        scan.nextLine();
                        productManager.addProduct(new Product(id, name, price, quantity));
                        System.out.println("Product added.");

                        System.out.println("\nEnter 'Y' if you want to add more products or press any key to continue:");
                        cont = scan.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("\nTotal Products in the list are: ");
                    productManager.showProducts();
                    System.out.println("\nEnter the Product ID you want to remove: ");
                    String id = scan.nextLine();
                    productManager.removeProduct(id);
                    break;
                case 3:
                    break;
                case 4:
                    productManager.showProducts();
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Exiting...!!!");
                    exit = true;
                    return;
                default:
                    System.out.println("Invalid input.");
            }

        }
    }
}
