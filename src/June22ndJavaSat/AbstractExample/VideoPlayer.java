package June22ndJavaSat.AbstractExample;

public class VideoPlayer extends MediaDevice {

        private String videoTitle = "Fortnight";
        private String duration = "3.50 mins";

        void play(){
                System.out.println("Touch to play or stop the video song titled "+videoTitle+" of duration "+duration+".");
        }

        public void displayDetails(){
            System.out.println("This is a video player named as iPod Touch.");
        }
}
