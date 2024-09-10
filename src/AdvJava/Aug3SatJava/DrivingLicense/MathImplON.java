package AdvJava.Aug3SatJava.DrivingLicense;

public class MathImplON implements IMathUtil{
    @Override
    public Boolean check(Integer num) {
        return num>18;
    }
}
