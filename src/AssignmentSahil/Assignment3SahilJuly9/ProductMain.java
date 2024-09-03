package AssignmentSahil.Assignment3SahilJuly9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) throws ProductNotFoundException {

        ProductManager productManager = new ProductManager();

        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to the Inventory Management System");

        while (!exit) {
            System.out.println("Choose from the below options");
            System.out.println("1. Add products: ");
            System.out.println("2. Remove products: ");
            System.out.println("3. Update products: ");
            System.out.println("4. Show all products: ");
            System.out.println("5. Find product by 'ID': ");
            System.out.println("6. View last 5 products: ");
            System.out.println("7. Exit the system: ");
            try {
                   int input = scan.nextInt();
                    scan.nextLine();
                    switch (input) {
                        case 1:
                            productManager.addProduct();
                            break;
                        case 2:
                            if (productManager.checkArrayIfEmpty() == true){
                                System.out.println("No products to display.\n");
                                break;
                            }
                            productManager.showProducts();
                            System.out.println("\nEnter the Product ID you want to remove: ");
                            String idToRemove = scan.nextLine();
                            productManager.removeProduct(idToRemove);
                            break;
                        case 3:
                            productManager.showProducts();
                            System.out.println("Enter the product ID for the product you wish to update:");
                            String findId = scan.nextLine();
                            productManager.updateProduct(findId);
                            break;
                        case 4:
                            productManager.showProducts();
                            break;
                        case 5:
                            productManager.showProducts();
                            System.out.println("Enter the product ID");
                            String idToFind = scan.nextLine();
                            productManager.findProductById(idToFind);
                            break;
                        case 6:
                            productManager.recentlyViewedProducts();
                            break;
                        case 7:
                            System.out.println("Exiting...!!!");
                            exit = true;
                            return;
                        default:
                            System.out.println("Invalid input.");
                    }
            }   catch(InputMismatchException e){
                    System.out.println("Enter input from 1 to 7");
                    scan.nextLine();
            }
        }
    }
}