package June22ndJavaSat.AbstractExample;

public class AudioPlayer extends MediaDevice{

    private String songName = "Unforgiven II";
    private String artist = "Metallica";

    void play(){
        System.out.println("Touch to play or stop the song "+songName+" by "+artist);
    }

    public void displayDetails(){
        System.out.println("This is an audio player named as Walkman");
    }
}