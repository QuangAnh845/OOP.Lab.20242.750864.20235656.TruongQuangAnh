package hust.soict.hedspi.aims.disc;

// Represents a single track on a CD
public class Track implements Playable {
    private String trackTitle;
    private int trackDuration;

    public Track(String title, int duration) {
        this.trackTitle = title;
        this.trackDuration = duration;
    }

    public String getTitle() {
        return trackTitle;
    }

    public int getLength() {
        return trackDuration;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Track)) return false;
        Track other = (Track) obj;
        return this.trackTitle.equals(other.trackTitle) && 
               this.trackDuration == other.trackDuration;
    }

    @Override
    public void play() {
        System.out.printf("Playing track: %s (Duration: %d mins)%n", 
                         trackTitle, trackDuration);
    }
}