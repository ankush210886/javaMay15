package AssignmentSahil.AssignmentJuly5thSahil;

public class MemberDiscount implements Discount{

    @Override
    public double applyDiscount(double price) {
        boolean isMembers = true;
        if (isMembers == true){
           return price * 0.90; //10% percent
        }
        return price;
    }
}
