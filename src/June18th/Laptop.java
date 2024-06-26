package June18th;

public class Laptop {
    String windows;
    int ram;
    int ssd;
    String msOffice;

    public Laptop(String windows, int ram, int ssd, String msOffice){
        this.windows = windows;
        this.ram = ram;
        this.ssd = ssd;
        this.msOffice = msOffice;
    }

    public String toString(){
        return "Laptop";
    }

}
