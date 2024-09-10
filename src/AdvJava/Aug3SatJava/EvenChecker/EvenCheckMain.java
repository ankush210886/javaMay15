package AdvJava.Aug3SatJava.EvenChecker;


public class EvenCheckMain {
    public static void main(String[] args) {

        double random = (int) (Math.random()*100) + 1;
        Number number = Number.builder().number(random).build();

        checker(number, num -> num % 2 == 0);
    }

    public static void checker(Number number, IEvenChecker check){
        if (check.evenChecker(number.getNumber())){
            System.out.println(number.getNumber() + " is even.");
        } else{
            System.out.println(number.getNumber() + " is odd.");
        }
    }
}
