package June18th;

public class ExcelDemo {
    private boolean read;
    private boolean write;

    //constructor can be made private - but wont allow you to create object in another class
    public ExcelDemo(boolean read, boolean write) {
        this.read = read;
        this.write = write;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isWrite() {
        return write;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    public void showPermission() {
        System.out.println(read);
        System.out.println(write);

        if (read == true && write == true){
            System.out.println("Read & Write permission");
        }else {
            System.out.println("Only readable");
        }
    }
}