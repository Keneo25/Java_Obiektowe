package Song_Pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Song {
    String title;
    String arrtist;
    int duration;

    public Song(String title, String arrtist, int duration) {
        this.title = title;
        this.arrtist = arrtist;
        this.duration = duration;
    }


    public String getTitle() {
        return title;
    }

    public String getArrtist() {
        return arrtist;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", arrtist='" + arrtist + '\'' +
                ", duration=" + duration +
                '}';
    }
}



class DurationComparator implements Comparator<Song> {


    @Override
    public int compare(Song o1, Song o2) {
        return Integer.compare(o1.getDuration() , o2.getDuration());
    }

}

class ArtistTitleComparator implements Comparator<Song>{


    @Override
    public int compare(Song o1, Song o2) {
        if(o1.getArrtist() == o2.getArrtist()){
            return o1.getTitle().compareTo(o2.getTitle());
        }
        return o1.getArrtist().compareTo(o2.getArrtist());
    }
}
class SongTest{
    public static void main(String[] args) {
        Song[] songs = {
          new Song("R", "PlayBoi Cati", 30),
                new Song("RR", "Yeat", 50),
                new Song("RRRR", "Yravis Scott", 70),
                new Song("RRR", "Tippie Redd", 70),
                new Song("RRRRR", "Ken Carson", 80)
        };

        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));

        for(Song song : songs){
            System.out.println(song);
        }


    }


}
