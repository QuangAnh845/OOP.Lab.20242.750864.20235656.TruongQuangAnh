package hust.soict.hedspi.aims.disc;

// Represents a DVD media item
public class DigitalVideoDisc extends Disc implements Playable {
    private static int dvdCount = 0;

    public DigitalVideoDisc(String title) {
        super(title);
        dvdCount++;
    }

    public DigitalVideoDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
        dvdCount++;
    }

    public DigitalVideoDisc(int id, String title, String category, float cost, String director) {
        super(id, title, category, cost, director);
        dvdCount++;
    }

    public DigitalVideoDisc(int id, String title, String category, float cost, int length) {
        super(id, title, category, cost, length);
        dvdCount++;
    }

    public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
        dvdCount++;
    }

    public static int getDvdCount() {
        return dvdCount;
    }

    @Override
    public String toString() {
        return String.format("DVD [ID: %d, Title: %s, Category: %s, Director: %s, Length: %d mins, Cost: $%.2f]",
                getId(), getTitle(), getCategory(), getDirector(), getLength(), getCost());
    }

    @Override
    public void play() {
        System.out.printf("Playing DVD: %s (Length: %d mins)%n", 
                         getTitle(), getLength());
    }
}