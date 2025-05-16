package hust.soict.hedspi.aims.media;

import java.util.Comparator;

// Comparator for sorting media by cost then title
public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media first, Media second) {
        int costComparison = Float.compare(first.getCost(), second.getCost());
        return costComparison != 0 ? costComparison : 
               first.getTitle().compareTo(second.getTitle());
    }
}