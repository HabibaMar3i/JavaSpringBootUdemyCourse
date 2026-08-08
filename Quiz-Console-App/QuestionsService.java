
import java.util.Scanner;

public class QuestionsService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionsService() {
        questions[0] = new Question(1, "What is the size of char in Java?", "1 byte", "2 bytes", "4 bytes", "8 bytes", "2 bytes");
        questions[1] = new Question(2, "What is the size of double in Java?", "4 bytes", "8 bytes", "16 bytes", "1 byte", "8 bytes");
        questions[2] = new Question(3, "What is the size of int in Java?", "2 bytes", "4 bytes", "8 bytes", "16 bytes", "4 bytes");
        questions[3] = new Question(4, "What is the size of float in Java?", "2 bytes", "4 bytes", "8 bytes", "16 bytes", "4 bytes");
        questions[4] = new Question(5, "What is the size of long in Java?", "4 bytes", "8 bytes", "16 bytes", "32 bytes", "8 bytes");
    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        System.out.println("Answers: ");
        for (String s : selection) {
            System.out.println(s);
        }
    }
}
