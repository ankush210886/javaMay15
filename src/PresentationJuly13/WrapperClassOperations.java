package PresentationJuly13;

public class WrapperClassOperations {
    public static void main(String[] args) {

        int num = 7; //num is primitive type

        //num1 is a reference variable
        Integer num1 = new Integer(num); //boxing

        //automatically converted into an object
        Integer num2 = num; //autoboxing
        //when the primitive data value is stored in the object automatically

        int num3 = num1.intValue(); //unboxing
        //when you take out the primitive data value from the object

        int num4 = num1; //auto unboxing

        System.out.println("primitive data type: "+num);
        System.out.println("object data value (Manual boxing): "+num1);
        System.out.println("Autoboxing: "+num2);
        System.out.println("unboxing: "+num3);
        System.out.println("Auto-unboxing: "+num4);
    }
}
