package May18th;

public class logicalOp {
    public static void main(String[] args){

        int x=10;
        int y=20;
        int a=15;
        int b=25;

        System.out.println(x<y); //true
        System.out.println(a==b); //false
        System.out.println(a!=b); //true

        boolean result = b>=a;

        System.out.println(result);


        // Logical operators
        // && - AND
        // || - OR
        // ! - NOT


        /*   AND (&&) Operator                             OR (||) Operator
        cond1       cond2       result              cond1       cond2       result
        True        True        True                True        True        True
        True        False       False               True        False       True
        False       True        False               False       True        True
        False       False       False               False       False       False
         */

            // NOT - !
        /*
        cond1       cond2       result
        True        True        True
        True        False       False
        False       True        False
        False       False       False
         */
        
    }
}
