package Assignment3SahilJuly9;

import java.util.*;

public class ProductManager {

    private ArrayList<Product> productList = new ArrayList<>();
    private LinkedList<Product> recentlyViewedProducts = new LinkedList<>();
    Scanner scan = new Scanner(System.in);

    //Method to List all products
    void showProducts() {
        if (!productList.isEmpty()) {
                System.out.println(productList);
        }else {
            System.out.println("No products to display.");
        }
    }

    //Method to add a product in the ArrayList
    public void addProduct(Product product) {
        try {
            if (product.getPrice() < 0) {
                throw new IllegalArgumentException("Product price cannot be negative");
            }
            productList.add(product);
            System.out.println("Product added successfully.");
        } catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    // Method to remove  a product
 /*   public void removeProduct(String removeId) {
        try {
            if (!productList.isEmpty()) {
                boolean found = false;
                Iterator<Product> iterator = productList.iterator();
                while (iterator.hasNext()) {
                    Product productToRemove = iterator.next();
                    if (productToRemove.getId().equalsIgnoreCase(removeId)) {
                        iterator.remove();
                        System.out.println("Following product has been removed from the products list: " + productToRemove);
                        System.out.println("\nNew products list is:");
                        showProducts();
                        found = true;
                        break;
                    }
                }
            }
            if(!found){
                throw new ProductNotFoundException("Product with id " + removeId + " not found.");
        }catch(Exception e) {
                    System.out.println("Product with id " + removeId + " not found.");
                }
            }
        }
*/

    void updateProduct(String updatedId, String updatedName, double updatedPrice, int updatedQuantity) throws ProductNotFoundException{
        if (!productList.isEmpty()){
            for (Product updateProduct : productList){
                if (updateProduct.getId().equalsIgnoreCase(updatedId)){
                    updateProduct.setId(updatedId);
                    updateProduct.setName(updatedName);
                    updateProduct.setPrice(updatedPrice);
                    updateProduct.setQuantity(updatedQuantity);
                    System.out.println("New Product ID is: "+updateProduct.getId());
                    System.out.println("New Product Name is: "+updateProduct.getName());
                    System.out.println("New Price of the product is: "+updateProduct.getPrice());
                    System.out.println("New Quantity available is: "+updateProduct.getQuantity());
                    System.out.println("Product updated.");
                } else {
                    System.out.println("Product ID not found.");
                }
            }
        }else {
            System.out.println("No product available to update.");
        }
    }

    void findProductById(String id) throws ProductNotFoundException{
        for (Product findProduct : productList) {
            if (findProduct.getId().equalsIgnoreCase(id)) {
                System.out.println("Product ID is: "+findProduct.getId());
                System.out.println("Product Name is: "+findProduct.getName());
                System.out.println("Price of the product is: "+findProduct.getPrice());
                System.out.println("Quantity available is: "+findProduct.getQuantity());
            }
        }
    }

}