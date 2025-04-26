package hust.soict.hedspi.aims.media;

import java.util.Comparator;

// Comparator for sorting media by title then cost
public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media first, Media second) {
        int titleComparison = first.getTitle().compareTo(second.getTitle());
        return titleComparison != 0 ? titleComparison : 
               Float.compare(first.getCost(), second.getCost());
    }
}