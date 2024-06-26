package June25thTue;

public class IPhone extends Phones implements AppStore, AssistiveAI, Calculator, Camera, Computer{
    @Override
    public void iosApps() {
        System.out.println("Downloading iosApps");
    }

    @Override
    void phones() {
        super.phones();
    }

    @Override
    public void voiceSpeech() {
        System.out.println("Siri helps with voice command");
    }

    @Override
    public void calculator() {
        System.out.println("Run calculations");
    }

    @Override
    public void takePics() {
        System.out.println("camera take pictures");
    }

    @Override
    public void surfInternet() {
        System.out.println("internet communicator");
    }
}