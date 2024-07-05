package June22ndJavaSat.AbstractExample;

public class ImageDisplay extends MediaDevice{
    private String name = "Mona Lisa";
    private String resolution = "FHD 1024 X 768";

    void displayImage(){
        System.out.println("The "+name+" image is displayed with a resolution of "+resolution+".");
    }

    public void displayDetails(){
        System.out.println("The image display device is 4K screen.");
    }
}
