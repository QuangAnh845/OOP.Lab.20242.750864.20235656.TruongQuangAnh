package Aims;

public class Cart {

    // Maximum number of discs allowed in the cart
    public static final int MAX_ITEMS_ORDERED = 20;

    // Array to hold discs
    private DigitalVideoDisc[] discList = new DigitalVideoDisc[MAX_ITEMS_ORDERED];

    // Current number of discs in the cart
    private int currentSize = 0;

    // Add a single disc
    public void addDisc(DigitalVideoDisc disc) {
        if (currentSize >= MAX_ITEMS_ORDERED) {
            System.out.println("Cart is almost full");
            return;
        }
        discList[currentSize++] = disc;
        System.out.println("Disc added to cart.");
    }

    // Add multiple discs
    public void addMultipleDiscs(DigitalVideoDisc... discs) {
        for (DigitalVideoDisc disc : discs) {
            addDisc(disc);
        }
    }

    // Add two discs
    public void addTwoDiscs(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        addDisc(disc1);
        addDisc(disc2);
    }

    // Remove a disc from the cart
    public void removeDisc(DigitalVideoDisc disc) {
        boolean removed = false;
        for (int i = 0; i < currentSize; i++) {
            if (discList[i] == disc) {
                // Shift remaining discs left
                for (int j = i; j < currentSize - 1; j++) {
                    discList[j] = discList[j + 1];
                }
                discList[currentSize - 1] = null;
                currentSize--;
                removed = true;
                System.out.println("Disc removed from cart.");
                break;
            }
        }
        if (!removed) {
            System.out.println("Disc not found in cart.");
        }
    }

    // Calculate total cost of all discs
    public float calculateTotalCost() {
        float sum = 0;
        for (int i = 0; i < currentSize; i++) {
            sum += discList[i].getCost();
        }
        return sum;
    }

    public void displayCart() {
    System.out.println("Cart Items:");
    for (int i = 0; i < currentSize; i++) {
        System.out.println((i + 1) + ". " + discList[i].getTitle() + " " + discList[i].getCost());
    }
    System.out.println("Total Cost: " + calculateTotalCost());
}

}

