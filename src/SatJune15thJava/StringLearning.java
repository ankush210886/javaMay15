package SatJune15thJava;

public class StringLearning {
    public static void main(String[] args) {

        String str = new String("Hello, i am immutable");

        StringBuffer str1 = new StringBuffer("Hello, i can be modified");

        str1.append("!\nI told you!!!"); //appends at the end
        str1.insert(0, "Hey str1, Can you be modified? \n");
        //insert can modify the string anywhere in the string using offset
        System.out.println(str);
        System.out.println(str1);
    }
}