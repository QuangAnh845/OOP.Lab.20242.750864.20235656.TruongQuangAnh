package Aims;

public class TestPassingParameter {

    public static void main(String[] args) {

        // Create two DVD objects with specific titles
        DigitalVideoDisc jungleDisc = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDisc = new DigitalVideoDisc("Cinderella");

        // Try to swap the two DVD references (this won't work as expected)
        swap(jungleDisc, cinderellaDisc);

        // Display the titles after the swap attempt
        System.out.println("Jungle disc title: " + jungleDisc.getTitle());
        System.out.println("Cinderella disc title: " + cinderellaDisc.getTitle());

        // Try to change the title of jungleDisc to "Cinderella"
        changeTitle(jungleDisc, cinderellaDisc.getTitle());

        // Display the title after changing it
        System.out.println("Jungle disc new title: " + jungleDisc.getTitle());
    }

    // Tries to swap the references of two objects, but doesn't affect the originals
    public static void swap(Object first, Object second) {
        Object temp = first;
        first = second;
        second = temp;
        // This swap only changes the local copies of the references
    }

    // Changes the title of a DVD object
    public static void changeTitle(DigitalVideoDisc disc, String newTitle) {
        String backupTitle = disc.getTitle();
        disc.setTitle(newTitle); // Actually changes the title of the passed object
        disc = new DigitalVideoDisc(backupTitle); // Creates a new object but it's not used outside
    }
}