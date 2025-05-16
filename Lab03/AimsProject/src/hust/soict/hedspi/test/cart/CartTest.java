package hust.soict.hedspi.test.cart;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King",
                "Animation", 19.95f, 87, "Roger Allers");
        cart.addItem(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars",
                "Science Fiction", 24.95f, 87, "George Lucas");
        cart.addItem(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"Aladin",
                "Animation", 18.99f);
        cart.addItem(dvd3);

        // Test the print method
        cart.showCart();

        // To-do: Test the search methods here
        System.out.println(cart.findById(1).toString());
        System.out.println(cart.findByTitle("The Lion King").toString());
    }
}