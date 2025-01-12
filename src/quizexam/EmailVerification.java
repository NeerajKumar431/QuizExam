package quizexam;

import java.util.Scanner;

public class EmailVerification {

    //public static void main(String[] arg) {
       // Scanner scanner = new Scanner(System.in);
        String  usernames[] = {"user1", "test2", "guest3", "Admin14", "hello5", "welcome6", "friend7", "start8", "demo9", "cool0"};
        String  passwords[] = {"simple1", "login2", "welcome3", "access4", "world5", "bright6", "happy7", "easy8", "pass9", "fail10"};

//        boolean verify =  verificationAccount(userName, password, usernames, passwords);
//        if (verify == true) {
//            System.out.println("Account is registered");
//        } else {
//            System.out.println("Account does not exist");
//        }
    //}

    public  boolean verificationAccount(String userName, String password) {
        boolean verification = false;
        for (int i = 0; i < usernames.length; i++) {
            if (userName.equals(usernames[i]) && password.equals(passwords[i])) {
                verification = true;
            }
        }
        return verification;

    }
}
