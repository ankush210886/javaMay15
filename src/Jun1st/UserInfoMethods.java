package Jun1st;

public class UserInfoMethods {

        public String input(String name){

            return "Hello " + name;
        }

        public String input(String name, String email){

            return "Hello " + name +", your email is " + email;
        }

        public String input(String name, String email, String pwd){

            return "Hello " + name + "! Your email id is " + email + ", and password is " + pwd;
    }
}
