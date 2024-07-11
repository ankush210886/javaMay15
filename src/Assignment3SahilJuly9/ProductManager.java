package Assignment3SahilJuly9;

import sun.awt.image.ImageWatched;

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
    public void addProduct(Product product) throws IllegalArgumentException{
       if (product.getPrice() < 0){
           throw new IllegalArgumentException("Product price cannot be negative");
       }
       productList.add(product);
    }

    void removeProduct(String id) throws ProductNotFoundException{
        if (productList.isEmpty()) {
            System.out.println("The product list is empty! There is nothing to remove.");
        }else {
            for (Product productToRemove : productList) {
                if (productToRemove.getId().equalsIgnoreCase(id)) {
                    productList.remove(productToRemove);
                    System.out.println("Following product has been removed from the products list:" + productToRemove);
                    System.out.println("\nNew products list is:");
                    showProducts();
                }
            }
        }
    }


    void update(){}

    void findProductById(String id) throws ProductNotFoundException{

    }

}

