package AssignmentSahil.Assignment3SahilJuly9;

import java.util.*;

public class ProductManager {

    private ArrayList<Product> productList = new ArrayList<>();
    private LinkedList<Product> recentlyViewedProducts = new LinkedList<>();
    Scanner scan = new Scanner(System.in);

    public boolean checkArrayIfEmpty(){
       return productList.isEmpty();
    }


    //Method to List all products
    void showProducts() {
        if (!checkArrayIfEmpty()) {
            System.out.println("\nTotal Products in the list are: ");
            System.out.println(productList+"\n");
        } else {
            System.out.println("There are no products to display. Show product function\n");
        }
    }

    //Method to add a product in the ArrayList
    public void addProduct() {
        String cont = "y";
        while (cont.equalsIgnoreCase("Y")) {
            System.out.println("Enter the product ID:");
            String id = scan.nextLine();
            System.out.println("Enter the product name:");
            String name = scan.nextLine();
            boolean checkPrice = false;
            double price = -1;
            while (!checkPrice) {
                System.out.println("Enter the product price:");
                price = scan.nextDouble();
                try {
                    if (price < 0) {
                        throw new IllegalArgumentException("Product price cannot be negative\n");
                    } else {
                        checkPrice = true;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            int quantity = -1;
            boolean checkQty = false;
            while (!checkQty) {
                System.out.println("Enter the product quantity:");
                quantity = scan.nextInt();
                scan.nextLine();
                try {
                    if (quantity < 0) {
                        throw new IllegalArgumentException("Product quantity cannot be negative.\n");
                    } else {
                        checkQty = true;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            productList.add(new Product(id, name, price, quantity));
            System.out.println("\nProduct added successfully.");

            System.out.println("\nEnter 'Y' if you want to add more products or press any key to continue:");
            cont = scan.nextLine();
        }
    }

    //Method to remove a prduct from the ArrayList
    public void removeProduct(String idToRemove){
        boolean productFound = false;
        try {
            Iterator<Product> iterator = productList.iterator();
            while (iterator.hasNext()) {
                Product productToRemove = iterator.next();
                if (productToRemove.getId().equalsIgnoreCase(idToRemove)){
                    iterator.remove();
                    System.out.println("Following product has been removed from the product list: "+productToRemove);
                    productFound = true;
                    if (!checkArrayIfEmpty()) {
                        showProducts();
                    }
                }
            }
            if(!productFound){
                throw new ProductNotFoundException("Incorrect Product ID.\n");
            }
        }catch (ProductNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    void updateProduct(String findIdToUpdate) throws ProductNotFoundException{
        try{
            if (!productList.isEmpty()){
                for (Product updateProduct : productList){
                    if (updateProduct.getId().equalsIgnoreCase(findIdToUpdate)){
                        boolean done = false;
                        while(!done){
                            System.out.println("Choose an option?");
                            System.out.println("Press 1 to update Product ID.");
                            System.out.println("Press 2 to update Product Name.");
                            System.out.println("Press 3 to update Product Price.");
                            System.out.println("Press 4 to update Product Quantity.");
                            System.out.println("Press 5 to if all updates are done.");
                            int input = scan.nextInt();
                            scan.nextLine();
                            switch(input) {
                                case 1:
                                    System.out.println("Enter new product ID: ");
                                    String updatedId = scan.nextLine();
                                    updateProduct.setId(updatedId);
                                    break;
                                case 2:
                                    System.out.println("Enter new product name: ");
                                    String updatedName = scan.nextLine();
                                    updateProduct.setName(updatedName);
                                    break;
                                case 3:
                                    System.out.println("Enter new product price: ");
                                    double updatedPrice = scan.nextDouble();
                                    updateProduct.setPrice(updatedPrice);
                                    break;
                                case 4:
                                    System.out.println("Enter new product quantity: ");
                                    int updatedQuantity = scan.nextInt();
                                    updateProduct.setQuantity(updatedQuantity);
                                    break;
                                case 5:
                                    System.out.println("All updates done!\n");
                                    done = true;
                                    return;
                                default:
                                    System.out.println("Invalid Selection!");
                            }
                        }
                        System.out.println("New product details are:");
                        System.out.println("Product ID is: "+updateProduct.getId());
                        System.out.println("Product Name is: "+updateProduct.getName());
                        System.out.println("Price of the product is: "+updateProduct.getPrice());
                        System.out.println("Quantity available is: "+updateProduct.getQuantity());
                        System.out.println("\nProduct updated.\n");
                    } /*else {
                        System.out.println("Product ID not found.\n");
                    }*/
                }
            }else {
                throw new ProductNotFoundException("No product available to update.\n");
            }
        }catch (ProductNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    void findProductById(String id) /*throws ProductNotFoundException*/{
        for (Product findProduct : productList) {
                if (findProduct.getId().equalsIgnoreCase(id)) {
                    System.out.println("Product ID is: " + findProduct.getId());
                    System.out.println("Product Name is: " + findProduct.getName());
                    System.out.println("Price of the product is: " + findProduct.getPrice());
                    System.out.println("Quantity available is: " + findProduct.getQuantity());
                    System.out.println();
                    if (recentlyViewedProducts.size() >= 5) {
                        recentlyViewedProducts.removeFirst();
                    }
                    recentlyViewedProducts.addLast(findProduct);
                }else{
                    System.out.println("Product ID not found.\n");
                }
            }
        }

    void recentlyViewedProducts(){
        if (!recentlyViewedProducts.isEmpty()){
            System.out.println("Last 5 viewed products are:");
            System.out.println(recentlyViewedProducts+"\n");
        }else {
            System.out.println("The list is empty.\n");
        }
    }

}