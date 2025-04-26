package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Comparator;

// Abstract base class for all media types
public abstract class Media {
    private int mediaId;
    private String mediaTitle;
    private String mediaCategory;
    private float mediaPrice;
    private ArrayList<Media> mediaCollection = new ArrayList<Media>();

    public static final Comparator<Media> SORT_BY_PRICE_THEN_TITLE = new MediaComparatorByCostTitle();
    public static final Comparator<Media> SORT_BY_TITLE_THEN_PRICE = new MediaComparatorByTitleCost();

    public Media(String title) {
        this.mediaTitle = title;
    }

    public Media(int id, String title, String category, float price) {
        this.mediaId = id;
        this.mediaTitle = title;
        this.mediaCategory = category;
        this.mediaPrice = price;
    }

    public void updateTitle(String newTitle) {
        this.mediaTitle = newTitle;
    }

    public int getId() {
        return mediaId;
    }

    public String getTitle() {
        return mediaTitle;
    }

    public String getCategory() {
        return mediaCategory;
    }

    public float getCost() {
        return mediaPrice;
    }

    // Checks if media matches by title (case-insensitive)
    public boolean matchesTitle(String title) {
        return mediaTitle.equalsIgnoreCase(title);
    }

    // Checks if media matches by ID
    public boolean matchesId(int id) {
        return this.mediaId == id;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Media)) return false;
        Media other = (Media) obj;
        return this.mediaTitle.equals(other.mediaTitle);
    }
}