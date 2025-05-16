package hust.soict.hedspi.aims.cart;

import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.Media;

// Manages a shopping cart for media items
public class Cart {
    private static final int MAX_ITEMS = 20;
    private ArrayList<Media> cartItems = new ArrayList<>();

    // Adds a media item to the cart
    public void addItem(Media item) {
        if (cartItems.size() >= MAX_ITEMS) {
            System.out.println("Cart is full!");
            return;
        }
        if (cartItems.contains(item)) {
            System.out.println("Item already in cart!");
        } else {
            cartItems.add(item);
            System.out.println("Item added to cart.");
        }
    }

    // Removes a media item from the cart
    public void removeItem(Media item) {
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty!");
        } else if (cartItems.remove(item)) {
            System.out.println("Item removed from cart.");
        } else {
            System.out.println("Item not found in cart!");
        }
    }

    // Calculates total cost of items in cart
    public float calculateTotal() {
        return (float) cartItems.stream()
                .mapToDouble(Media::getCost)
                .sum();
    }

    // Displays all items in the cart
    public void showCart() {
        System.out.println("=== Shopping Cart ===");
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (int i = 0; i < cartItems.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, cartItems.get(i).toString());
            }
        }
        System.out.println("Total: $" + calculateTotal());
        System.out.println("====================");
    }

    // Searches for an item by ID
    public Media findById(int id) {
        return cartItems.stream()
                .filter(item -> item.matchesId(id))
                .findFirst()
                .orElseGet(() -> {
                    System.out.println("No item found with ID: " + id);
                    return null;
                });
    }

    // Searches for an item by title
    public Media findByTitle(String title) {
        return cartItems.stream()
                .filter(item -> item.matchesTitle(title))
                .findFirst()
                .orElseGet(() -> {
                    System.out.println("No item found with title: " + title);
                    return null;
                });
    }

    // Clears all items from the cart
    public void clearCart() {
        cartItems.clear();
        System.out.println("Cart cleared.");
    }

    // Sorts cart items by title then cost
    public void sortByTitleThenCost() {
        cartItems.sort(Media.SORT_BY_TITLE_THEN_PRICE);
    }

    // Sorts cart items by cost then title
    public void sortByCostThenTitle() {
        cartItems.sort(Media.SORT_BY_PRICE_THEN_TITLE);
    }
}