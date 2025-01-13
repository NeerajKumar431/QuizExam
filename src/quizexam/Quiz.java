package quizexam;

import java.util.Scanner;

public class Quiz {
    
   
    
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the username");
        String userName = scanner.nextLine();
        System.out.println("Enter the password");
        String password = scanner.nextLine();
        startQuiz(userName, password);
    }
    
    private static  void startQuiz(String username , String password){
        Scanner scanner2 = new Scanner(System.in);
        EmailVerification obj=new EmailVerification();
        int marks = 0;
        String repeat;
        String repeat1;
        
        boolean verift = obj.verificationAccount(username, password);
        if(verift ==true){
            
        do {
            
            String questions[] = {
                "Q1: What is Artificial Intelligence (AI)? \n A:Software \n B:Simulation \n C:Database \n D:Programming \n",
                "Q2: Which of the following is an example of supervised learning? \n A:Clustering \n B:Predicting \n C:Anomaly \n D:Identifying \n",
                "Q3: What does Azure Cognitive Services enable? \n A:Building \n B:Integrating \n C:Hosting \n D:Developing \n",
                "Q4: Which service is used for speech-to-text conversion in Azure? \n A:Vision \n B:Translator \n C:Speech \n D:Text \n",
                "Q5; What is a key feature of unsupervised learning? \n A:Labeled \n B:Groups \n C:Predicts \n D:Reinforcement \n",};
            char resultKey[] = {'b', 'b', 'b', 'c', 'b'};
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                char ans = scanner2.next().charAt(0);
                if (ans == resultKey[i]) {
                    marks++;
                }
            }
            System.out.println("You got " + marks + "/5 marks");
            System.out.println("Do you want to take it again");
            repeat1 = scanner2.nextLine();
            repeat = scanner2.nextLine();
        } while (repeat.equalsIgnoreCase("yes"));
        
        }else{
            System.out.println("Invaled Account");
        }
    }
}
