package hust.soict.hedspi.aims.disc;

import java.util.ArrayList;
import java.util.List;

// Represents a CD media item with tracks
public class CompactDisc extends Disc implements Playable {
    private String cdArtist;
    private List<Track> cdTracks = new ArrayList<>();

    public CompactDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public CompactDisc(int id, String title, String category, float cost, String artist) {
        super(id, title, category, cost);
        this.cdArtist = artist;
    }

    public CompactDisc(int id, String title, String category, float cost, int length) {
        super(id, title, category, cost, length);
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }

    public CompactDisc(int id, String title, String category, float cost, String artist, List<Track> tracks) {
        super(id, title, category, cost);
        this.cdArtist = artist;
        this.cdTracks = new ArrayList<>(tracks);
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        super(id, title, category, cost, length, director);
        this.cdArtist = artist;
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist, List<Track> tracks) {
        super(id, title, category, cost, length, director);
        this.cdArtist = artist;
        this.cdTracks = new ArrayList<>(tracks);
    }

    // Adds a track to the CD
    public void includeTrack(Track track) {
        if (cdTracks.contains(track)) {
            System.out.println("Track already exists!");
        } else {
            cdTracks.add(track);
            System.out.println("Track added successfully.");
        }
    }

    // Removes a track from the CD
    public void excludeTrack(Track track) {
        if (cdTracks.remove(track)) {
            System.out.println("Track removed successfully.");
        } else {
            System.out.println("Track not found!");
        }
    }

    @Override
    public int getLength() {
        return cdTracks.stream()
                .mapToInt(Track::getLength)
                .sum();
    }

    public String getArtist() {
        return cdArtist;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(String.format("CD [ID: %d, Title: %s, Category: %s, Artist: %s, Length: %d mins, Cost: $%.2f]",
                getId(), getTitle(), getCategory(), cdArtist, getLength(), getCost()));
        if (!cdTracks.isEmpty()) {
            output.append("\nTrack List:");
            for (int i = 0; i < cdTracks.size(); i++) {
                output.append(String.format("\n  %d. %s (%d mins)", 
                        i + 1, cdTracks.get(i).getTitle(), cdTracks.get(i).getLength()));
            }
        }
        return output.toString();
    }

    @Override
    public void play() {
        System.out.printf("Playing CD: %s by %s%n", getTitle(), cdArtist);
        System.out.println("Tracks:");
        for (Track track : cdTracks) {
            track.play();
        }
    }
}