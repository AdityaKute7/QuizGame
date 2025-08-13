import java.util.*;
public class QuestionService {

    Questions[] questions = new Questions[5];
    String Selection []  = new String[5]; 

    public QuestionService(){
        questions[0] = new Questions("Default value of int in Java", "0", 1, "null", "0", "1", "-1");
        questions[1] = new Questions("Default value of boolean in Java", "false", 2, "true", "false", "0", "null");
        questions[2] = new Questions("Keyword used to inherit a class", "extends", 3, "implements", "extends", "inherit", "super");
        questions[3] = new Questions("Keyword used to implement an interface", "implements", 4, "extends", "implements", "interface", "super");
        questions[4] = new Questions("Java is a ___ language", "Object-Oriented", 5, "Procedural", "Object-Oriented", "Functional", "Scripting");
        questions[5] = new Questions("Entry point method of Java program", "main", 6, "start", "main", "run", "execute");
        questions[6] = new Questions("Package imported by default", "java.lang", 7, "java.util", "java.io", "java.lang", "java.net");
        questions[7] = new Questions("Operator for concatenation in Java", "+", 8, "+", "&", "concat", "*");
        questions[8] = new Questions("Symbol for single-line comments", "//", 9, "//", "/*", "<!--", "**");
        questions[9] = new Questions("Symbol for multi-line comments", "/* */", 10, "//", "/* */", "<!-- -->", "** **");
        questions[10] = new Questions("Keyword to create an object", "new", 11, "class", "new", "this", "super");
        questions[11] = new Questions("Keyword to refer to current object", "this", 12, "that", "this", "super", "self");
        questions[12] = new Questions("Keyword to call parent class constructor", "super", 13, "super", "this", "parent", "extends");
        questions[13] = new Questions("Loop that checks condition after execution", "do-while", 14, "for", "while", "do-while", "foreach");
        questions[14] = new Questions("Statement to exit from a loop", "break", 15, "break", "continue", "return", "exit");


    }
    public void playQuiz(){

        int i =0;
        for(Questions q : questions){
        System.out.println("Question No:" +q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());

        Scanner sc = new Scanner(System.in);
        Selection[i] =sc.nextLine();
        i++;

      }
      System.out.println("Yours Ans");
      
      for(String s:Selection){
        System.out.println(s);
      }
    }


    public void printScore(){
        int score = 0;
        for(int i= 0;i<questions.length;i++){
            Questions que = questions[i];
            String ActualAnswer = que.getAnswer();
            String UserAnswer = Selection[i];

            if(ActualAnswer.equals(UserAnswer)){
                score++;
            }

        }
        System.out.println("Score is : " +score);
    }
}
