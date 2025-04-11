package Aims;

public class Aims {
	public static void main(String[] args) {
		// Create a new cart to hold DVDs
        Cart myCart = new Cart();

        // Create and add the first DVD
        DigitalVideoDisc lionKing = new DigitalVideoDisc(
            "The Lion King", "Animation", "Roger Allers", 87, 19.95f
        );
        myCart.addDisc(lionKing);

        // Create and add the second DVD
        DigitalVideoDisc starWars = new DigitalVideoDisc(
            "Star Wars", "Science Fiction", "George Lucas", 82, 24.95f
        );
        myCart.addDisc(starWars);

        // Create and add the third DVD using a different constructor
        DigitalVideoDisc aladin = new DigitalVideoDisc(
            "Aladin", "Animation", 18.99f
        );
        myCart.addDisc(aladin);

        // Display total cost of DVDs in the cart
        myCart.displayCart();
        
        // Create and add a fourth DVD, then remove it
        DigitalVideoDisc frozen = new DigitalVideoDisc(
            "Frozen", "Animation", "Disney", 100, 20.00f
        );
        myCart.addDisc(frozen);

        System.out.println("Removing disc...");
        myCart.removeDisc(frozen);

        // Show how many DVDs have been created so far
        System.out.println("Total discs created: " + DigitalVideoDisc.getNumDigitalVideoDisc());

	}
}
