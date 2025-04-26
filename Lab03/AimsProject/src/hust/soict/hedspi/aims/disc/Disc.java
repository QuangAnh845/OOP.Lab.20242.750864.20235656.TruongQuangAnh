package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.media.Media;

// Base class for disc-based media
public class Disc extends Media {
    private int duration;
    private String directorName;

    public Disc(String title) {
        super(title);
    }

    public Disc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public Disc(int id, String title, String category, float cost, int duration) {
        super(id, title, category, cost);
        this.duration = duration;
    }

    public Disc(int id, String title, String category, float cost, String director) {
        super(id, title, category, cost);
        this.directorName = director;
    }

    public Disc(int id, String title, String category, float cost, int duration, String director) {
        super(id, title, category, cost);
        this.duration = duration;
        this.directorName = director;
    }

    public String getDirector() {
        return directorName;
    }

    public int getLength() {
        return duration;
    }
}