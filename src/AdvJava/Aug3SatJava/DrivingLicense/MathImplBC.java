package AdvJava.Aug3SatJava.DrivingLicense;

public class MathImplBC implements IMathUtil{
    @Override
    public Boolean check(Integer num) {
        return num > 16;
    }
}
