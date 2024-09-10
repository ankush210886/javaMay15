package AdvJava.Aug3SatJava.DrivingLicense;

public class DLMain {
    public static void main(String[] args) {
        UserDriver driver = new UserDriver("Ank", "J", 35, "ON");

        UserDriver onDriver = UserDriver.builder().fName("Ankush").lName("J").age(35).province("ON").build();

        UserDriver bcDriver = UserDriver.builder().fName("Akshay").lName("J").age(15).province("BC").build();
        UserDriver skDriver = UserDriver.builder().fName("Akshay").lName("J").age(18).province("BC").build();
        UserDriver abDriver = UserDriver.builder().fName("Akshay").lName("J").age(21).province("BC").build();

        IMathUtil onUser = new MathImplON();
        IMathUtil bcUser = a -> a > 16;

        issueDL(onDriver, onUser);
        issueDL(bcDriver, bcUser);
        issueDL(skDriver, a -> a > 17); //IMathUtil skUser = a -> a > 17;
        issueDL(abDriver, a -> a > 20); //IMathUtil abUser = a -> a > 20;
        issueDL(bcDriver, a -> a > 20); //IMathUtil abUser = a -> a > 20;

    }

    public static void issueDL(UserDriver userDriver, IMathUtil provAgeCriteria){
        if (provAgeCriteria.check(userDriver.getAge())){
            System.out.println(userDriver.getProvince() + ":- DL issued" + " -> Age: "+userDriver.getAge());
        } else {
            System.out.println(userDriver.getProvince() + ":- DL denied" + " -> Age: "+userDriver.getAge());
        }
    }


}
