package June22ndJavaSat.AbstractExample;

public class PlayerMain {
    public static void main(String[] args) {

        MediaDevice audio = new AudioPlayer();
        AudioPlayer audioPlayer = new AudioPlayer();

        MediaDevice video = new VideoPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();

        MediaDevice image = new ImageDisplay();
        ImageDisplay imageDisplay = new ImageDisplay();

        audio.displayDetails();
        audioPlayer.play();
        video.displayDetails();
        videoPlayer.play();
        image.displayDetails();
        imageDisplay.displayImage();

    }
}
