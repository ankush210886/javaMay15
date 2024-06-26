package June18th;

public class ExcelDemoMain {
    public static void main(String[] args) {
        //read singleton classes
        ExcelDemo demo = new ExcelDemo(true, true);
        demo.showPermission();
        demo.setWrite(false);
        demo.showPermission();
    }
}
